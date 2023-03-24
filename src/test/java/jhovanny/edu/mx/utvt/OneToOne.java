package jhovanny.edu.mx.utvt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

import org.junit.jupiter.api.Test;
import jhovanny.edu.mx.utvt.entities.Alumno;
import jhovanny.edu.mx.utvt.entities.User;
import jhovanny.edu.mx.utvt.repositories.UsuarioRepository;

@SpringBootTest
public class OneToOne {
	@Autowired
    private UsuarioRepository usuarioRepository;

    @Test
    public void addOneToOneRelationship(){
        //Primera relacion OneToOne
        User user1 = new User("Alextuner", "123456");
        Alumno alumno1 = new Alumno("Alex", "Santiago", new Date(), "alexsantiago@gmail.com" , "123456", true);
        alumno1.setUser(user1);
        this.usuarioRepository.save(alumno1);

        //Segunda relacion OneToOne
        User user2 = new User("Luis", "Luis123");
        Alumno alumno2 = new Alumno("Jesus", "Calderon", new Date(), "jesuscalderon@gmail.com", "123456", true);
        alumno2.setUser(user2);
        this.usuarioRepository.save(alumno2);
    }
    
    
}
