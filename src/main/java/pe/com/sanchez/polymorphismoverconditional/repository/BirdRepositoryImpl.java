package pe.com.sanchez.polymorphismoverconditional.repository;

import pe.com.sanchez.polymorphismoverconditional.bird.Bird;

import java.util.Optional;

public class BirdRepositoryImpl implements BirdRepository{
    @Override
    public Optional<Bird> findById(String id) {
        return Optional.empty();
    }
}
