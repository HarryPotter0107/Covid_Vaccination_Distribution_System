package com.covidvaccination.distributionsystem.Covid.Vaccination.Distribution.Backend.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.UUID;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    UUID id;
    String name;
    String docDegree;
    @ManyToOne
    @JsonIgnore
    VaccinationCenter vaccinationCenter;
    int patientCount;
    @ManyToMany
    @JsonIgnore
    List<Patient> patients;
}