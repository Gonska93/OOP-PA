package org.mediatheque.model.item;

import java.util.Date;

public abstract class MediaItem {
    private int id;
    private String name;
    private String author;
    private Date releaseDate;
    private Status status;


    public MediaItem(int id, String name, String author, Date releaseDate, Status status) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
