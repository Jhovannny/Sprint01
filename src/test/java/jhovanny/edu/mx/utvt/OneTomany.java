package jhovanny.edu.mx.utvt;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import jhovanny.edu.mx.utvt.entities.Alumno;
import jhovanny.edu.mx.utvt.entities.Categoria;
import jhovanny.edu.mx.utvt.repositories.CategoriaRepository;
import jhovanny.edu.mx.utvt.repositories.UsuarioRepository;

@SpringBootTest
public class OneTomany {

	
	@Autowired
	private UsuarioRepository usuarioRepository;
	@Test
	public void findOutUsuarioAndCategorias() {
		Alumno alumno=null;
		alumno=(Alumno)this.usuarioRepository.findById(11L).orElse(null);
		//alumno.getCategorias().forEach(e->System.out.println(e));
		
	}
	
	public void deleteLinkgUsuarioCategoria() {
		Alumno alumno=null;
		alumno=(Alumno)this.usuarioRepository.findById(11L).orElse(null);
		//alumno.getCategorias(null);
		this.usuarioRepository.save(null);
		
	}
	@Autowired
	private CategoriaRepository categoriasRepository;
	public void deleteCategori() {
		Long categoriaId=5L;
		Categoria categoria=null;
		
		categoria=this.categoriasRepository.findById(categoriaId).orElse(null);
		
		if(categoria !=null) {
			this.categoriasRepository.deleteById(categoriaId);
		}
	}
}
