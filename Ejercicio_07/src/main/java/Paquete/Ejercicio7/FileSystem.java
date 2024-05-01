package Paquete.Ejercicio7;
import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
		
public class FileSystem {
	    private List<Contenido> documentos;

	    public FileSystem() {
	        this.documentos = new ArrayList<Contenido>();
	    }

	    // Retorna el espacio total ocupado, incluyendo todo su contenido.
	    public int tamanoTotalOcupado() {
	        return this.documentos.stream().mapToInt(c -> c.calcularEspacioOcupadoEnBytes()).sum();
	    }

	    
	     
	    public Archivo archivoMasGrande() {
	    	this.documentos.stream().max((doc1,doc2) -> doc1.mayorArchivo().  )
	    }

	    /**
	     * Retorna el archivo con fecha de creación más reciente en cualquier nivel 
	     * del filesystem
	     */
	    public Archivo archivoMasNuevo() {
	    
	    	return (Archivo) this.documentos.stream().sorted((doc2, doc1) -> 
	      	 ((Archivo) doc1).getFecha().compareTo(((Archivo) doc2).getFecha())).limit(1);
	    }

	    // Retorna el primer elemento con el nombre solicitado contenido en cualquier
	    // nivel del filesystem
	    public Contenido buscar(String nombre) {
	        // Implementación
	        return null;
	    }

	    // Retorna la lista con los elementos que coinciden con el nombre solicitado 
	    // contenido en cualquier nivel del filesystem
	    public List<Contenido> buscarTodos(String nombre) {
	        // Implementación
	        return null;
	    }

	    /**
	     * Retorna un String con los nombres de los elementos contenidos en todos los 
	     * niveles del filesystem. De cada elemento debe retornar el path completo
	     * (similar al comando pwd de linux) siguiendo el modelo presentado a
	     * continuación
	     * /Directorio A
	     * /Directorio A/Directorio A.1
	     * /Directorio A/Directorio A.1/Directorio A.1.1
	     * /Directorio A/Directorio A.1/Directorio A.1.2     
	     * /Directorio A/Directorio A.2
	     * /Directorio B
	     */
	    public String listadoDeContenido() {
	        // Implementación
	        return null;
	    }
	}
