package ar.dev.leomartinez.portfoliobackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.dev.leomartinez.portfoliobackend.modelos.Usuario;

@Repository
public interface UserRepository extends JpaRepository <Usuario, Long>{
    
}
