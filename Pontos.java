package filme;
/*               Listagem num�rica dos g�neros cinematogr�ficos
 * 
 * 1- Musical
 * 2- Infantil
 * 3- Com�dia
 * 4- Anima��o
 * 5- Fantasia
 * 6- Fic��o Cient�fica
 * 7- Aventura
 * 8- A��o
 * 9- Western
 * 10- Guerra
 * 11- Document�rio
 * 12- Romance
 * 13- Drama
 * 14- Crime
 * 15- Film-Noir
 * 16- Mist�rio
 * 17- Suspense
 * 16- Terror
 */
public class Pontos {
	
	private String nome; // nome do filme
	private int id;      // c�digo do filme
	private double x;
	private double y;
	
	
	public Pontos(double x, double y, String nome, int id){
		this.x = x;
		if(y == 0)          //	As linhas de arquivo nas quais o filme possuia apenas um
			this.y = x;    // 	g�nero listado foram preenchidas com 0. Como essa estrat�gia
		else               //	poderia afetar os resultados no calculo das dist�ncias, 
			this.y = y;     //	estes pontos que no arquivos est�o setados em 0
		this.nome = nome;  //	s�o igualados ao primeiro ponto no construtor.
		this.id = id;
		
	}
	
	public Pontos(double x, double y){
		this.x = x;
		this.y = y;
		this.id = 0;
		this.nome = "Cluster Center";
	}
	
	
	public void setX(double x) {
		this.x = x;
	}

	
	public void setY(double y) {
		this.y = y;
	}
	
	public int getId(){
		return id;
	}


	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}
	
	// distancia euclidiana
	public static double euclidianDistance(Pontos ponto, Pontos centro){
		
		return Math.sqrt(Math.pow((centro.getX() - ponto.getX()), 2) + Math.pow((centro.getY() - ponto.getY()) , 2));
		
	}
	
	
	public static double ponderamento(double resultado, Pontos x, Pontos y){
		double w, temp = 0, resultadoPonderamento =0;
		
		w = 1/ resultado;
		
		temp = (w* (Math.pow(x.getX(), 2) + Math.pow(y.getY() , 2)));
		
		resultadoPonderamento = Math.sqrt(temp);
		return resultadoPonderamento;
	}
	
	public boolean equals(Pontos p){
		
		if((this.x == p.getX()) && (this.y == p.getY()))
			return true;
		else
			return false;
		
	}
	
	public String toString(){ 
		
		
		String formated = String.format("%d: %s (%.1f, %.1f )", this.id, this.nome, this.x, this.y);
		return formated;
		
	}
}
