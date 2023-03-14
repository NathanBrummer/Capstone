package com.perscholas.Capstone.service;

import com.perscholas.Capstone.dto.ApplicantDTO;
import com.perscholas.Capstone.model.Applicant;

public interface ApplicantService {
    public void saveApplicant (Applicant applicant);
    public void createApplicant(ApplicantDTO applicantDTO);
}
