package com.dhitha.petstoreapi.controller;

import java.util.List;
import lombok.RequiredArgsConstructor;
import com.dhitha.petstoreds.model.Pet;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.dhitha.petstoreds.service.PetService;

/**
 * Controller to handle pets
 *
 * @author Dhiraj
 */
@RestController
@RequiredArgsConstructor
public class PetController {

  private final PetService petService;

  @GetMapping(value = "/pets", produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<List<Pet>> getAllPets() {
    List<Pet> allPets = petService.getAllPets();
    return ResponseEntity.ok(allPets);
  }
}
