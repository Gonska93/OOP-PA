package org.mediatheque.controller;

import org.mediatheque.model.Library;
import org.mediatheque.model.item.MediaItem;
import org.mediatheque.model.member.Manager;
import org.mediatheque.model.member.Member;

public class MemberController {
    private Library library;
    private Member member;

    public MemberController(Member member) {
        library = Library.getInstance();
        this.member = member;
    }

    public void addItem(MediaItem item) {
        if (!(member instanceof Manager)) throw new SecurityException("Permission denied.");

        try {
            library.addItem(item);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void removeItem(MediaItem item) {
        if (!(member instanceof Manager)) throw new SecurityException("Permission denied.");

        try {
            library.removeItem(item);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
