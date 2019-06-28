package com.fred.sandboxstudentsservice.studants;

import java.util.List;

import com.fred.sandboxstudentsservice.msgs.Msg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

// @AllArgsConstructor
@RestController
public class StudantResource {

    @Autowired
    private Msg error;
    @Autowired
    private StudantService studantService;
    
    @GetMapping("/course/{course-id}")
    public ResponseEntity<List<Studant>> findStudants(@PathVariable("course-id") int courseId){
        return ResponseEntity.ok(studantService.findStudants(courseId));
    }

    @GetMapping("/msgs")
    public ResponseEntity<String> findMsg(){
        System.out.println(">>>>> " + error);
        System.out.println(">>>>> " + error.getError());
        return ResponseEntity.ok(error.getError());
    }
}