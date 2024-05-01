package Paquete.Ejercicio7;

import java.util.List;

public class Directorio extends Contenido {

	private List<Contenido> documentos;
	@Override
	protected int calcularEspacioOcupadoEnBytes() {
		// TODO Auto-generated method stub
		return (32 * 1024) + this.documentos.stream().mapToInt(d -> d.calcularEspacioOcupadoEnBytes()).sum();
		}
	@Override
	protected Archivo archivoMasGrande() {
		// TODO Auto-generated method stub
		)
		return this.documentos.stream().max((d1,d2) -> d1.archivoMasGrande().);
	}
	}


