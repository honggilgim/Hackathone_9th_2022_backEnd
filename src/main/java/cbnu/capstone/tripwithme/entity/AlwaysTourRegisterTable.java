package cbnu.capstone.tripwithme.entity;

import lombok.*;

import javax.persistence.*;


@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(schema = "tripwithme",name = "AlwaysTourRegisterTable")
public class AlwaysTourRegisterTable {
    //상시 관광지 신청 테이블
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
    @Column
    private String up;
    @Column
    private String down;
}

