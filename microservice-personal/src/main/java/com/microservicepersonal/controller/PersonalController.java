package com.microservicepersonal.controller;

import com.microservicepersonal.models.Personal;
import com.microservicepersonal.servcice.Message;
import com.microservicepersonal.servcice.PersonalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/personal")
public class PersonalController {
    @Autowired
    private PersonalService personalService;

    @GetMapping("/all")
    public List<Personal> findAll(){
        return personalService.findAll();
    }

    @GetMapping("/see/{id}")
    public Personal findById(@PathVariable UUID id){
        return personalService.findById(id);
    }

    @PostMapping("/save")
    public Personal save(@RequestBody  Personal personal){
        return personalService.save(personal);
    }

    @PutMapping("/update")
    public Personal update(@RequestBody Personal personal){
        return personalService.update(personal);

    }

    @DeleteMapping("/delete/{id}")
    public Message deleteById(@PathVariable UUID id){
        return personalService.deleteById(id);
    }

}
