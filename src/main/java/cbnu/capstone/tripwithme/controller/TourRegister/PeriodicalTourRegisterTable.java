package cbnu.capstone.tripwithme.controller.TourRegister;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import cbnu.capstone.tripwithme.dto.TourRegister.PeriodicalTourRegisterTableDTO;
import cbnu.capstone.tripwithme.service.TourRegister.PeriodicalTourRegisterService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RequestMapping("/periodicalTourRegisterTable")
@CrossOrigin(origins ="*", maxAge = 3600)
@RestController
@RequiredArgsConstructor
public class PeriodicalTourRegisterTable {
    private final PeriodicalTourRegisterService periodicalTourRegisterService;

    @GetMapping("/")
    public List<PeriodicalTourRegisterTableDTO> getPeriodicalTourRegisterTableo(HttpServletRequest request)
    {
        return periodicalTourRegisterService.getPeriodicalTourRegisterTable(request.getParameter("up"), request.getParameter("down"));
    }


}
