package com.microservicepersonal.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;


import java.util.Date;
import java.util.UUID;

@Entity
@Data
public class Personal {
    @Id
    @GeneratedValue
    private UUID id;

    private String name;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "birth_date")
    private Date birthDate;

    @Column(name = "working_hours")
    private Double workingHours;
    private String position;
    private String workplace;

}
