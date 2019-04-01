package org.mediatheque.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mediatheque.model.Library;
import org.mediatheque.model.item.Book;
import org.mediatheque.model.item.MediaItem;
import org.mediatheque.model.item.Status;
import org.mediatheque.model.member.Manager;
import org.mediatheque.model.member.Member;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class MemberControllerTest {
    Library library;
    Member member;
    MediaItem testItem;
    MemberController memberController;

    @BeforeEach
    public void init() {
        library = Library.getInstance();
        member = new Manager("John", "Doe", "empty");
        testItem = new Book(1, "nie ma", "Piotr", new Date(1993, 8, 7), Status.AVAILABLE);
        memberController = new MemberController(member);
    }

    @Test
    void testAddNewItem() {
        memberController.addItem(testItem);

        assertEquals(testItem, library.getItems().get(0));
    }

    @Test
    void testAddTheSameItem() {
        assertThrows(IllegalArgumentException.class, () -> { memberController.addItem(testItem); });
    }

    @Test
    void removeItem() {
    }
}