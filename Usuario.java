package filme;
import java.util.ArrayList;
import java.util.Random;

import filme.Pontos;

public class Usuario {
	
	private int id;
	private ArrayList<Integer> preferences; // recebe o id dos filmes bem avaliados
	private ArrayList<Integer> idFilmes; // recebe o id de todos os filmes avaliados
	
	
	public Usuario(int id){
		
		this.id = id;
		this.preferences = new ArrayList<Integer>();
		this.idFilmes = new ArrayList<Integer>();
	}
	
	public ArrayList<Integer> getPreferences() {
		return preferences;
	}
	public void setPreferences(ArrayList<Integer> preferences) {
		this.preferences = preferences;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public ArrayList<Integer> getIdFilmes() {
		return idFilmes;
	}
	public void setIdFilmes(ArrayList<Integer> idFilmes) {
		this.idFilmes = idFilmes;
	}
	
	public void avaliacoes(int id, double nota){

			this.idFilmes.add(id);
			
			if(nota >= 3.5)
				this.preferences.add(id);
		
	}
	
	public boolean contem(int num){
		
		for(Integer i: this.idFilmes){
			if(i == num)
				return true;
		}
		
		return false;
	}
	
	
	public String recomenda(KnnPonderado KNN){
		
		Random r = new Random();
		int movie = this.preferences.get(r.nextInt(this.preferences.size())); //escolhe aleatóriamente um dos filmes bem avaliados pelo usuário
		
		int count = 0;
		String retorno = "";
		String filmeAssistido = "";
		
	
		System.out.println("Porque você viu: " + filmeAssistido + "\nRecomendamos\n" );
		while(count<3){
						
		}
		
		
		
		return retorno;
		
	}
	
	

}
