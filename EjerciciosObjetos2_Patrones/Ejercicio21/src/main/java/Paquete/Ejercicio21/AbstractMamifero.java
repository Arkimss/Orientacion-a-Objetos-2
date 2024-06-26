package Paquete.Ejercicio21;


import java.time.LocalDate;



public abstract class AbstractMamifero {
	  public abstract void setIdentificador(String identificador);
	  public abstract String getIdentificador();  
	  public abstract String getEspecie();
	  public abstract void setEspecie(String mamifero );
	  public abstract void setPadre(Mamifero padre);
	  public abstract Mamifero getPadre();
	  public abstract void setMadre( Mamifero madre);
	  public abstract  Mamifero getMadre();
	  public abstract  Mamifero getAbuelaMaterna();
	  public abstract  Mamifero getAbuelaPaterna();
	  public abstract  Mamifero getAbueloMaterno();
	  public abstract  Mamifero getAbueloPaterno();
	  public abstract  LocalDate getFechaNacimiento();
	  public abstract  void  setFechaNacimiento( LocalDate nacimiento);
	  public abstract  boolean tieneComoAncestroA(Mamifero unMamifero);

}
