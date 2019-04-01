package org.mediatheque.controller;

import org.mediatheque.model.member.Manager;
import org.mediatheque.view.menu.Menu;

public class MenuController {
    private Menu menu;
    private MemberController memberController;

    public MenuController() {
        menu = new Menu();
        memberController = new MemberController(new Manager("", "", ""));
    }
}
