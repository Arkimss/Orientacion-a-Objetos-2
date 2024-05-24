package Paquete.Ejercicio_09;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class Excursion {
	 private String nombre;
	  private double costo;
	  private int cupoMinimo;
	  private int cupoMaximo;
	  private LocalDate fechaInicio;
	  private LocalDate fechaFin;
	  private String puntoDeEncuentro; 
	  private List<Usuario> UsuariosInscriptos;
	  private List<Usuario> UsuariosEnEspera;
	  private EstadoInscripcion estado;
	  
	  
	  
	  
	  public Excursion(String nombre, double costo, int cupoMinimo, int cupoMaximo, LocalDate fechaInicio,
			LocalDate fechaFin, String puntoDeEncuentro) {
		super();
		this.nombre = nombre;
		this.costo = costo;
		this.cupoMinimo = cupoMinimo;
		this.cupoMaximo = cupoMaximo;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.puntoDeEncuentro = puntoDeEncuentro;
		UsuariosInscriptos = new ArrayList<Usuario>();
		UsuariosEnEspera = new ArrayList<Usuario>();
		this.estado = new Provisoria();
	}


	public int cantidadDeInscripcionesFaltantesParaCupoMinimo() {
		  return this.cupoMinimo - this.UsuariosInscriptos.size();
	  }
	  
	  
	  public int cantidadDeInscripcionesFaltantesParaCupoMaximo(){
		  return this.cupoMaximo - this.UsuariosInscriptos.size();
	  }
	  
	  public void inscribirUsuario(Usuario user) {
		 this.estado.inscribirUsuario(user, this);
		  }
	  public EstadoInscripcion getEstado() {
		  return this.estado;
	  }

	public void cambiarEstado(EstadoInscripcion estado) {
		this.estado= estado;
	}


	public void addUsersInscriptos(Usuario user) {
		this.UsuariosInscriptos.add(user);
		
	}


	public void addUsersEnEspera(Usuario user) {
		this.UsuariosEnEspera.add(user);
		
	}
	
	public String obtenerInformacion() {
		String aux= this.nombre + this.costo + this.fechaInicio.toString() +  this.fechaFin.toString() + this.puntoDeEncuentro; 
		return aux + this.estado.obtenerInformacionExtra(this);	
	}
}
