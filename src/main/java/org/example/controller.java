package org.example;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @RequestMapping("/")
    public ResponseEntity<Person2> index() {
        Person2 person = new Person2("SSSS", 20);
        return ResponseEntity.ok(person);
    }
}
