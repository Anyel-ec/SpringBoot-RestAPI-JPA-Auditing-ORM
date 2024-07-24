package top.anyel.appd.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.util.Date;

@Entity
@Data
@JsonIgnoreProperties(value = {"createdAt", "updatedAt"},
        allowGetters = true)
public class FavoritiesApp {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_ap;

    @ManyToOne
    @JoinColumn(name = "user_id_appd")
    private UsersApp user_id_appd;

    @ManyToOne
    @JoinColumn(name = "book_id_appd")
    private BooksApp books_id_appd;


    @Column(nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date createdAt;
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    private Date updatedAt;
}
