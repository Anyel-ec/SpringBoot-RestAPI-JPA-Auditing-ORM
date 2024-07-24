package top.anyel.appd.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import top.anyel.appd.models.BooksApp;

@Repository
public interface BooksRepositoryApp extends JpaRepository<BooksApp, Integer> {
}
