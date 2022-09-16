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
@Table(schema = "tripwithme",name = "PLACELIST")
public class PlaceList {

    @Id
    @Column
    private String placeCode;

    @Column
    private String placeName;

    @Column
    private int placePrice;

    @Column
    private String region;


}