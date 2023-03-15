package com.perscholas.Capstone.service;

import com.perscholas.Capstone.dto.StaffDTO;
import com.perscholas.Capstone.model.Staff;
import com.perscholas.Capstone.repository.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class StaffServiceImpl implements StaffService{

    private StaffRepository staffRepository;

    @Autowired
    public StaffServiceImpl(StaffRepository staffRepository/*, @Lazy PasswordEncoder passwordEncoder*/) {
        this.staffRepository = staffRepository;
        //this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void saveService(Staff staff) {
        staffRepository.save(staff);
    }

    @Override
    public void createService(StaffDTO staffDTO) {
        Staff staff = new Staff();

        staff.setFirstName(staff.getFirstName());
        staff.setLastName(staff.getLastName());
        staff.setEmail(staff.getEmail());
        staff.setPassword(staff.getPassword());

        staffRepository.save(staff);
    }

    public Staff getStaffByEmailAndPassword(String email, String password) {
        return staffRepository.findStaffByEmailAndPassword(email, password);
    }
}
