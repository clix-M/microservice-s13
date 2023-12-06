package com.microservicesalario.service;


import com.microservicesalario.client.PersonalClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class SalaryService  {
    @Autowired
    PersonalClient personalClient;

    public PersonalClient findPersonalById(UUID id) {
        return personalClient;
    }

}
