package com.dao;

import com.model.Student;

public class StudentDao extends AbstractDao<Student> {
    @Override
    protected void init() {
        aClass = Student.class;
    }
}
