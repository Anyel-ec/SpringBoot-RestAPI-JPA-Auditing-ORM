package top.anyel.appd.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.anyel.appd.models.FavoritiesApp;
import top.anyel.appd.repositories.FavoritiesRepositoryApp;

import java.util.List;

@Service
public class FavoritiesServiceApp {
    @Autowired
    private FavoritiesRepositoryApp favoritiesRepositoryApp;

    public List<FavoritiesApp> getAllFavorities() {
        return favoritiesRepositoryApp.findAll();
    }

    public FavoritiesApp getFavoritiesById(Integer id) {
        return favoritiesRepositoryApp.findById(id).orElse(null);
    }

    public FavoritiesApp saveFavorities(FavoritiesApp favorities) {
        return favoritiesRepositoryApp.save(favorities);
    }

    public void deleteFavorities(Integer id) {
        favoritiesRepositoryApp.deleteById(id);
    }

}
