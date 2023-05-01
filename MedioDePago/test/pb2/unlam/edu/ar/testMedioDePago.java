package pb2.unlam.edu.ar;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class testMedioDePago {
	@Test
	public void queSePuedaCrearUnaTarjetaDeDebito() throws NumeroDeTarjetaInvalidoException {
		final Long NUMERO_ESPERADO=5446789813221201L;
		final String TITULAR_ESPERADO ="Patricia Sandoval";
		final Integer CODIGO_DE_SEGURIDAD_ESPERADO=123;
		final String FECHA_DE_VENCIMIENTO_ESPERADO="25/02/2030";
		final Double SALDO_ESPERADO=10000.0;
		Pagadora tarjetaDeDebito = new TarjetaDeDebito(NUMERO_ESPERADO,TITULAR_ESPERADO,FECHA_DE_VENCIMIENTO_ESPERADO,CODIGO_DE_SEGURIDAD_ESPERADO);
		((TarjetaDeDebito)tarjetaDeDebito).setSaldo(10000.0);
		
		assertEquals(NUMERO_ESPERADO,((TarjetaDeDebito)tarjetaDeDebito).getNumero());
		assertEquals(TITULAR_ESPERADO,((TarjetaDeDebito)tarjetaDeDebito).getTitular());
		assertEquals(CODIGO_DE_SEGURIDAD_ESPERADO,((TarjetaDeDebito)tarjetaDeDebito).getCodigoSeguridad());
		assertEquals(FECHA_DE_VENCIMIENTO_ESPERADO,((TarjetaDeDebito)tarjetaDeDebito).getFechaVencimiento());
		assertEquals(SALDO_ESPERADO,((TarjetaDeDebito)tarjetaDeDebito).getSaldo());
		
	}
	
	@Test
	public void queSePuedaCrearUnaTarjetaDeCredito() throws NumeroDeTarjetaInvalidoException{
		final Long NUMERO_ESPERADO=4246789813221201L;
		final String TITULAR_ESPERADO ="Sofia Barrientos";
		final Integer CODIGO_DE_SEGURIDAD_ESPERADO=567;
		final String FECHA_DE_VENCIMIENTO_ESPERADO="25/02/2030";
		final Double LIMITE_COMPRA_EN_PESOS=100000.0;
		final Double LIMITE_COMPRA_EN_DOLARES=1000.0;
		Pagadora tarjetaDeCredito = new TarjetaDeCredito(NUMERO_ESPERADO,TITULAR_ESPERADO,FECHA_DE_VENCIMIENTO_ESPERADO,CODIGO_DE_SEGURIDAD_ESPERADO,LIMITE_COMPRA_EN_PESOS,LIMITE_COMPRA_EN_DOLARES);
		
		
		assertEquals(NUMERO_ESPERADO,((TarjetaDeCredito)tarjetaDeCredito).getNumero());
		assertEquals(TITULAR_ESPERADO,((TarjetaDeCredito)tarjetaDeCredito).getTitular());
		assertEquals(CODIGO_DE_SEGURIDAD_ESPERADO,((TarjetaDeCredito)tarjetaDeCredito).getCodigoSeguridad());
		assertEquals(FECHA_DE_VENCIMIENTO_ESPERADO,((TarjetaDeCredito)tarjetaDeCredito).getFechaVencimiento());
		assertEquals(LIMITE_COMPRA_EN_PESOS,((TarjetaDeCredito)tarjetaDeCredito).getLimiteDeCompraEnPesos());
		assertEquals(LIMITE_COMPRA_EN_DOLARES,((TarjetaDeCredito)tarjetaDeCredito).getLimiteDeCompraEnDolares());
		
	}
	
	@Test
	public void queSePuedaCrearUnaCuentaBancaria() throws CBUInvalidoException{
		final String CBU_ESPERADO="01702046600000087865";
		final String ENTIDAD_ESPERADA="Santander";
		final String TITULAR_ESPERADO="Vicente De La Pradera";
		Transferible cuentaBancaria=new CuentaBancaria(CBU_ESPERADO,ENTIDAD_ESPERADA,TITULAR_ESPERADO);
		
		assertEquals(CBU_ESPERADO,((CuentaBancaria)cuentaBancaria).getCbu());
		assertEquals(ENTIDAD_ESPERADA,((CuentaBancaria)cuentaBancaria).getEntidad());
		assertEquals(TITULAR_ESPERADO,((CuentaBancaria)cuentaBancaria).getTitular());
	}
	
	@Test
	public void queSePuedaCrearUnaCuentaVirtual() throws CBUInvalidoException, CVUInvalidoException{
		final String CBU_ESPERADO="46467898132212011234552";
		final String ENTIDAD_ESPERADA="Mercado Pago";
		final String TITULAR_ESPERADO="Leticia Bridgeton";
		Transferible cuentaVirtual=new CuentaVirtual(CBU_ESPERADO,ENTIDAD_ESPERADA,TITULAR_ESPERADO);
		
		assertEquals(CBU_ESPERADO,((CuentaVirtual)cuentaVirtual).getCbu());
		assertEquals(ENTIDAD_ESPERADA,((CuentaVirtual)cuentaVirtual).getEntidad());
		assertEquals(TITULAR_ESPERADO,((CuentaVirtual)cuentaVirtual).getTitular());
	}

	@Test
	public void queSePuedaCrearUnComercio() throws CuitInvalidoException{
		final String NOMBRE_ESPERADO= "El almacen de la esquina";
		final Long CUIT_ESPERADO = 30215654124L;
		
		Comercio elAlmacen = new Comercio(CUIT_ESPERADO,NOMBRE_ESPERADO);
		assertEquals(NOMBRE_ESPERADO,elAlmacen.getNombre());
		assertEquals(CUIT_ESPERADO,elAlmacen.getCuit());
	}
	
	@Test
	public void queSePuedaCrearUnConsumidor(){
		final String NOMBRE_ESPERADO = "El almacen de la esquina";
		final Integer DNI_ESPERADO = 33458712;
		
		Consumidor elAlmacen = new Consumidor(DNI_ESPERADO,NOMBRE_ESPERADO);
		assertEquals(NOMBRE_ESPERADO,elAlmacen.getNombre());
		assertEquals(DNI_ESPERADO,elAlmacen.getDni());
	}
	
	@Test 
	public void queSePuedanAgregarComerciosALaBilletera() throws CuitInvalidoException{
		final Integer CANTIDAD_DE_COMERCIOS_ESPERADOS = 2;
		Billetera mataGalan = new Billetera("Ank");
		
		mataGalan.agregarComercio(new Comercio(30456213545L,"Supermercado"));
		mataGalan.agregarComercio(new Comercio(30215654124L,"Panaderia"));
		mataGalan.agregarComercio(new Comercio(30215654124L,"Panaderia"));
		assertEquals(CANTIDAD_DE_COMERCIOS_ESPERADOS,mataGalan.getCantidadDeComercios());
	}
	
	@Test 
	public void queSePuedanAgregarConsumidoresALaBilletera() throws CuitInvalidoException{
		final Integer CANTIDAD_DE_CONSUMIDORES_ESPERADOS = 2;
		Billetera mataGalan = new Billetera("Bna+");
		
		mataGalan.agregarConsumidor(new Consumidor(27541231,"Luis Gomez"));
		mataGalan.agregarConsumidor(new Consumidor(27541231,"Luis Gomez"));
		mataGalan.agregarConsumidor(new Consumidor(36541231,"Sofia Molina"));
		assertEquals(CANTIDAD_DE_CONSUMIDORES_ESPERADOS,mataGalan.getCantidadDeConsumidor());
	}
	
	@Test
	public void queSePuedanAgregarDistintosMediosDePagosALaBilleteraDeUnConsumidor() throws NumeroDeTarjetaInvalidoException, CBUInvalidoException, CVUInvalidoException {
		final Integer CANTIDAD_DE_MEDIOS_DE_PAGO_DEL_USUARIO_AGREGADO = 4;
		
		Billetera mataGalan = new Billetera("MercadoPago");
		mataGalan.agregarConsumidor(new Consumidor(27541231,"Luis Gomez"));
		
		mataGalan.agregarMedioDePagoAUnConsumidor(27541231,new TarjetaDeDebito(5446789813221201L,"Luis Gomez","10/10/2030",265));
		mataGalan.agregarMedioDePagoAUnConsumidor(27541231,new TarjetaDeDebito(5446789813221201L,"Luis Gomez","10/10/2030",312));
		mataGalan.agregarMedioDePagoAUnConsumidor(27541231,new TarjetaDeCredito(5423542385612354L,"Luis Gomez","10/10/2030",153,10000.0,50000.0));
		mataGalan.agregarMedioDePagoAUnConsumidor(27541231,new CuentaBancaria("01702046600000087865","Nacion","Luis Gomez"));
		mataGalan.agregarMedioDePagoAUnConsumidor(27541231,new CuentaVirtual("46467898132212011234552","Mercado de Pago","Luis Gomez"));
		assertEquals(CANTIDAD_DE_MEDIOS_DE_PAGO_DEL_USUARIO_AGREGADO, mataGalan.buscarCantidadMediosPagoPorConsumidor("Luis Gomez"));
	}
	
	@Test
	public void queSePuedaPagarConUnaTarjetaDeCredito() throws NumeroDeTarjetaInvalidoException, SaldoInsuficienteException, ExcedeLimiteDeCompraException {
		Billetera mataGalan = new Billetera("Ank");
		Pagadora medioPago=new TarjetaDeCredito(5423542385612354L,"Luis Gomez","10/10/2030",153,10000.0,50000.0);
		mataGalan.agregarConsumidor(new Consumidor(27541231,"Luis Gomez"));
		mataGalan.agregarMedioDePagoAUnConsumidor(27541231,(MedioDePago) medioPago);
		mataGalan.agregarComercio(new Comercio(30215654124L,"Panaderia"));
		Comercio comercio=mataGalan.buscarComercio(30215654124L);
		
		
		Compra codigoQR = mataGalan.generarCodigoQR(comercio,1000.0);
		Boolean resultado = mataGalan.pagar(codigoQR,medioPago);
		assertTrue(resultado);
	}
	
	@Test
	public void queSePuedaTransferirConUnaCuentaAOtra() throws CBUInvalidoException, SaldoInsuficienteException, ExcedeLimiteDeCompraException {
		Billetera mataGalan = new Billetera("Uala");
		Transferible cuentaOrigen=new CuentaBancaria("01702046600000087865","Nacion","Luis Gomez");
		cuentaOrigen.depositar(10000.0);
		
		Consumidor consumidorOrigen=new Consumidor(27541231,"Luis Gomez");
		mataGalan.agregarConsumidor(consumidorOrigen);
		mataGalan.agregarMedioDePagoAUnConsumidor(27541231,(MedioDePago)cuentaOrigen);
		Double IMPORTE_ESPERADO= 1000.0;
		
		
		
		Transferible cuentaDestino=new CuentaBancaria("01702046600000087335","Galicia","Sandra Bustos");
		Consumidor consumidorDestino=new Consumidor(33896541,"Sandra Bustos");
		mataGalan.agregarConsumidor(consumidorDestino);
		mataGalan.agregarMedioDePagoAUnConsumidor(33896541,(MedioDePago)cuentaDestino);
		Boolean resultado=mataGalan.transferir(cuentaOrigen,cuentaDestino,IMPORTE_ESPERADO);
		assertTrue(resultado);
	}
	
	@Test (expected=SaldoInsuficienteException.class)
	public void queNoSePuedaTransferirSiElSaldoNoEsSuficiente() throws CBUInvalidoException, SaldoInsuficienteException {
		Billetera mataGalan = new Billetera("Uala");
		Double IMPORTE_ESPERADO= 2000.0;
		Double IMPORTE_INICIAL= 1000.0;
		
		Transferible cuentaOrigen=new CuentaBancaria("01702046600000087865","Nacion","Luis Gomez");
		Consumidor consumidorOrigen=new Consumidor(27541231,"Luis Gomez");
		mataGalan.agregarConsumidor(consumidorOrigen);
		mataGalan.agregarMedioDePagoAUnConsumidor(27541231,(MedioDePago)cuentaOrigen);
		cuentaOrigen.depositar(IMPORTE_INICIAL);

		
		
		
		Transferible cuentaDestino=new CuentaBancaria("01702046600000087335","Galicia","Sandra Bustos");
		Consumidor consumidorDestino=new Consumidor(33896541,"Sandra Bustos");
		mataGalan.agregarConsumidor(consumidorDestino);
		mataGalan.agregarMedioDePagoAUnConsumidor(33896541,(MedioDePago)cuentaDestino);
		Boolean resultado=mataGalan.transferir(cuentaOrigen,cuentaDestino,IMPORTE_ESPERADO);
		assertFalse(resultado);
	}
	
	@Test (expected=SaldoInsuficienteException.class)
	public void queNoSePuedaComprarSiElSaldoDeLaTarjetaDeDebitoEsInsuficiente() throws ExcedeLimiteDeCompraException, SaldoInsuficienteException, NumeroDeTarjetaInvalidoException {
		Billetera mataGalan = new Billetera("Ank");
		Pagadora medioPago=new TarjetaDeDebito(5423542385612354L,"Luis Gomez","10/10/2030",153);
		mataGalan.agregarConsumidor(new Consumidor(27541231,"Luis Gomez"));
		mataGalan.agregarMedioDePagoAUnConsumidor(27541231,(MedioDePago) medioPago);
		mataGalan.agregarComercio(new Comercio(30215654124L,"Panaderia"));
		Comercio comercio=mataGalan.buscarComercio(30215654124L);
			
		Compra codigoQR = mataGalan.generarCodigoQR(comercio,1000.0);
		Boolean resultado = mataGalan.pagar(codigoQR,medioPago);
		assertFalse(resultado);

	}

	@Test (expected=ExcedeLimiteDeCompraException.class)
	public void queNoSePuedaComprarSiSeExcedeElLimiteDeCompraDeLaTarjetaDeCredito() throws ExcedeLimiteDeCompraException, NumeroDeTarjetaInvalidoException, SaldoInsuficienteException {
		Billetera mataGalan = new Billetera("Ank");
		Pagadora medioPago=new TarjetaDeCredito(5423542385612354L,"Luis Gomez","10/10/2030",153,1000.0,50000.0);
		mataGalan.agregarConsumidor(new Consumidor(27541231,"Luis Gomez"));
		mataGalan.agregarMedioDePagoAUnConsumidor(27541231,(MedioDePago) medioPago);
		mataGalan.agregarComercio(new Comercio(30215654124L,"Panaderia"));
		Comercio comercio=mataGalan.buscarComercio(30215654124L);
			
		Compra codigoQR = mataGalan.generarCodigoQR(comercio,2000.0);
		Boolean resultado = mataGalan.pagar(codigoQR,medioPago);
		assertFalse(resultado);
	}
}
