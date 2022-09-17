package cbnu.capstone.tripwithme.entity;

import lombok.*;

import javax.persistence.*;


@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(schema = "tripwithme",name = "PERIODICALTOURREGISTERTABLE")
public class PeriodicalTourRegisterTable {
    // 정기관광지 신청 테이블


    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column
    private long periodicalTourRegisterTableId;

    @Column
    private String tourCode;

    @Column
    private String userId;

    @Column
    private String date;
}
