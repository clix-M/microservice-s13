package com.microservicepersonal.servcice;

import com.microservicepersonal.models.Personal;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ServiceInterface {
    List<Personal> findAll();
    Personal findById(UUID id);
    Personal save(Personal personal);
    Message deleteById(UUID id);

    Personal update(Personal personal);

}
