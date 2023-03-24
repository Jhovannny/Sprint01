package jhovanny.edu.mx.utvt.entities;

import java.io.Serial;
import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity

@Table (name="users")
public class User implements Serializable {

    @Serial
    private static final long serialVersionUID=-1156945731802631833L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="username", nullable=false, unique=true)
    private String username;
    @Column(name="password", nullable=false)
    private String password;

    //OneToOne configuramos las relaciones
    @OneToOne(mappedBy = "user")
    private Usuario usuario;

    public User(String username, String password) {
        super();
        this.username = username;
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public void setPassword(String password) {
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public void findByUsername(String username) {
        this.username = username;

    }

}
