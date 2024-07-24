package top.anyel.appd.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.anyel.appd.models.AuthorsApp;
import top.anyel.appd.services.AuthorsServiceApp;

import java.util.List;
@RestController
@RequestMapping("/app/authors")
public class AuthorsControllerApp {
    @Autowired
    private AuthorsServiceApp authorsServiceApp;

    @GetMapping
    public List<AuthorsApp> getAllAuthors() {
        return authorsServiceApp.getAllAuthors();
    }

    @GetMapping("/{id}")
    public AuthorsApp getAuthorById(@PathVariable Integer id) {
        return authorsServiceApp.getAuthorById(id);
    }

    @PostMapping
    public AuthorsApp createAuthor(@RequestBody AuthorsApp author) {
        return authorsServiceApp.saveAuthor(author);
    }

    @PutMapping("/{id}")
    public AuthorsApp updateAuthor(@PathVariable Integer id, @RequestBody AuthorsApp author) {
        author.setId_ap(id);
        return authorsServiceApp.saveAuthor(author);
    }

    @DeleteMapping("/{id}")
    public void deleteAuthor(@PathVariable Integer id) {
        authorsServiceApp.deleteAuthor(id);
    }

    @GetMapping("/with-books")
    public List<Object[]> getAllAuthorsWithBooks() {
        return authorsServiceApp.findAllAuthorsWithBooks();
    }

    @GetMapping("/book-author")
    public List<Object[]> getAuthorOfBook(String title) {
        return authorsServiceApp.findAuthorOfBook(title);
    }


}
