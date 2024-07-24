package top.anyel.appd;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.anyel.appd.models.UsersApp;
import top.anyel.appd.services.UsersServiceApp;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersController {
    @Autowired
    private UsersServiceApp usersService;

    @GetMapping
    public List<UsersApp> getAllUsers() {
        return usersService.getAllUsers();
    }

    @GetMapping("/{id}")
    public UsersApp getUserById(@PathVariable Integer id) {
        return usersService.getUserById(id);
    }

    @PostMapping
    public UsersApp createUser(@RequestBody UsersApp user) {
        return usersService.saveUser(user);
    }

    @PutMapping("/{id}")
    public UsersApp updateUser(@PathVariable Integer id, @RequestBody UsersApp user) {
        user.setId_ap(id);
        return usersService.saveUser(user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Integer id) {
        usersService.deleteUser(id);
    }

}
