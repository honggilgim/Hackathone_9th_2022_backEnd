package cbnu.capstone.tripwithme.entity;

import lombok.*;

import javax.persistence.*;


@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(schema = "tripwithme",name = "ALWAYSTOURREGISTERTABLE")
public class AlwaysTourRegisterTable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column
    private long alwaysTourRegisterTableId;

    @Column
    private String tourCode;

    @Column
    private String userId;

    @Column
    private String date;

}

