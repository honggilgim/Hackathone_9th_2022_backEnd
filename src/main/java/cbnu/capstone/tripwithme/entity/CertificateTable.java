package cbnu.capstone.tripwithme.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(schema = "tripwithme",name = "CERTIFICATETABLE")
public class CertificateTable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column
    private long certificateTableId;

    @Column
    private String userId;

    @Column
    private String certificate;
}
