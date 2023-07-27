package Api_clinica.API.controller;

import Api_clinica.API.doctor.DataDoctorResgister;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("doctor")
public class DoctorController {

    @PostMapping
    public void Register(@RequestBody DataDoctorResgister data){
        System.out.println(data);
    }

}
