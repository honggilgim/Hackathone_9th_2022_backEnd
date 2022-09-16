package cbnu.capstone.tripwithme.entity;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(schema = "tripwithme",name = "PAIDLIST")
public class PaidList {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column
    private long paidListId;

    @Column
    private String placeCode;

    @Column
    private int price;

    @Column(name = "timestamp", nullable = false, updatable = false, insertable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp paidTime;

}