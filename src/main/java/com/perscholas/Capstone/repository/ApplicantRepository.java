package com.perscholas.Capstone.repository;

import com.perscholas.Capstone.model.Applicant;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicantRepository extends CrudRepository<Applicant, Integer> {
    public Applicant findApplicantByEmailAndPassword(String email, String password);
}
