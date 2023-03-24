package jhovanny.edu.mx.utvt.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jhovanny.edu.mx.utvt.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	//crea el metodo para buscar por nombre de usuario
    User findByUsername(String username);
}
