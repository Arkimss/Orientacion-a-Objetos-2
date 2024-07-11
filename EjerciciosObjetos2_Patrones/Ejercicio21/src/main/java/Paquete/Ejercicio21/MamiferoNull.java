package Paquete.Ejercicio21;

import java.time.LocalDate;

public class MamiferoNull extends Mamifero{

	public MamiferoNull() {
		super("", "" , LocalDate.of(2020,03,05), new MamiferoNull(), new MamiferoNull());
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setIdentificador(String identificador) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getIdentificador() {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public String getEspecie() {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public void setEspecie(String mamifero) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPadre(Mamifero padre) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Mamifero getPadre() {
		// TODO Auto-generated method stub
		return new MamiferoNull();
	}

	@Override
	public void setMadre(Mamifero madre) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Mamifero getMadre() {
		// TODO Auto-generated method stub
		return new MamiferoNull();
	}

	@Override
	public Mamifero getAbuelaMaterna() {
		// TODO Auto-generated method stub
		return new MamiferoNull();
	}

	@Override
	public Mamifero getAbuelaPaterna() {
		// TODO Auto-generated method stub
		return new MamiferoNull();
	}

	@Override
	public Mamifero getAbueloMaterno() {
		// TODO Auto-generated method stub
		return new MamiferoNull();
	}

	@Override
	public Mamifero getAbueloPaterno() {
		// TODO Auto-generated method stub
		return new MamiferoNull();
	}

	@Override
	public LocalDate getFechaNacimiento() {
		// TODO Auto-generated method stub
		return LocalDate.now();
	}

	@Override
	public void setFechaNacimiento(LocalDate nacimiento) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean tieneComoAncestroA(Mamifero unMamifero) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

	/*@Override
	public void setIdentificador(String identificador) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getIdentificador() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getEspecie() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setEspecie(String mamifero) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPadre(Mamifero padre) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Mamifero getPadre() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setMadre(Mamifero madre) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Mamifero getMadre() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mamifero getAbuelaMaterna() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mamifero getAbuelaPaterna() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mamifero getAbueloMaterno() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mamifero getAbueloPaterno() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LocalDate getFechaNacimiento() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setFechaNacimiento(LocalDate nacimiento) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean tieneComoAncestroA(Mamifero unMamifero) {
		// TODO Auto-generated method stub
		return false;
	}

}

	*/