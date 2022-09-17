package cbnu.capstone.tripwithme.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(schema = "tripwithme",name = "TOURLISTTABLE")
public class TourListTable {

    @Id
    @Column
    private String tourCode;

    @Column
    private String tourName;

    @Column
    private String tourLocation;

    @Column
    private int adultFee_P;

    @Column
    private int adolescentFee_P;

    @Column
    private int childFee_P;

    @Column
    private int elderPeopleFee_P;


    @Column
    private int adultFee_G;

    @Column
    private int adolescentFee_G;

    @Column
    private int childFee_G;

    @Column
    private int elderPeopleFee_G;

    @Column
    private int score;

    @Column
    private String picUrl;

    @Column
    private String explanation;
}


