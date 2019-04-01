package org.mediatheque.model.item;

import java.util.Date;

public class Song extends MediaItem implements Listenable {
    public Song(int id, String name, String author, Date releaseDate, Status status) {
        super(id, name, author, releaseDate, status);
    }

    public void play() {

    }
}
