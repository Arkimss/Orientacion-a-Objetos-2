package Paquete.Ejercicio_11;

import java.time.LocalDate;

public class Proyecto {
 private String nombre; 
 private LocalDate fechaInicio;
 private LocalDate fechaFin;
 private String objetivo;
 private Double margenDeGanancia;
 private int CantidadIntegrantes;
 private double MontoPorIntegrante;
 private Etapa etapaDelProyecto;
public Proyecto(String nombre, LocalDate fechaInicio, LocalDate fechaFin, String objetivo,
		int cantidadIntegrantes, double montoPorIntegrante) {
	this.nombre = nombre;
	this.fechaInicio = fechaInicio;
	this.fechaFin = fechaFin;
	this.objetivo = objetivo;
	this.margenDeGanancia = 7.0;
	CantidadIntegrantes = cantidadIntegrantes;
	MontoPorIntegrante = montoPorIntegrante;
	this.etapaDelProyecto = new EnConstruccion();
}

public void aprobarEtapa() {
	this.etapaDelProyecto.aprobarEtapa(this);
}

public void cambiarEtapa(Etapa etapaNueva) {
	this.etapaDelProyecto = etapaNueva;
	
}
public double costoDelProyecto() {
	return this.CantidadIntegrantes * this.MontoPorIntegrante;
}

public double precioDelProyecto() {
	return this.costoDelProyecto() + (this.costoDelProyecto() * this.margenDeGanancia /100);
}

 
public void modificarMargenDeGanancia(double  margenDeGanancia) {
	this.etapaDelProyecto.modificarMargenDeGanancia(margenDeGanancia, this);
}

public void setMargen(double nuevoMargen) {
	this.margenDeGanancia = nuevoMargen;
}
 
public void cancelarProyecto() {
	if(!this.objetivo.equals("cancelado")) {
		this.objetivo= "cancelado";
	}
}

public Etapa getEtapa() {
	// TODO Auto-generated method stub
	return this.etapaDelProyecto;
}

public Double getMargenDeGanancia() {
	// TODO Auto-generated method stub
	return this.margenDeGanancia;
}
}
	