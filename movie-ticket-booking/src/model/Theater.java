package model;

import java.util.List;

public class Theater {
    private final String id;
    private final String name;
    private final List<Screen> screens;

    public Theater(final String id, final String name, final List<Screen> screens) {
        this.id = id;
        this.name = name;
        this.screens = screens;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public List<Screen> getScreens() {
        return screens;
    }
}
