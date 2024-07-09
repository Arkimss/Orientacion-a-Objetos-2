package Paquete.ParcialTareas2023;

public class TareaSimple extends Tarea{

	private int tiempoEstimado;
    private EstadoTarea estado;
    private long instanteInicio;
    private long instanteFin;
    
    
	
	public TareaSimple(String descripcion, int tiempoEstimado) {
		super( descripcion);
		this.tiempoEstimado = tiempoEstimado; 
		this.estado = new NoIniciada();
		// TODO Auto-generated constructor stub
	}
   
	public void setEstado(EstadoTarea state) {
		this.estado = state;
	}
	
	@Override
	public int estimacionDeUnaTarea() {
		// TODO Auto-generated method stub
		return this.tiempoEstimado;
	}

	@Override
	public long tiempoUtilizadoEnUnaTarea() {
		// TODO Auto-generated method stub
		return this.estado.tiempoUtilizadoEnUnaTarea(this);
	}

	@Override
	public void iniciarTarea() {
		// TODO Auto-generated method stub
		this.estado.iniciarUnaTarea(this);
	}

	@Override
	public void completarTarea() {
		// TODO Auto-generated method stub
		this.estado.completarUnaTarea(this);
	}

	public void registrarInicio() {
		// TODO Auto-generated method stub
	   this.instanteInicio = System.currentTimeMillis();
	}
	
	public void registrarFin() {
		// TODO Auto-generated method stub
	   this.instanteFin = System.currentTimeMillis();
	}
	public long calcularTiempoUtilizado() {
		return this.instanteFin - this.instanteInicio;
	}
}
