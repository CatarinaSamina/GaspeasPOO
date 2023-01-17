
public class Poligono extends FiguraGeometrica{
	
	public int direcao(Ponto a, Ponto b, Ponto c) {
		if((c.getY() - a.getY()) * (b.getX() - a.getX()) >= (b.getY() - a.getY()) * (c.getX() - a.getX())) {
			return 1;
		}
		else
			return 0;
	}
	
	
}
