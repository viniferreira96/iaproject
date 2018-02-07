package filme;

import java.util.ArrayList;

public class KnnPonderado {

	private int k = 15; // número de clusters
	private ArrayList<Pontos> pontos;
	
	
	
	public KnnPonderado(){
		this.pontos = new ArrayList<Pontos>();
		
	}
	
	
	
	public int getK() {
		return k;
	}
	

	public ArrayList<Pontos> getPontos() {
		return pontos;
	}


	public void addPoint(Pontos p){
		
		this.pontos.add(p);
	}

	
	public Pontos getPontos(int num){
		
		return this.pontos.get(num);
	}
	public static double euclidianDistance(double xA, double yA, double xB, double yB){
		double auxA = (xA-xB)*(xA-xB);
		double auxB = (yA-yB)*(yA-yB);
		return Math.sqrt(auxA + auxB);
	}
	
}