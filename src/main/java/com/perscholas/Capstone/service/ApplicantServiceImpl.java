package com.perscholas.Capstone.service;

import com.perscholas.Capstone.dto.ApplicantDTO;
import com.perscholas.Capstone.model.Applicant;
import com.perscholas.Capstone.repository.ApplicantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class ApplicantServiceImpl implements ApplicantService {

    //private PasswordEncoder passwordEncoder;

    private ApplicantRepository applicantRepository;

    @Autowired
    public ApplicantServiceImpl(ApplicantRepository applicantRepository/*, @Lazy PasswordEncoder passwordEncoder*/) {
        this.applicantRepository = applicantRepository;
        //this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void saveApplicant(Applicant applicant) {
        applicantRepository.save(applicant);
    }

    @Override
    public void createApplicant(ApplicantDTO applicantDTO) {
        Applicant applicant = new Applicant();

        applicant.setEmail(applicantDTO.getEmail());
        applicant.setPassword(applicantDTO.getPassword());
        applicant.setFirstName(applicantDTO.getFirstName());
        applicant.setLastName(applicantDTO.getLastName());
        applicant.setPosition(applicantDTO.getPosition());

        applicantRepository.save(applicant);
    }

    public Applicant getApplicantByEmailAndPassword(String email, String password) {
        return applicantRepository.findApplicantByEmailAndPassword(email, password);
    }
}
