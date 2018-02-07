package filme;

public enum Categorias {
	 Musical(1),
	 Infantil(2),
	 Com�dia(3),
	 Anima��o(4),
	 Fantasia(5),
	 Fic��oCient�fica(6),
	 Aventura(7),
	 A��o(8),
	 Western(9),
	 Guerra(10),
	 Document�rio(11),
	 Romance(12),
	 Drama(13),
	 Crime(14),
	 FilmNoir(15),
	 Mist�rio(16),
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
