package com.service;

import com.model.Curator;
import com.model.UniversityGroup;

import java.util.Random;

public class CuratorService {
    private final static Random RANDOM = new Random();

    public void addCurator(UniversityGroup universityGroup) {
        final Curator curator = new Curator("Curator-" + RANDOM.nextInt(10, 1000));
        universityGroup.setCurator(curator);
        curator.setUniversityGroup(universityGroup);
    }
}
