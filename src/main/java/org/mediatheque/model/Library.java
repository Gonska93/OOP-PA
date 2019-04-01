package org.mediatheque.model;

import org.mediatheque.model.item.MediaItem;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private static Library instance;
    private static List<MediaItem> items;

    private Library() {
        items = new ArrayList<MediaItem>();
    }

    public static Library getInstance() {
        if (instance == null) instance = new Library();

        return instance;
    }

    public void addItem(MediaItem item) {
        if (!items.contains(item)) items.add(item);
        else throw new IllegalArgumentException("Item already exist");
    }

    public void removeItem(MediaItem item) {
        if (items.contains(item)) items.remove(item);
        else throw new IllegalArgumentException("Item does not exist");
    }

    public List<MediaItem> getItems() {
        return items;
    }
}
