package Paquete.Ejercicio_14;

import java.util.Collection;
import java.util.List;

public class DatabaseAccessProxy implements DatabaseAccess  {
	private DatabaseAccess database;
	private boolean isLog ;
	
	
	
	
	public DatabaseAccessProxy(DatabaseAccess database, boolean isLog) {
		this.database = database;
		this.isLog = isLog;
	}
	@Override
	public Collection<String> getSearchResults(String queryString) {
		if(!isLog) {
			throw new RuntimeException("Acceso denegado, el usuario no está logeado");
		}
			return database.getSearchResults(queryString);	
	}
	@Override
	public int insertNewRow(List<String> rowData) {
		if(!isLog) {
			throw new RuntimeException("Acceso denegado, el usuario no está logeado");
		}
			return database.insertNewRow(rowData);
	}
	
	
	
	
}
