package Paquete.Ejercicio_14;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Arrays;
import java.util.Collections;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DatabaseProxyTest {
	    private DatabaseAccess database;
	    private DatabaseAccessProxy databaseProxy,databaseProxyFalse;

	    @BeforeEach
	    void setUp() throws Exception {
	        this.database = new DatabaseRealAccess();
	        this.databaseProxy = new DatabaseAccessProxy(database, true);
	        this.databaseProxyFalse = new DatabaseAccessProxy(database, false);
	    }

	    
	    //Busca los resultados si el user está logeado.
	    @Test
	    void testGetSearchResultsLogTrue() {
	        assertEquals(Arrays.asList("Spiderman", "Marvel"), this.databaseProxy.getSearchResults("select * from comics where id=1"));
	        assertEquals(Collections.emptyList(), this.databaseProxy.getSearchResults("select * from comics where id=10"));
	    }

	    //Usuarios no logeados 
	    @Test
	    void testGetSearchResultsLogFalse() {
	         Exception excepcionNoLog = assertThrows(RuntimeException.class, () -> {this.databaseProxyFalse.getSearchResults("select * from comics where id=1");});
	         assertEquals("Acceso denegado, el usuario no está logeado", excepcionNoLog.getMessage());
	    }
	  
	    
	    
	    //Busca los resultados si el user está logeado.
	    
	    @Test
	    void testInsertNewRow() {
	        assertEquals(3, this.database.insertNewRow(Arrays.asList("Patoruzú", "La flor")));
	        assertEquals(Arrays.asList("Patoruzú", "La flor"), this.database.getSearchResults("select * from comics where id=3"));
	    }
	    
	    @Test
	    void testInsertNewRowNoLog() {
	    	  Exception excepcionNoLog = assertThrows(RuntimeException.class, () -> {this.databaseProxyFalse.insertNewRow(Arrays.asList("Patoruzú", "La flor"));});
		         assertEquals("Acceso denegado, el usuario no está logeado", excepcionNoLog.getMessage());
		      }
}
	


