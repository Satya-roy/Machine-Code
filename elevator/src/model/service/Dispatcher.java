package model.service;

import model.request.Request;

import java.util.PriorityQueue;

public class Dispatcher {
    PriorityQueue<Request> upQueue;
    PriorityQueue<Request> downQueue;
}
