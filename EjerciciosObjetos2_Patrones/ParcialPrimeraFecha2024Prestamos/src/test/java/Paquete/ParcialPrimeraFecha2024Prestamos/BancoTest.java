package Paquete.ParcialPrimeraFecha2024Prestamos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BancoTest {
	Banco banco;
	Simple prestamoSimple;
	Cliente cliente;
	@BeforeEach
	void setUp() throws Exception {
		banco = new Banco(0.05);
		 cliente = new Cliente("Ale", 5000);
    	
	}
    @Test
    public void testPrestamoSimple() {
    	 // mal instanciado, seria : Simple prestamoSimple=  banco.solicitarPrestamoSimple(...) 
    	prestamoSimple = banco.solicitarPrestamoSimple(100,10,cliente);
    	System.out.println(prestamoSimple.calcularMontoPagado());
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
