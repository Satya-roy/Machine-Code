package model;

import model.buttonPanel.ButtonPanel;

public class Floor {
    int floorId;
    ButtonPanel buttonPanel;

    public Floor(int floorId, ButtonPanel buttonPanel) {
        this.floorId = floorId;
        this.buttonPanel = buttonPanel;
    }

    public int getFloorId() {
        return floorId;
    }
}
