package pl.coderslab.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import pl.coderslab.entity.Book;
import pl.coderslab.repository.BookRepository;

import java.util.List;
import java.util.Optional;

@Service
@Primary
public class JpaBookService implements BookService<Book> {

    private final BookRepository bookRepository;

    public JpaBookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public void addBook(Book book) {
        bookRepository.save(book);
    }

    @Override
    public List<Book> ListOfBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Optional<Book> getBook(long id) {
        return bookRepository.findById(id);
    }

    @Override
    public void deleteBook(long id) {
        bookRepository.deleteById(id);
    }

    @Override
    public void updateBook(Book book) {
        bookRepository.save(book);
    }
}
