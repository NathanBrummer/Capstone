package com.perscholas.Capstone.controller;

import com.perscholas.Capstone.model.Applicant;
import com.perscholas.Capstone.repository.ApplicantRepository;
import com.perscholas.Capstone.service.ApplicantService;
import com.perscholas.Capstone.service.ApplicantServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class ApplicantController {

    private ApplicantRepository applicantRepository;
    private ApplicantServiceImpl applicantServiceImpl;
    Applicant foundApp;

    @Autowired
    public ApplicantController(ApplicantRepository applicantRepository, ApplicantServiceImpl applicantServiceImpl) {
        this.applicantRepository = applicantRepository;
        this.applicantServiceImpl = applicantServiceImpl;
    }

    @GetMapping({"/new"})
    public String newApp(Model model) {
        Applicant applicant = new Applicant();
        model.addAttribute("applicant", applicant);
        return "new_app";
    }

    @PostMapping("/new")
    public String submitCompose(@ModelAttribute("applicant") Applicant applicant,Model model){
        log.info(applicant.toString());
        applicantRepository.save(applicant);
        return "new_app";
    }

    @GetMapping({"/existing"})
    public String existingApp(Model model) {
        Applicant applicant = new Applicant();
        model.addAttribute("applicant", applicant);
        return "existing_app";
    }

    @PostMapping({"/existing"})
    public String search(@ModelAttribute("applicant") Applicant applicant, Model model) {
        foundApp = applicantServiceImpl.getApplicantByEmailAndPassword(applicant.getEmail(),applicant.getPassword());
        log.info(applicant.toString());
        return "view_app";
    }

    @GetMapping({"/view"})
    public String viewApp(Model model) {
        model.addAttribute("applicant", foundApp);
        return "view_app";
    }
}
