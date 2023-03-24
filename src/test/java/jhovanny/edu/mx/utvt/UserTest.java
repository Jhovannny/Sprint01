package jhovanny.edu.mx.utvt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.Test;
import jhovanny.edu.mx.utvt.entities.User;
import jhovanny.edu.mx.utvt.repositories.UserRepository;

@SpringBootTest
public class UserTest {
	@Autowired
    private UserRepository userRepository;

    @Test
    public void crearUser() {
        String name = "Jhovanny";
        String pass = "123456";
        //crea el registro en la base de dates
        User user = new User(name, pass);
        this.userRepository.save(user);

        //guarda el registro en la base de datos
        System.out.println("User creado" + " " + user);
    }

    @Test
    public void actualizeUser() {
        User user = this.userRepository.findById(1L).orElse(null);

        if (user != null) {
            user.setUsername("Jesus");
            this.userRepository.saveAndFlush(user);

            System.out.println(user.getUsername());
            System.out.println(user.getPassword());
            System.out.println(user.getId());
        }

        System.out.println(user);
    }
}
