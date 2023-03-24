package jhovanny.edu.mx.utvt;

import java.util.Date;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import jhovanny.edu.mx.utvt.entities.Administrativo;
import jhovanny.edu.mx.utvt.entities.Alumno;
import jhovanny.edu.mx.utvt.repositories.UsuarioRepository;

public class Herencia {
	@Autowired
    private UsuarioRepository usuarioRepository;


    @Test
    public void addUsuario() {
        Alumno alumno = null;
        alumno = new Alumno("Mendoza", "Jhovanny", new Date(), "jhovanny@gmail.com", "123456", true);
        this.usuarioRepository.save(alumno);
        //si el proceso es correcto, se debe de ver en la base de datos
        System.out.println("Alumno agregado" + " " + alumno);
    }

    @Test
    public void addAdministrativo() {
        Administrativo administrativo = null;
        administrativo = new Administrativo("Luis", "Jhovanny", new Date(), "jhovanny@gmail.com", "123456", true, 10000.0);
        this.usuarioRepository.save(administrativo);
        //si el proceso es correcto, se debe de ver en la base de datos
        System.out.println("Administrativo agregado" + " " + administrativo);
    }
}
