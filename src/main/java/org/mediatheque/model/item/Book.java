package org.mediatheque.model.item;

import java.util.Date;

public class Book extends MediaItem implements Readable {
    public Book(int id, String name, String author, Date releaseDate, Status status) {
        super(id, name, author, releaseDate, status);
    }

    public void read() {

    }
}
