package Paquete.ParcialPrimeraFecha2024Prestamos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BancoTest {
	Banco banco;
	@BeforeEach
	void setUp() throws Exception {
		banco = new Banco(1);
	}
    @Test
    public void testPrestamoSimple() {
    	Simple prestamoSimple = new Simple(100,10,0.05);
    	banco.solicitarPrestamo(prestamoSimple,"Ale", 5000);
  
        assertEquals(0, prestamoSimple.calcularMontoPagado());
        prestamoSimple.pagarCuota();
        assertEquals(10.5, prestamoSimple.calcularMontoPagado());
        
     //   for (int i= 1; i < 10; i++) {
       // 	prestamoSimple.pagarCuota();
        //}
        //assertEquals(105, prestamoSimple.calcularMontoPagado());
        //prestamoSimple.pagarCuota();
        assertEquals(5103.95, prestamoSimple.calcularGastosDeCancelacion());
        
        assertEquals(94.5, prestamoSimple.calcularMontoRestante());
        
        assertEquals(10.5, prestamoSimple.determinarValorDeUnaCuota());
        
        
    }
}
