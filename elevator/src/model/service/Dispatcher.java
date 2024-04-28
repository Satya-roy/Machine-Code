package model.service;

import model.Direction;
import model.ElevatorCar;
import model.repository.ElevatorSystemRepository;
import model.request.InsideRequest;
import model.request.Request;

import java.util.List;
import java.util.PriorityQueue;

public class Dispatcher {
    PriorityQueue<Request> upQueue;
    PriorityQueue<Request> downQueue;
    ElevatorSystemRepository elevatorSystemRepository;

    public Dispatcher(ElevatorSystemRepository elevatorSystemRepository) {
        this.elevatorSystemRepository = elevatorSystemRepository;
        //Min heap
        upQueue = new PriorityQueue<>();
        //Max heap
        downQueue = new PriorityQueue<>((a, b) -> b.getFloor() - a.getFloor());
    }
    // Driver class call the function to cater the request
    public void processElevatorRequest(InsideRequest request) {
        if(request.getDirection() == Direction.UP) {
            sendUpRequest(request);
        } else {
            sendDownRequest(request);
        }
    }

    public void sendUpRequest(Request upRequest) {
        //if elevator is idle at the current floor
        List<ElevatorCar> allIdleElevatorsAtFloor = elevatorSystemRepository.getAllIdleElevatorsAtFloor(upRequest.getFloor());
        if(!allIdleElevatorsAtFloor.isEmpty()) {
            ElevatorCar elevatorCar  = allIdleElevatorsAtFloor.get(0);
            elevatorCar.call(upRequest);
        } else {
            /*irrespective of the request type the upQueue will cater the request
            that require the elevator to go up*/
            upQueue.offer(upRequest);
            System.out.println("Append up request going to the floor " + upRequest.getFloor());
        }
    }

    public void sendDownRequest(Request downRequest) {
        List<ElevatorCar> allIdleElevatorsAtFloor = elevatorSystemRepository.getAllIdleElevatorsAtFloor(downRequest.getFloor());
        if(!allIdleElevatorsAtFloor.isEmpty()) {
            ElevatorCar elevatorCar  = allIdleElevatorsAtFloor.get(0);
            elevatorCar.call(downRequest);
        } else {
            downQueue.offer(downRequest);
            System.out.println("Append down request going to the floor " + downRequest.getFloor());
        }
    }

    public void run() {
        while(!upQueue.isEmpty() || !downQueue.isEmpty()) {
            processRequest();
        }

        System.out.println("Finished all requests");
    }

    private void processRequest() {
        // write the logic to cater the request assign the elevator
    }
}
