package org.example.HW4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookRepositoryMemory implements BookRepository  {
    private final Map<String, Book> books;

    public BookRepositoryMemory() {
        this.books = new HashMap<>();
        books.put("1", new Book("1", "Sneaking in the shadows", "Пехов А.Ю."));
        books.put("2", new Book("2", "Janga with shadows", "Пехов А.Ю."));
    }

    @Override
    public Book findById(String id) {
        return books.get(id);
    }

    @Override
    public List<Book> findAll() {
        return new ArrayList<>(books.values());
    }
}