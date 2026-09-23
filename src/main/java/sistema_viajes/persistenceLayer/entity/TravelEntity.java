package sistema_viajes.persistenceLayer.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.time.LocalDateTime;
@Entity
@Table(name = "travel")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TravelEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String destiny;
    private LocalDateTime date;
    private BigDecimal price;
}
