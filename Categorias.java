package filme;

public enum Categorias {
	 Musical(1),
	 Infantil(2),
	 Comédia(3),
	 Animação(4),
	 Fantasia(5),
	 FicçãoCientífica(6),
	 Aventura(7),
	 Ação(8),
	 Western(9),
	 Guerra(10),
	 Documentário(11),
	 Romance(12),
	 Drama(13),
	 Crime(14),
	 FilmNoir(15),
	 Mistério(16),
	 Suspense(17),
	 Terror(18);
	 
	 
	 public int valorCategoria;
	Categorias(int valor){
		valorCategoria = valor;
	}
	
	public int getValor(){
		return valorCategoria;
	}
}
