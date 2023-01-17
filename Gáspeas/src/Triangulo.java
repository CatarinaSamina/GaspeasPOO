
public class Triangulo extends Poligono{
	Ponto a, b, c;
	
	public Triangulo(Ponto a, Ponto b, Ponto c) {
		if(a.equals(b) || a.equals(c) || b.equals(c))
			throw new IllegalArgumentException("Os pontos nao podem ser iguais");
		else {
			this.a = a;
			this.b = b;
			this.c = c;
		}
	}
	
	public boolean interseta(Ponto sr1, Ponto sr2) {
		
		if(direcao(sr1, sr2, a) != direcao(sr1, sr2, b))
			return true;
		else if (direcao(sr1, sr2, b) != direcao(sr1, sr2, c))
			return true;
		else if(direcao(sr1, sr2, c) != direcao(sr1, sr2, a))
			return true;
		else
			return false;
	}
}
