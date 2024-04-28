package model.buttonPanel;

import model.request.Request;

public interface ButtonPanel {
    boolean sendInstructionToDispatcher(Request request);
}
