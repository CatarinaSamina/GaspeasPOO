import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Testes {
	
	Ponto sr1 = new Ponto(0, 12);
	Ponto sr2 = new Ponto(0, 20);
	
	Ponto c = new Ponto(2, 15);
	Ponto d = new Ponto(-1, 14);
	Ponto e = new Ponto(-1, 16);
	Ponto f = new Ponto(0, 12);

	

	Poligono p = new Triangulo(c, d, e);

	@Test
	void testConstrutorSR() {
		assertThrows(IllegalArgumentException.class, () ->{
			new SegmentoDeReta(sr1, sr1);
		});
	}
	
	@Test
	void testConstrutorCirculo() {
		assertThrows(IllegalArgumentException.class, () ->{
			new Circulo(sr1, -5);
		});
	}
	
	@Test
	void testConstrutorRetangulo() {
		assertThrows(IllegalArgumentException.class, () ->{
			new Retangulo(sr1, sr1);
		});
	}
	
	@Test
	void testConstrutorTriangulo() {
		assertThrows(IllegalArgumentException.class, () ->{
			new Triangulo(sr1, sr1, sr2);
		});
		
		assertThrows(IllegalArgumentException.class, () ->{
			new Triangulo(sr1, sr2, sr2);
		});
		
		assertThrows(IllegalArgumentException.class, () ->{
			new Triangulo(sr2, sr2, sr2);
		});
	}

	@Test
	void testPoDirecao() {
		assertEquals(0, p.direcao(sr1, sr2, c));
		assertEquals(1, p.direcao(sr1, sr2, d));
		assertEquals(1, p.direcao(sr1, sr2, e));

	}
	
	@Test
	void testReInterseta() {
		Retangulo r = new Retangulo(c, d);
		Retangulo r1 = new Retangulo(d, e);

		assertTrue(r.interseta(sr1, sr2));
		assertFalse(r1.interseta(sr1, sr2));
	}
	
	@Test
	void testTrInterseta() {
		Triangulo tr = new Triangulo(c, d, e);

		assertTrue(tr.interseta(sr1, sr2));
	}
	
	Ponto centro = new Ponto(7, 4);
	Ponto centro1 = new Ponto(2, 2);
	Ponto sr11 = new Ponto(6, 4);
	Ponto sr22 = new Ponto(2, -3);
	
	int raio = 1;
	int raio1 = 2;
	
	Circulo cr = new Circulo(centro, raio);
	Circulo cr1 = new Circulo(centro1, raio1);
	Circulo cr2 = new Circulo(centro1, raio);
	
	@Test
	void testCrDistCentro() {
		assertEquals(7.0, cr.distCentro(sr1, sr2));
		assertEquals(2.0, cr1.distCentro(sr1, sr2));
	}
	
	@Test
	void testCrInterseta() {
		assertFalse(cr.interseta(sr1, sr2));
		assertTrue(cr.interseta(sr11, sr22));
		assertTrue(cr1.interseta(sr1, sr2));
		assertFalse(cr1.interseta(sr11, sr22));
		assertFalse(cr2.interseta(sr1, sr2));
		assertFalse(cr2.interseta(sr11, sr22));




		

	}
	
}
