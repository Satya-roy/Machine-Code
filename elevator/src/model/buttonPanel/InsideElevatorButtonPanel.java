package model.buttonPanel;

import model.request.Request;
import model.service.Dispatcher;

public class InsideElevatorButtonPanel implements ButtonPanel{
    int floor;
    //TODO : Add display
    Dispatcher dispatcher;
    public InsideElevatorButtonPanel(int floor, Dispatcher dispatcher) {
        this.floor = floor;
        this.dispatcher = dispatcher;
    }

    @Override
    public boolean sendInstructionToDispatcher(Request request) {
        // TODO : processElevatorRequest
        return true;
    }
}
