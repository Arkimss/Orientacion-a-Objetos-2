package Paquete.Ejercicio21;

import java.time.LocalDate;

public class Mamifero extends AbstractMamifero{
  private String identificador;
  private String especie;
  private LocalDate fechaNacimiento;
  private Mamifero padre;
  private Mamifero madre;

  	
  
	public Mamifero(String identificador, String especie, LocalDate fechaNacimiento, Mamifero padre, Mamifero madre) {
	this.identificador = identificador;
	this.especie = especie;
	this.fechaNacimiento = fechaNacimiento;
	this.padre = padre;
	this.madre = madre;
}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaDeNacimiento) {
		this.fechaNacimiento = fechaDeNacimiento;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public Mamifero getPadre() {
		return padre;
	}

	public void setPadre(Mamifero padre) {
		this.padre = padre;
	}

	public Mamifero getMadre() {
		return madre;
	}

	public void setMadre(Mamifero madre) {
		this.madre = madre;
	}

	public Mamifero getAbueloMaterno() {
		return  this.getMadre().getPadre();
	}

	public Mamifero getAbueloPaterno() {
		return this.getPadre().getPadre();
	}

	public Mamifero getAbuelaMaterna() {
		return this.getMadre().getMadre();
	}

	public Mamifero getAbuelaPaterna() {
		return this.getPadre().getMadre();
	}

	/*private boolean tienePadre() {
		return this.getPadre() != null;
	}*/

	/*private boolean tieneMadre() {
		return this.getMadre() != null;
	}*/

	private Mamifero buscar(Mamifero mamifero) {
		Mamifero Res = null;
		if (this == mamifero)
			Res = this;
		if ( Res == null)
			Res = this.getMadre().buscar(mamifero);
		if ( Res == null)
			Res = this.getPadre().buscar(mamifero);
		return Res;

	}

	/*
	 * public Boolean tieneComoAncestroA(Mamifero mamifero) { Mamifero resM =
	 * null;/* resultado madre Mamifero resP = null;// resultado padre if (mamifero
	 * != null && this != null) { return (this.tieneMadre() &&
	 * this.getMadre().buscar(mamifero.getIdentificador()) != null) ||
	 * ((this.tienePadre()) && (this.getPadre().buscar(mamifero.getIdentificador())
	 * != null)); } else return false; }
	 */

	private Boolean tieneComoAncestroA2(String mamifero) {
		Boolean esAncestro = false;
		if (this.getIdentificador().equals(mamifero)) {
			esAncestro = true;
		} else {
			
				esAncestro = this.getMadre().tieneComoAncestroA2(mamifero);
			if (esAncestro != true)
				esAncestro = this.getPadre().tieneComoAncestroA2(mamifero);
		}
		return esAncestro;
	}

	public boolean tieneComoAncestroA(Mamifero mamifero) {
		Boolean esAncestro = false;
		if (mamifero != null && !this.getIdentificador().equals(mamifero.getIdentificador())) {
			esAncestro = this.tieneComoAncestroA2(mamifero.getIdentificador());
		}
		return esAncestro;
	}


	/*public Boolean tieneComoAncestroA2(Mamifero mamifero) {
		Mamifero resM = null;
		Mamifero resP = null;// resultado padre
		if (mamifero != null && this != null) {
			if (this.tieneMadre())
				resM = this.getMadre().buscar(mamifero);
			if (this.tienePadre() && resM == null)
				resP = this.getPadre().buscar(mamifero);
			return (resM != null || resP != null);
		} else
			return false;
	}*/
}

