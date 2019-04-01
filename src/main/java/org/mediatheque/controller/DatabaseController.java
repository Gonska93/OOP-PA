package org.mediatheque.controller;

import org.mediatheque.model.item.MediaItem;

import java.util.ArrayList;

public class DatabaseController {
    public DatabaseController() {}

    private static void openConnection() {
    }

    private static void closeConnection() {
    }

    public static boolean checkMember(String name, String password) {
        return true;
    }

    public static ArrayList<MediaItem> getMediaItems() {
        return new ArrayList<MediaItem>();
    }

    public static void rentItemById(int id) {
        openConnection();

        closeConnection();
    }

    public static void returnItemById(int id) {
        openConnection();
        closeConnection();
    }
}
