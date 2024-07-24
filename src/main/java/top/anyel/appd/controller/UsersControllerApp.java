package top.anyel.appd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.anyel.appd.models.UsersApp;
import top.anyel.appd.services.UsersServiceApp;

import java.util.List;

@RestController
@RequestMapping("/app/users")
public class UsersControllerApp {
    @Autowired
    private UsersServiceApp usersServiceApp;

    @GetMapping
    public List<UsersApp> getAllUsers() {
        return usersServiceApp.getAllUsers();
    }

    @GetMapping("/{id}")
    public UsersApp getUserById(@PathVariable Integer id) {
        return usersServiceApp.getUserById(id);
    }

    @PostMapping
    public UsersApp createUser(@RequestBody UsersApp user) {
        return usersServiceApp.saveUser(user);
    }

    @PutMapping("/{id}")
    public UsersApp updateUser(@PathVariable Integer id, @RequestBody UsersApp user) {
        user.setId_ap(id);
        return usersServiceApp.saveUser(user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Integer id) {
        usersServiceApp.deleteUser(id);
    }

    @GetMapping("/count")
    public Long countUsers() {
        return usersServiceApp.countUsers();
    }


}
