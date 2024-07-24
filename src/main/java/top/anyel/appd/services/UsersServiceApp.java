package top.anyel.appd.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.anyel.appd.models.UsersApp;
import top.anyel.appd.repositories.UsersAppRepository;

import java.util.List;

@Service
public class UsersServiceApp {
    @Autowired
    private UsersAppRepository usersAppRepository;

    public List<UsersApp> getAllUsers() {
        return usersAppRepository.findAll();
    }

    public UsersApp getUserById(Integer id) {
        return usersAppRepository.findById(id).orElse(null);
    }

    public UsersApp saveUser(UsersApp user) {
        return usersAppRepository.save(user);
    }

    public void deleteUser(Integer id) {
        usersAppRepository.deleteById(id);
    }
    public Long countUsers() {
        return usersAppRepository.countUsers();
    }

}
