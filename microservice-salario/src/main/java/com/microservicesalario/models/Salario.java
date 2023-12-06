package com.microservicesalario.models;

import com.microservicesalario.dto.PersonalDTO;
import lombok.Data;

@Data
public class Salario {
    PersonalDTO personalDTO;
    private Double pricePerHour;

    public Double getSalary() {
        return this.pricePerHour * this.personalDTO.getWorkingHours();
    }
}
