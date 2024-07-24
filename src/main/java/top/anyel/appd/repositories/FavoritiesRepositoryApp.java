package top.anyel.appd.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import top.anyel.appd.models.FavoritiesApp;

@Repository
public interface FavoritiesRepositoryApp extends JpaRepository<FavoritiesApp, Integer> {
}
