package br.com.fapen.estoque.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fapen.estoque.domain.entities.Login;

/**
 * LoginRepository
 */
@Repository
public interface LoginRepository extends JpaRepository<Login, Long>{    
}