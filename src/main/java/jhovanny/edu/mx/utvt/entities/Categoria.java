package jhovanny.edu.mx.utvt.entities;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tc_categorias")
public class Categoria  implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6831541716060626311L;
	
	@Id
	
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="nombre",nullable = false )
	private String nombre;

	
	
	@Column(name="descripcion",nullable = false )
	private String descripcion;
	@ManyToMany(mappedBy ="categorias")
	private List<Usuario> usuarios;
	
	private List<Publicacion> publicaciones;
	
	@Override
	public String toString() {
		return "Categoria [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + "]";
	}

    
	public void setPublicaciones(List<Publicacion> publicaciones) {
    	this.publicaciones= publicaciones;
    }
	

	
	

}
