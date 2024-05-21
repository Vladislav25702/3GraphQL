package com.example.graphql.repository;

import com.example.graphql.models.Patient;

import org.springframework.data.repository.CrudRepository;

public interface PatientsRepository extends CrudRepository<Patient, Integer> {
}
