package jhovanny.edu.mx.utvt.entities;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
@Entity
@Table(name="te_publicaiones")
public class Publicacion implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7821140788666289425L;
	
	@ManyToOne
	private Usuario usuario;
	@JoinColumn(name="usuario_id",referencedColumnName= "id")
	
	
	@Id
	
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="nombre",nullable = false )
	private String nombre;

	
	@Column(name="summary",nullable = false )
	private String summary;
	
	
	@Column(name="descripcion",nullable = false )
	private String descripcion;
	
	@Column(name="estado")
	private Boolean estado;
	

	public void setPublicaciones(List<Publicacion> publicaciones) {
    	this.publicaciones= publicaciones;
    }
	
	 @OneToOne(cascade = CascadeType.ALL,  fetch=FetchType.EAGER,mappedBy="usuario")
	    public List<Publicacion> publicaciones;

	
	@Override
	public String toString() {
		return "Publicacion [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + "]";
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

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	    
}
