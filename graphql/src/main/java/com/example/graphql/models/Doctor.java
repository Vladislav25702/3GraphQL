package com.example.graphql.models;

import jakarta.persistence.*;
@Entity
@Table(name = "doctors")
@NamedQuery(name = "Doctor.getAll", query = "SELECT s from Doctor s")
public class Doctor {
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
    @Column(name = "isDelete")
    private Boolean isDeleted;
    public Doctor(Integer id, String surname, String name, String ot, Boolean isDeleted) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.ot = ot;
        this.isDeleted = isDeleted;
    }
    public Doctor() {}
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }
    public void setSurname(String name) {
        this.surname = name;
    }

    public String getOt() {
        return ot;
    }
    public void setOt(String name) {
        this.ot = name;
    }
    public Boolean getDeleted() {
        return isDeleted;
    }
    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }
}