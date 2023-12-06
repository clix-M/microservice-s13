package com.microservicesalario.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;
import java.util.UUID;

@Data
public class PersonalDTO {
    private UUID id;
    private String name;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date birthDate;

    private Double workingHours;
    private String position;
    private String workplace;

}