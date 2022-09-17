package cbnu.capstone.tripwithme.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(schema = "tripwithme",name = "REGISTERHISTORYTABLE")
public class RegisterHistoryTable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column
    private long registerHistoryTableId;

    @Column
    private String userId;

    @Column
    private String registerStatus;
}
