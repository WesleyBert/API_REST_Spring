package Api_clinica.API.controller;

import Api_clinica.API.patient.DateRegisterPatient;
import Api_clinica.API.patient.PatientRepository;
import Api_clinica.API.patient.patient;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Patient")
public class PatientController {

    @Autowired
    private PatientRepository repository;

    @PostMapping
    @Transactional
    public void register(@RequestBody @Valid DateRegisterPatient date) {
        repository.save(new patient(date));
    }
}

