import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cliente {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List <Retangulo> retangulos = new ArrayList<Retangulo>();
		List <Circulo> circulos = new ArrayList<Circulo>();
		List <Triangulo> triangulos = new ArrayList<Triangulo>();
		
		Ponto a = new Ponto(sc.nextInt(), sc.nextInt());
		Ponto b = new Ponto(sc.nextInt(), sc.nextInt());
			
		int nRetangulo = sc.nextInt();
		for(int i = 0; i < nRetangulo; i++)
			retangulos.add(new Retangulo (new Ponto(sc.nextInt(), sc.nextInt()), new Ponto(sc.nextInt(), sc.nextInt())));
		
		int nCirculo = sc.nextInt();
		for(int i = 0; i < nCirculo; i++)
			circulos.add(new Circulo(new Ponto(sc.nextInt(), sc.nextInt()), sc.nextInt()));
		
		int nTriangulo = sc.nextInt();
		for(int i = 0; i < nTriangulo; i++)
			triangulos.add(new Triangulo (new Ponto(sc.nextInt(), sc.nextInt()), new Ponto(sc.nextInt(), sc.nextInt()), new Ponto(sc.nextInt(), sc.nextInt())));
		
		sc.close();
		int result = 0;
		
		for(int i = 0; i < retangulos.size(); i++) {
			if(retangulos.get(i).interseta(a, b) == true)
				result ++;
		}
		
		for(int i = 0; i < circulos.size(); i++) {
			if(circulos.get(i).interseta(a, b) == true)
				result ++;
		}
		
		for(int i = 0; i < triangulos.size(); i++) {
			if(triangulos.get(i).interseta(a, b) == true)
				result ++;
		}
		
		
		System.out.println(result);
	}

}
