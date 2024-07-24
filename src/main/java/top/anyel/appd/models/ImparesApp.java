package top.anyel.appd.models;
import jakarta.persistence.*;
import lombok.Data;
@Entity
@Data
@Table(name = "impares_ap")
public class ImparesApp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_ap;

    private Long numero_ap;
}