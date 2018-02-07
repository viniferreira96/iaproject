package filme;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.BufferedReader;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		
		Random r = new Random();
		FileReader arquivo = new FileReader("src/IAfileMovies2.txt");
		FileReader arquivoUsers = new FileReader("src/IAfileUsers.txt");
		KnnPonderado var = new KnnPonderado();
		Scanner sc = new Scanner(arquivo).useDelimiter("\\n|,"); // lerá o arquivo com os filmes
		Scanner scan = new Scanner(arquivoUsers).useDelimiter("\\n|,"); //lerá os arquivos com os usuários e avaliações
		Scanner scanner = new Scanner(System.in);
		ArrayList<Filme> filmes = new ArrayList<Filme>();
		
		boolean loop = true;
		int j = 0;
		int contador = 0;
		
		while(sc.hasNext()){ 
			
			String id = sc.next();
			String nome = sc.next();
			String gen1 = sc.next();
			String gen2 = sc.next();
			
			Pontos p = new Pontos(Double.valueOf(gen1),Double.valueOf(gen2), nome, Integer.valueOf(id));
			var.addPoint(p);
			
			System.out.println(p);
			
		}
		
		System.out.print("\n\n");
		
		
		
		// A partir deste ponto são realizadas as recomendações
		System.out.println("Digite seu id: ");
		int k = scanner.nextInt();
		Usuario user = new Usuario(k);
		
		while(scan.hasNext()){
			
			
			String id = scan.next();
			String idFilme = scan.next();
			String nota = scan.next();
			
			
			if(Integer.valueOf(id) > k)
				break;
			if(Integer.valueOf(id)== k){
				user.avaliacoes(Integer.valueOf(idFilme), Double.valueOf(nota));
		
			}
		}
		
			
		
		
		
		
		System.out.println(user.recomenda(var));
	
		
		scan.close();
		sc.close();
		scanner.close();
	
		}
	}

