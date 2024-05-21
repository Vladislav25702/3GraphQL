
package com.example.graphql.Controller;

import com.example.graphql.models.Doctor;
import com.example.graphql.repository.DoctorsRepository;

import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class DoctorController {

    private final DoctorsRepository doctorsRepository;


    public DoctorController( DoctorsRepository doctorsRepository){
        this.doctorsRepository = doctorsRepository;
    }
    @QueryMapping
    Iterable<Doctor> getAllDoctors() {
        return doctorsRepository.findAll();
    }


}