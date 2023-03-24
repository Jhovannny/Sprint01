package jhovanny.edu.mx.utvt.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import jhovanny.edu.mx.utvt.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
