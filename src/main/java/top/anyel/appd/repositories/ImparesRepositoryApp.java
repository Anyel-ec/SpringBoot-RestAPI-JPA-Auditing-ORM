package top.anyel.appd.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import top.anyel.appd.models.ImparesApp;

@Repository
public interface ImparesRepositoryApp extends JpaRepository<ImparesApp, Long> {
}
