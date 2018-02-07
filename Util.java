package filme;
import java.util.ArrayList;
public class Util {

	public static double setEixoX(ArrayList<Filme>FilmesGenero1){
		double aux=0.0;
		int i = 0;
		if(FilmesGenero1.isEmpty()) return 0;
		for(i=0;i<FilmesGenero1.size();i++){
			aux = aux + FilmesGenero1.get(i).getCategoria1().getValor();
		}
		return aux/i;
	}
	
	public static double setEixoY(ArrayList<Filme>FilmesGenero2){
		double aux=0.0;
		int i = 0;
		if(FilmesGenero2.isEmpty()) return 0;
		for(i=0;i<FilmesGenero2.size();i++){
			aux = aux + FilmesGenero2.get(i).getCategoria2().getValor();
		}
		return aux/i;
	}
	
	public static double euclidianDistance(double xA, double yA, double xB, double yB){
		double auxA = (xA-xB)*(xA-xB);
		double auxB = (yA-yB)*(yA-yB);
		return Math.sqrt(auxA + auxB);
	}

}
