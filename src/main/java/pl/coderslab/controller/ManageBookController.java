package pl.coderslab.controller;

import pl.coderslab.entity.Book;
import pl.coderslab.service.JpaBookService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/admin/books")
public class ManageBookController {

    private final JpaBookService jpaBookService;

    public ManageBookController(JpaBookService jpaBookService) {
        this.jpaBookService = jpaBookService;
    }

    //Shows all books
    @GetMapping("/allBookList")
    public String showPosts(Model model) {
        List<Book> books = jpaBookService.ListOfBooks();
        model.addAttribute("books", books);
        return "allBooks";
    }

    //Shows create book form
    @GetMapping(path = "/addBook")
    public String addBook(Model model) {
        model.addAttribute("book", new Book());
        return "addBookForm";
    }

    //Creating new book via form
    @PostMapping(path = "/addBook")
    public String processAddBook(@Valid Book book, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "addBookForm";
        }
        jpaBookService.addBook(book);
        return "redirect:/admin/books/allBookList";
    }

    //Shows edit book form
    @GetMapping(path = "/editBook")
    public String editBook(@RequestParam long id, Model model) {
        Optional<Book> book = jpaBookService.getBook(id);
        if (book.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "There is no book at this ID");
        } else {
            model.addAttribute("book", book.get());
            return "editBookForm";
        }
    }

    //Updating book
    @PostMapping(path = "/editBook")
    public String processUpdateBook(@Valid Book book, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "editBookForm";
        }
        jpaBookService.updateBook(book);
        return "redirect:/admin/books/allBookList";
    }
    //Deleting book via ID
    @GetMapping(path = "/deleteBook")
    public String deleteBook(@RequestParam long id) {
        Optional<Book> book = jpaBookService.getBook(id);
        if (book.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "There is no book at this ID");
        } else {
            jpaBookService.deleteBook(id);
            return "redirect:/admin/books/allBookList";
        }
    }
    @GetMapping(path = "/showBook")
    public String showDirectBook(@RequestParam long id, Model model){
        Optional<Book> book = jpaBookService.getBook(id);
        if(book.isEmpty()){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "There is no book at this Id");
        }else {
            model.addAttribute("book", book.get());
            return "showOneBook";
        }
    }
}