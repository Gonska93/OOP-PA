package org.mediatheque.model.member;

import org.mediatheque.controller.MemberController;

public abstract class Member {
    private String name;
    private String surname;
    private String password;
    private MemberController memberController;

    public Member(String name, String surname, String password) {
        this.name = name;
        this.surname = surname;
        this.password = password;
    }

    public boolean verifyMember() {
        return true;
    }

    public void setMemberController(MemberController memberController)  {
        this.memberController = memberController;
    }
}
