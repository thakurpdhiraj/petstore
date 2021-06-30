package com.dhitha.petstoreds.repository;

import com.dhitha.petstoreds.model.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/** @author Dhiraj */
@Repository
public interface PetRepository extends JpaRepository<Pet, Integer> {}
