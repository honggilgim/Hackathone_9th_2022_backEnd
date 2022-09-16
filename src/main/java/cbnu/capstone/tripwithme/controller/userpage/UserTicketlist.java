package cbnu.capstone.tripwithme.controller.userpage;



import cbnu.capstone.tripwithme.dto.user.UserTicketlistDTO;

import cbnu.capstone.tripwithme.service.user.UserTicketlistService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RequestMapping("/user")
@CrossOrigin(origins ="*", maxAge = 3600)
@RestController
@RequiredArgsConstructor
public class UserTicketlist {

    private final UserTicketlistService userTicketlistService;



    @GetMapping("/ticketlist")
    public List<UserTicketlistDTO> getUserTicketlist(HttpServletRequest request){
        return userTicketlistService.getUserTicketlist(request.getParameter("userid"));
    }
}
