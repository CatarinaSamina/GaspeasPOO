
public class Ponto {
	private int x, y;
	
	public Ponto(int x, int y) {
		this.x = x;
		this.y = y;
		
	}
	
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	
	public double dist(Ponto p) {
		double dx = x - p.x;
		double dy = y - p.y;
		
		return Math.sqrt(dx*dx + dy*dy);
	}
	

}
