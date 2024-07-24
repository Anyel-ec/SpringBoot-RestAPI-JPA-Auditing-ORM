package top.anyel.appd.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import jakarta.persistence.Entity;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Data
@JsonIgnoreProperties(value = {"createdAt", "updatedAt"},
        allowGetters = true)

public class BooksApp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_ap;

    private String title_ap;



    private String publishingYear_ap;

    private String genre_ap;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private AuthorsApp author_ap;

    @Column(nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date createdAt_ap;
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    private Date updatedAt_ap;

}
