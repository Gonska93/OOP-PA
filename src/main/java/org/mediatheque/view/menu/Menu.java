package org.mediatheque.view.menu;

import java.util.HashMap;
import java.util.Map;

public class Menu implements Displayable {
    private Map<Integer, MenuOption> options;

    public Menu() {
        options = new HashMap<Integer, MenuOption>();
    }

    public void display() {

    }
}
