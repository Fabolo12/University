package com.service;

import com.model.Course;
import com.model.Student;

import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class CourseService {
    private static final Random RANDOM = new Random();

    public void setCourse(Student student, int courseCount) {
        Set<Course> courses = new HashSet<>();
        for (int i = 0; i < courseCount; i++) {
            final Course course = new Course("Course - " + RANDOM.nextInt(0,1000));
            course.setStudentSet(Collections.singleton(student));
            courses.add(course);
        }
        student.setCourseSet(courses);
    }
}
