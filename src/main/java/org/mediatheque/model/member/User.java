package org.mediatheque.model.member;

import org.mediatheque.controller.MemberController;
import org.mediatheque.model.item.MediaItem;

import java.util.ArrayList;
import java.util.List;

public class User extends Member {
    private List<MediaItem> rentedItems;


    public User(String name, String surname, String password) {
        super(name, surname, password);
        rentedItems = new ArrayList<MediaItem>();
    }

    public void previewItem(MediaItem item) {

    }

    public void rentItem(MediaItem item) {

    }

    public void returnItem(MediaItem item) {

    }
}
