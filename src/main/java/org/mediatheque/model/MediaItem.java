package org.mediatheque.model;

import java.util.Date;

public class MediaItem {
    private String name;
    private String author;
    private Date length;
    private int pagesAmount;


    public MediaItem(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public MediaItem(String name, String author, Date length) {
        this(name, author);
        this.length = length;
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

    public Date getLength() {
        return length;
    }

    public void setLength(Date length) {
        this.length = length;
    }

    public int getPagesAmount() {
        return pagesAmount;
    }

    public void setPagesAmount(int pagesAmount) {
        this.pagesAmount = pagesAmount;
    }
}
