package com.example.graphql.Controller;

import com.example.graphql.models.Doctor;
import com.example.graphql.models.Patient;
import com.example.graphql.repository.DoctorsRepository;
import com.example.graphql.repository.PatientsRepository;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class PatientController {

    private final PatientsRepository patientsRepository;

    public PatientController(PatientsRepository patientsRepository) {
        this.patientsRepository = patientsRepository;
    }

    @QueryMapping
    Iterable<Patient> getAllPatients() {

        return patientsRepository.findAll();
    }


}
