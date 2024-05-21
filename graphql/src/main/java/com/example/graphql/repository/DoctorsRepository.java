package com.example.graphql.repository;


import com.example.graphql.models.Doctor;
import org.springframework.data.repository.CrudRepository;
public interface DoctorsRepository extends CrudRepository<Doctor, Integer> {
}
