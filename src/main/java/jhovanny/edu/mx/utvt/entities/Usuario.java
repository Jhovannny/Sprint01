package jhovanny.edu.mx.utvt.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jhovanny.edu.mx.utvt.repositories.UsuarioRepository;

@Entity
@Inheritance(strategy =InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="tipo",discriminatorType=DiscriminatorType.INTEGER)
@Table(name="te_usaurios")
public abstract class Usuario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6930491684409568172L;
	@Autowired
	private UsuarioRepository usuarioRepository;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", nullable = false)
    private String nombre;
    @Column(name = "apellido", nullable = false)
    private String apellido;
    @Column(name = "fn", nullable = false)
    private Date fn;
    @Column(name = "correo", nullable = false, unique = true)
    private String correo;
    @Column(name = "contrasena", nullable = false)
    private String contrasena;
    @Column(name = "estado", nullable = false)
    private Boolean estado;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;
    
    @ManyToMany(cascade = CascadeType.ALL,  fetch=FetchType.EAGER)
    @JoinTable(name="tr_usuario_categoria",
    joinColumns=@JoinColumn(name="usuario_id",referencedColumnName="id"),
    inverseJoinColumns=@JoinColumn(name="categoria_id",referencedColumnName="id"))
    private List<Categoria> categorias;
    
  
    
   
       public Usuario() {
        // TODO Auto-generated constructor stub
    }

    public Usuario(String nombre, String apellido, Date fn, String correo, String contrasena, Boolean estado) {
        super();
        this.nombre = nombre;
        this.apellido = apellido;
        this.fn = fn;
        this.correo = correo;
        this.contrasena = contrasena;
        this.estado = estado;
    }

    public Usuario(Long id, String nombre, String apellido, Date fn, String correo, String contrasena, Boolean estado) {
        super();
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fn = fn;
        this.correo = correo;
        this.contrasena = contrasena;
        this.estado = estado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFn() {
        return fn;
    }

    public void setFn(Date fn) {
        this.fn = fn;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
