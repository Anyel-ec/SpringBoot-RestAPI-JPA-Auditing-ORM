package top.anyel.appd.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import top.anyel.appd.models.ParesApp;

@Repository
public interface ParesRepositoryApp extends JpaRepository<ParesApp, Long> {
}
