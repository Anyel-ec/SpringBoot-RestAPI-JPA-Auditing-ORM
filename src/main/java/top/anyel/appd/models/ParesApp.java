package top.anyel.appd.models;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "pares")
public class ParesApp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_ap;

    private Long numero_ap;
}