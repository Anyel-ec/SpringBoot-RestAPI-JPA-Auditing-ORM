package top.anyel.appd.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.anyel.appd.models.BooksApp;
import top.anyel.appd.repositories.BooksRepositoryApp;

import java.util.List;

@Service
public class BooksServiceApp {
    @Autowired
    private BooksRepositoryApp booksRepositoryApp;

    public List<BooksApp> getAllBooks() {
        return booksRepositoryApp.findAll();
    }

    public BooksApp getBookById(Integer id) {
        return booksRepositoryApp.findById(id).orElse(null);
    }

    public BooksApp saveBook(BooksApp book) {
        return booksRepositoryApp.save(book);
    }

    public void deleteBook(Integer id) {
        booksRepositoryApp.deleteById(id);
    }


}
