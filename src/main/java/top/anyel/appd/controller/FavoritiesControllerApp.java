package top.anyel.appd.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.anyel.appd.models.FavoritiesApp;
import top.anyel.appd.services.FavoritiesServiceApp;

import java.util.List;

@RestController
@RequestMapping("/app/favorities")
public class FavoritiesControllerApp {
    @Autowired
    private FavoritiesServiceApp favoritiesServiceApp;

    @GetMapping
    public List<FavoritiesApp> getAllFavorities() {
        return favoritiesServiceApp.getAllFavorities();
    }

    @GetMapping("/{id}")
    public FavoritiesApp getFavoritiesById(@PathVariable Integer id) {
        return favoritiesServiceApp.getFavoritiesById(id);
    }

    @PostMapping
    public FavoritiesApp createFavorities(@RequestBody FavoritiesApp favorities) {
        return favoritiesServiceApp.saveFavorities(favorities);
    }

    @PutMapping("/{id}")
    public FavoritiesApp updateFavorities(@PathVariable Integer id, @RequestBody FavoritiesApp favorities) {
        favorities.setId_ap(id);
        return favoritiesServiceApp.saveFavorities(favorities);
    }
}
