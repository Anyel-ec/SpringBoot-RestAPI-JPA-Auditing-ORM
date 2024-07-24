package top.anyel.appd.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.anyel.appd.models.BooksApp;
import top.anyel.appd.services.BooksServiceApp;

import java.util.List;

@RestController
@RequestMapping("/app/books")
public class BooksControllerApp {
    @Autowired
    private BooksServiceApp booksServiceApp;

    @GetMapping
    public List<BooksApp> getAllBooks() {
        return booksServiceApp.getAllBooks();
    }

    @GetMapping("/{id}")
    public BooksApp getBookById(@PathVariable Integer id) {
        return booksServiceApp.getBookById(id);
    }

    @PostMapping
    public BooksApp createBook(@RequestBody BooksApp book) {
        return booksServiceApp.saveBook(book);
    }

    @PutMapping("/{id}")
    public BooksApp updateBook(@PathVariable Integer id, @RequestBody BooksApp book) {
        book.setId_ap(id);
        return booksServiceApp.saveBook(book);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Integer id) {
        booksServiceApp.deleteBook(id);
    }

}
