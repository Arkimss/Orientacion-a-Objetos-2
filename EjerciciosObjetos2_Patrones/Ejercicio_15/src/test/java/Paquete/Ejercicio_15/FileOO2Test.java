package Paquete.Ejercicio_15;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class FileOO2Test {
    FileDecorator file;
    DecoratorSize size;
    DecoratorName name;
    DecoratorExtension ext;
    DecoratorFechaDeCreacion fechaCreacion;
	Archivo archivo;
	DecoratorPermisos permisos;
	DecoratorFechaDeModificacion fechaDeModificacion;
	
	@BeforeEach
	void setUp() throws Exception {
	archivo = new Archivo("documentos", "txt", 5.9, (LocalDate.of(2020,02,20)),LocalDate.of(2020,02,20), "Admin");
	}
	
	//nombre - extensión
    @Test
    public void testPrettyPrintPrimerEjemplo() {
    	name= new DecoratorName(archivo);
    	ext = new DecoratorExtension(name);
    	
    	
    	assertEquals("documentos txt", ext.prettyPrint());
    
        
    }
    
    //nombre - extensión - fecha de creación
    @Test
    public void testPrettyPrintSegundoEjemplo() {
    	name= new DecoratorName(archivo);
    	ext = new DecoratorExtension(name);
    	fechaCreacion= new DecoratorFechaDeCreacion(ext);
    	assertEquals("documentos txt 2020-02-20", fechaCreacion.prettyPrint());
    
        
    }
  //  permisos - nombre - extensión - tamaño
    @Test
    public void testPrettyPrintTercerEjemplo() {
    	permisos = new DecoratorPermisos(archivo);
    	name = new DecoratorName(permisos);
    	ext= new DecoratorExtension(name);
    	size = new DecoratorSize(ext);
    	System.out.print(size.prettyPrint());
    	assertEquals(" Admindocumentos txt 5.9", size.prettyPrint());
    
        
    }
}
