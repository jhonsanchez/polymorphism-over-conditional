package pe.com.sanchez.polymorphismoverconditional.repository;

import pe.com.sanchez.polymorphismoverconditional.bird.Bird;

import java.util.Optional;

public interface BirdRepository {
    Optional<Bird> findById(String id);
}
