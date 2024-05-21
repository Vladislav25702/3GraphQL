package com.example.graphql.models;

import jakarta.persistence.*;
@Entity
@Table(name = "patients")
@NamedQuery(name = "Patient.getAll", query = "SELECT c from Patient c")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "surname", length = 255)
    private String surname;

    @Column(name = "name", length = 255)
    private String name;

    @Column(name = "ot", length = 255)
    private String ot;
    @ManyToOne
    @JoinColumn(name = "id_doctor")
    private Doctor doctor;
    @Column(name = "isDelete")
    private Boolean isDeleted;

    public Patient(Integer id, String surname, String name, String ot, Doctor doctor, Boolean isDeleted) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.ot = ot;
        this.doctor = doctor;
        this.isDeleted = isDeleted;
    }
    public Patient() {}
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getSurName() {
        return surname;
    }
    public void setSurName(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getOt() {
        return ot;
    }
    public void setOt(String ot) {
        this.ot = ot;
    }
    public Doctor getDoctor() {
        return doctor;
    }
    public void setIdStylist(Doctor doctor) {
        this.doctor = doctor;
    }
    public Boolean getDeleted() {
        return isDeleted;
    }
    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }
}