package com.dao;

import com.model.University;

public class UniversityDao extends AbstractDao<University> {
    @Override
    protected void init() {
        aClass = University.class;
    }
}
