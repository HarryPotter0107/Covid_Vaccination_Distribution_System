package com.covidvaccination.distributionsystem.Covid.Vaccination.Distribution.Backend.dto.request;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class PatientLoginDTO {
    String email;
    String password;
}
