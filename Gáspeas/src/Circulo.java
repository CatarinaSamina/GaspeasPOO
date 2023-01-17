
public class Circulo extends FiguraGeometrica{
	private Ponto meio;
	private int raio;
	
	
	public Circulo(Ponto meio, int raio) {
		this.meio = meio;
		if(raio < 0)
			throw new IllegalArgumentException("O raio nao pode ser negativo");
		else
			this.raio = raio;
	}
	
	public double declive(Ponto sr1, Ponto sr2) {
		double Ys = (sr2.getY() - sr1.getY());
		double Xs = (sr2.getX() - sr1.getX());
		double decl = Ys / Xs;
		return decl;
	}
	
	
	public double distCentro(Ponto sr1, Ponto sr2) {
		double distancia = 0;
		
		if(declive(sr1, sr2) == 0) {
			distancia = Math.sqrt(Math.pow(meio.getY() - sr1.getY(), 2));
		}
		
		else if(sr1.getX() == sr2.getX()){
			distancia = Math.sqrt(Math.pow(meio.getX() - sr1.getX(), 2));
		}
		
		else {
			double Bsr = sr1.getY() - (declive(sr1, sr2) * sr1.getX());
		//declive da perpendicular
			double PerDeclive = (-1 / declive(sr1, sr2));
		
			double BPer = (meio.getY() - (PerDeclive * meio.getX()));
		
		// coordenada x onde os sr de intersetam
			double XIntersecao = ((BPer - Bsr) / (declive(sr1, sr2) - PerDeclive));
		// coordenada y onde os nrs se intersetam
			double YIntersecao = ((declive(sr1, sr2) * XIntersecao) + Bsr);
		
			distancia = Math.sqrt(Math.pow((meio.getX() - XIntersecao), 2) + Math.pow((meio.getY() - YIntersecao), 2));
		}
		
		return distancia;
	}
	
	public boolean interseta(Ponto sr1, Ponto sr2) {
		if(distCentro(sr1, sr2) <= raio)
			return true;
		else
			return false;
	}
}
