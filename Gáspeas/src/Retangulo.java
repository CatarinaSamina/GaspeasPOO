
public class Retangulo extends Poligono{
	
	Ponto a, b;
	
	public Retangulo(Ponto a, Ponto b) {
		if(a.equals(b))
			throw new IllegalArgumentException("Os pontos nao podem ser iguais");
		else {
			this.a = a;
			this.b = b;
		}
	}
	
	
	
	public boolean interseta(Ponto sr1, Ponto sr2) {
		
		if(direcao(sr1, sr2, a) != direcao(sr1, sr2, b))
			return true;
		if(a.equals(sr1) || a.equals(sr2) || b.equals(sr1) || b.equals(sr2))
			return true;
		else
			return false;
	}

}
