package cbnu.capstone.tripwithme.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(schema = "tripwithme",name = "KINDOFDISABLEDTABLE")
public class KindOfDisabledTable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column
    private long kindOfDisabledTableId;

    @Column
    private String userId;

    @Column
    private String kindOfDisabled;

}
