package top.anyel.appd.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import top.anyel.appd.models.UsersApp;

@Repository
public interface UsersAppRepository extends JpaRepository<UsersApp, Integer> {

    @Query(value = "SELECT COUNT(*) FROM users", nativeQuery = true)
    Long countUsers();

}
