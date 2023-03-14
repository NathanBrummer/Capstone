package com.perscholas.Capstone.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ApplicantDTO {

    private String firstName;
    private String lastName;
    private String email;
    private String position;
    private String password;
}
