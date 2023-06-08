package pl.coderslab.service;

import pl.coderslab.entity.Book;

import java.util.List;
import java.util.Optional;

public interface BookService<O> {

    void addBook(O o);
    List<Book> ListOfBooks();

    Optional<Book> getBook(long id);

    void deleteBook(long id);

    void updateBook(O o);

}

