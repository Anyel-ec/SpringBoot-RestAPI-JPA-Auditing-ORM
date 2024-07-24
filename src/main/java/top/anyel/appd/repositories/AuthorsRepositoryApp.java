package top.anyel.appd.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import top.anyel.appd.models.AuthorsApp;

import java.util.List;

@Repository
public interface AuthorsRepositoryApp extends JpaRepository<AuthorsApp, Integer> {

    @Query(value = "SELECT a.first_name_ap, a.last_name_ap, b.title_ap " +
            "FROM authors_app a " +
            "JOIN books_app b ON a.id_ap = b.author_id", nativeQuery = true)
    List<Object[]> findAllAuthorsWithBooks();

    @Query(value = "SELECT a.first_name_ap, a.last_name_ap " +
            "FROM authors_app a " +
            "JOIN books_app b ON a.id_ap = b.author_id " +
            "WHERE b.title_ap = 'La Iliada'", nativeQuery = true)
    List<Object[]> findAuthorOfBook(String title);


}
