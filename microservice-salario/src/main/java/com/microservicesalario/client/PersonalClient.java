package com.microservicesalario.client;

import com.microservicesalario.dto.PersonalDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.UUID;

@FeignClient(name = "microservice-personal", url = "http://localhost:8080/api/personal")
public interface PersonalClient {
    @GetMapping("see/{id}")
    List<PersonalDTO> findPersonalById(@PathVariable UUID id);
}
