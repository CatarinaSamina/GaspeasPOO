
public class SegmentoDeReta {
	private Ponto a, b;
	
	public SegmentoDeReta(Ponto a, Ponto b) {
		if(a.equals(b))
			throw new IllegalArgumentException("Os pontos nao podem ser iguais");
		else {
			this.a = a;
			this.b = b;
		}
	}
	
	public Ponto getInicio() {
		return a;
	}
	
	public Ponto getFim() {
		return b;
	}
	
	public Ponto pontomedio(Ponto a, Ponto b) {
		int x = (a.getX() + b.getX()) / 2;
		int y = (a.getY() + b.getY()) / 2;
		
		Ponto c = new Ponto(x, y);
		
		return c;
		
	}
}
