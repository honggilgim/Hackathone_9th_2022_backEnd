package cbnu.capstone.tripwithme.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(schema = "tripwithme",name = "USERTICKETLIST")
public class UserTicketList {


    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column
    private long userTicketListId;

    @Column
    private String userID;

    @Column
    private String placeCode;

    @Column
    private int usingTicket ;


}