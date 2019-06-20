package com.fred.sandboxstudentsservice.studants;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
public class StudantResource {

    private StudantService studantService;
    
    @GetMapping("/course/{course-id}")
    public ResponseEntity<List<Studant>> findStudants(@PathVariable("course-id") int courseId){
        return ResponseEntity.ok(studantService.findStudants(courseId));
    }
}