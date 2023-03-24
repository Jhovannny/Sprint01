package jhovanny.edu.mx.utvt;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import jhovanny.edu.mx.utvt.entities.Alumno;
import jhovanny.edu.mx.utvt.entities.Categoria;
import jhovanny.edu.mx.utvt.repositories.CategoriaRepository;
import jhovanny.edu.mx.utvt.repositories.UsuarioRepository;

@SpringBootTest
public class ManyToMany {
@Autowired
private UsuarioRepository usuarioRepository;
@Autowired
private CategoriaRepository categoriaRepository;


@Test
private void deleteCategoria() {
	long categoriaId=5L;
	Categoria categoria=null;
	
	categoria=this.categoriaRepository.findById(categoriaId).orElse(null);
	if(categoria != null) {
		this.categoriaRepository.deleteById(categoriaId);
	}
}
@Test
	public void addCategorias() {
		Alumno alumno =null;
		Categoria categoria1=null;
		Categoria categoria2=null;
		List<Categoria> categorias=null;
		
	alumno=(Alumno)this.usuarioRepository.findById(11L).orElse(null);
	
	//categoria1=new Categoria("Deportes","Eventos deportivos");
	//categoria2=new Categoria("Fiestas","Eventosde fin de semana");
	
	categorias=new ArrayList<Categoria>();
	categorias.add(categoria1);
	categorias.add(categoria2);
	alumno.getCategorias(categorias);
	this.usuarioRepository.save(alumno);

	}
	
	
}

