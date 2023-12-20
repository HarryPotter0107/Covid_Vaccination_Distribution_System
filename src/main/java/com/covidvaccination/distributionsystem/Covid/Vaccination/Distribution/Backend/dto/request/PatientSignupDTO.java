package com.covidvaccination.distributionsystem.Covid.Vaccination.Distribution.Backend.dto.request;

import com.covidvaccination.distributionsystem.Covid.Vaccination.Distribution.Backend.enums.VaccinationPrefrence;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString 
public class PatientSignupDTO {
    String name;
    String email;
    String password;
    String aadharNumber;
    long phoneNumber;
    String gender;
    VaccinationPrefrence vaccinationPrefrence;
    String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAadharNumber() {
        return aadharNumber;
    }

    public void setAadharNumber(String aadharNumber) {
        this.aadharNumber = aadharNumber;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public VaccinationPrefrence getVaccinationPrefrence() {
        return vaccinationPrefrence;
    }

    public void setVaccinationPrefrence(VaccinationPrefrence vaccinationPrefrence) {
        this.vaccinationPrefrence = vaccinationPrefrence;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
