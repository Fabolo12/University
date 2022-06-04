package com.service;

import com.model.Student;
import com.model.UniversityGroup;

import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class StudentService {

    private static final Random RANDOM = new Random();
    public void addStudents(UniversityGroup group, int count) {
        Set<Student> studentSet = new HashSet<>();
        for (int i = 0; i < count; i++) {
            Student student = new Student("Student-" + RANDOM.nextInt(0, 1000));
            student.setGroupSet(Collections.singleton(group));
            studentSet.add(student);
        }
        group.setStudents(studentSet);
    }
}
