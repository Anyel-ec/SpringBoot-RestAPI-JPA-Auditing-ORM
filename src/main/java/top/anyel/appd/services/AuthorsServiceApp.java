package top.anyel.appd.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.anyel.appd.models.AuthorsApp;
import top.anyel.appd.repositories.AuthorsRepositoryApp;

import java.util.List;

@Service
public class AuthorsServiceApp {
    @Autowired
    private AuthorsRepositoryApp authorsRepositoryApp;

    public List<AuthorsApp> getAllAuthors() {
        return authorsRepositoryApp.findAll();
    }

    public AuthorsApp getAuthorById(Integer id) {
        return authorsRepositoryApp.findById(id).orElse(null);
    }

    public AuthorsApp saveAuthor(AuthorsApp author) {
        return authorsRepositoryApp.save(author);
    }

    public void deleteAuthor(Integer id) {
        authorsRepositoryApp.deleteById(id);
    }
    public List<Object[]> findAllAuthorsWithBooks() {
        return authorsRepositoryApp.findAllAuthorsWithBooks();
    }

    public List<Object[]> findAuthorOfBook(String title) {
        return authorsRepositoryApp.findAuthorOfBook(title);
    }


}
