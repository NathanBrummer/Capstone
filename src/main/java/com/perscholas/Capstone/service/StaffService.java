package com.perscholas.Capstone.service;

import com.perscholas.Capstone.dto.StaffDTO;
import com.perscholas.Capstone.model.Staff;

public interface StaffService {
    public void saveService (Staff staff);
    public void createService(StaffDTO staffDTO);
}
