package com.service;

import com.model.University;
import com.model.UniversityGroup;

public class UniversityGroupService {
    public UniversityGroup creatUniversityGroup(String name, University university) {
        return new UniversityGroup(name, university);
    }
}
