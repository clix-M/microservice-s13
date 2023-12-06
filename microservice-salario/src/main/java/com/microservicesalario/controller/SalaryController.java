package com.microservicesalario.controller;

import com.microservicesalario.client.PersonalClient;
import com.microservicesalario.service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("/api/salario")
public class SalaryController {


    @Autowired
    PersonalClient personalClient;

    @GetMapping("/see/{id}")
    public ResponseEntity<?> getPersonalById(@PathVariable UUID id) {
        return ResponseEntity.ok(personalClient.findPersonalById(id));


    }


}
