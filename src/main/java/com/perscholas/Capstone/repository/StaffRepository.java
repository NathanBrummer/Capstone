package com.perscholas.Capstone.repository;

import com.perscholas.Capstone.model.Staff;
import org.springframework.data.repository.CrudRepository;

public interface StaffRepository extends CrudRepository<Staff, Integer> {

    public Staff findStaffByEmailAndPassword(String email, String password);
}
