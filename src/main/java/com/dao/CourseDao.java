package com.dao;

import com.model.Course;

public class CourseDao extends AbstractDao<Course> {
    @Override
    protected void init() {
        aClass = Course.class;
    }
}
