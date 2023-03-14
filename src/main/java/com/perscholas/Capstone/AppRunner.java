package com.perscholas.Capstone;

import com.perscholas.Capstone.dto.ApplicantDTO;
import com.perscholas.Capstone.service.ApplicantService;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Log
@Transactional
public class AppRunner implements CommandLineRunner {

    //This is a test file
    private ApplicantService applicantService;

    @Autowired
    public AppRunner(ApplicantService applicantService) {
        this.applicantService=applicantService;
    }

    @Override
    public void run(String... args) throws Exception {
        ApplicantDTO applicantDTO = new ApplicantDTO();
        applicantDTO.setEmail("email@test.com");
        applicantDTO.setPosition("Pitcher");
        applicantDTO.setFirstName("bill");
        applicantDTO.setLastName("bob");
        applicantDTO.setPassword("test");
        applicantService.createApplicant(applicantDTO);
    }
}
