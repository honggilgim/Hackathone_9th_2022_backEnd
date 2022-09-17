package cbnu.capstone.tripwithme.controller.TourRegister;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import cbnu.capstone.tripwithme.dto.TourRegister.PeriodicalTourRegisterTableDTO;
import cbnu.capstone.tripwithme.service.TourRegister.PeriodicalTourRegisterService;

import java.util.List;

@RequestMapping("/PeriodicalTourRegisterTable")
@CrossOrigin(origins ="*", maxAge = 3600)
@RestController
@RequiredArgsConstructor
public class PeriodicalTourRegisterTable {
    private final PeriodicalTourRegisterService periodicalTourRegisterService;

    @GetMapping("/{up}/{down}")
    public List<PeriodicalTourRegisterTableDTO> getPeriodicalTourRegisterTable(@PathVariable String up, @PathVariable String down)
    {
        return periodicalTourRegisterService.getPeriodicalTourRegisterTable(up, down);
    }


}
