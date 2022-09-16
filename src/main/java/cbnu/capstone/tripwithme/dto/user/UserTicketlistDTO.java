package cbnu.capstone.tripwithme.dto.user;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserTicketlistDTO {
    private int user_ticket_list_id;
    private String place_code;
    private String userid;
    private int using_ticket;
}