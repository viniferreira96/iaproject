package filme;

public class Filme {

	private int idFilme;
	private String nome;
	private Categorias categoria1;
	private Categorias categoria2;
	
	public Filme(int id, String nome, Categorias categoria){
		this.idFilme = id;
		this.nome = nome;
		this.categoria1 = categoria;
	}
	
	public int getIdFilme() {
		return idFilme;
	}
	public void setIdLocal(int idLocal) {
		this.idFilme = idLocal;
	}	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Categorias getCategoria1() {
		return categoria1;
	}
	public void setCategoria1(Categorias categoria) {
		this.categoria1 = categoria;
	}
	

	public Categorias getCategoria2() {
		return categoria2;
	}

	public void setCategoria2(Categorias categoria2) {
		this.categoria2 = categoria2;
	}

	@Override
	public String toString() {
		return "id=" + idFilme + " nome=" + nome + " categoria 1=" + categoria1 + " categoria2" + categoria2;
	}				
}
