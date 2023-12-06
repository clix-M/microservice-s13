package com.microservicepersonal.persistence;

import com.microservicepersonal.models.Personal;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PersonalRepo extends JpaRepository<Personal, UUID> {
}
