package com;

import com.config.HibernateFactoryUtil;
import com.service.UniversityService;

public class Main {
    private static final UniversityService universityService = new UniversityService();

    public static void main(String[] args) {
        HibernateFactoryUtil.init();
        universityService.creatUniversityInfrastructure();
        universityService.print();
    }
}
