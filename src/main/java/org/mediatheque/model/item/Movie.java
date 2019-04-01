package org.mediatheque.model.item;

import java.util.Date;

public class Movie extends MediaItem implements Watchable {
    public Movie(int id, String name, String author, Date releaseDate, Status status) {
        super(id, name, author, releaseDate, status);
    }

    public void watch() {

    }
}
