package com.dhitha.petstoreds.service;

import java.util.List;
import lombok.RequiredArgsConstructor;
import com.dhitha.petstoreds.model.Pet;
import org.springframework.stereotype.Service;
import com.dhitha.petstoreds.repository.PetRepository;

/** @author Dhiraj */
@Service
@RequiredArgsConstructor
public class PetServiceImpl implements PetService {

  private final PetRepository petRepository;

  @Override
  public List<Pet> getAllPets() {
    return petRepository.findAll();
  }
}
