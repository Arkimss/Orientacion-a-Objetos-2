package Paquete.Ejercicio_12;

public class Impl4GAdapter implements Connection{
	private Connection4G conexion4G;
	@Override
	public String sendData(String data, int crc) {
		// TODO Auto-generated method stub
		return this.conexion4G.transmit();
	}

	@Override
	public String pic() {
		// TODO Auto-generated method stub
		return this.conexion4G.getSymb();
	}
	
}
