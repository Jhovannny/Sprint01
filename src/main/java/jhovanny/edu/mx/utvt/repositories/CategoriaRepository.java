package jhovanny.edu.mx.utvt.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import jhovanny.edu.mx.utvt.entities.Categoria;
import jhovanny.edu.mx.utvt.entities.User;

public interface CategoriaRepository extends JpaRepository<Categoria,Long> {

}
