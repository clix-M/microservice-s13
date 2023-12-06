package com.microservicepersonal.servcice;

import com.microservicepersonal.models.Personal;
import com.microservicepersonal.persistence.PersonalRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class PersonalService implements ServiceInterface{
    @Autowired
    private PersonalRepo personalRepo;

    @Override
    public List<Personal> findAll() {
        return personalRepo.findAll();
    }

    @Override
    public Personal findById(UUID id) {
        return personalRepo.findById(id).orElseThrow();
    }

    @Override
    public Personal save(Personal personal) {
        return personalRepo.save(personal);
    }

    @Override
    public Message deleteById(UUID id) {
        personalRepo.deleteById(id);
        return new Message("Personal with id: " + id + " was deleted");
    }

    @Override
    public Personal update(Personal personal) {
        Personal newPersonal = new Personal();
        newPersonal.setId(personal.getId());
        newPersonal.setName(personal.getName());
        newPersonal.setBirthDate(personal.getBirthDate());
        newPersonal.setWorkingHours(personal.getWorkingHours());
        newPersonal.setPosition(personal.getPosition());
        newPersonal.setWorkplace(personal.getWorkplace());
        return personalRepo.save(newPersonal);
    }
}
