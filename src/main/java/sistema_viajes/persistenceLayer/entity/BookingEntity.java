package sistema_viajes.persistenceLayer.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;
@Entity
@Table(name = "booking")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookingEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String status;
    private LocalDateTime date;
    private int passengersNumber;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "travel_id")
    private TravelEntity travelEntity;
}
