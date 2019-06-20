package com.fred.sandboxstudentsservice.studants;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

@Service
public class StudantService {
    
    public List<Studant> findStudants(int courseId){
        List<Studant> studants = Arrays.asList(new Studant("Fred", 1), new Studant("João", 1), new Studant("Lucas", 2));
        return studants.stream().filter(s-> s.getCourseId() == courseId).collect(Collectors.toList());
    }
}