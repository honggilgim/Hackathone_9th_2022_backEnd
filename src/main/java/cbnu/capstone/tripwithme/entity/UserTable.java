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
@Table(schema = "tripwithme",name = "USERTABLE")
public class UserTable {

    @Id
    @Column
    private String userId;

    @Column
    private String password;

    @Column
    private String yesOrNo;

}
