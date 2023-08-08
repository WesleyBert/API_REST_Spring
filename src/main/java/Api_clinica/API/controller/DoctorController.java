package Api_clinica.API.controller;

import Api_clinica.API.doctor.DataDoctorRegister;
import Api_clinica.API.doctor.Doctor;
import Api_clinica.API.doctor.DoctorRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("doctor")
public class DoctorController {

    @Autowired
    private DoctorRepository repository;
    @PostMapping
    @Transactional
    public void Register(@RequestBody @Valid DataDoctorRegister data){

        repository.save(new Doctor(data));
    }

}
