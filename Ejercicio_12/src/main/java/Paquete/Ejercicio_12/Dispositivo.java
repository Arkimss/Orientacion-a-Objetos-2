package Paquete.Ejercicio_12;

public class Dispositivo {
	private CRC crc;
	private Connection connection;
	private Ringer ring;
	
	public void cambiarCRC(CRC crc) {
		this.crc= crc;
	}
	
}
