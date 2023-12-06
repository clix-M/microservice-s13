package com.microservicesalario.service;

import com.microservicesalario.client.PersonalClient;
import com.microservicesalario.dto.PersonalDTO;

import java.util.UUID;

public interface ISalaryService {
    PersonalClient findPersonalById(UUID id);

    PersonalDTO getPersonalById(UUID id);


}
