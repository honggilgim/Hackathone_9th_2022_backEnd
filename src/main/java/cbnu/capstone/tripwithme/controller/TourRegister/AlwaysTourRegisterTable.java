package cbnu.capstone.tripwithme.controller.TourRegister;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import cbnu.capstone.tripwithme.dto.TourRegister.AlwaysTourRegisterTableDTO;
import cbnu.capstone.tripwithme.service.TourRegister.AlwaysTourRegisterService;

import java.util.List;

@RequestMapping("/AlwaysTourReister")
@CrossOrigin(origins ="*", maxAge = 3600)
@RestController
@RequiredArgsConstructor
public class AlwaysTourRegisterTable {
    //상시 등록을 위한 상시테이블 참조

    private final AlwaysTourRegisterService alwaysTourRegisterService;

    @GetMapping("/{up}/{down}")
    public List<AlwaysTourRegisterTableDTO> getAlwaysTourRegisterTable(@PathVariable String up, @PathVariable String down)
    {
        return alwaysTourRegisterService.getAlwaysTourRegisterTable(up, down);
    }

}
