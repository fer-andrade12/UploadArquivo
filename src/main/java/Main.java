import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {

		FileInputStream entradaArquivo = new FileInputStream(new File("C:\\fernando\\arquivoTeste\\arquivo.txt"));
		
		Scanner lerArquivo = new Scanner(entradaArquivo, "UTF-8");
		
		List<Pessoa> listaPessoa = new ArrayList<Pessoa>();
		
		while (lerArquivo.hasNext()) {
			
			String linha = lerArquivo.nextLine();
			
			if (linha != null && !linha.isEmpty()) {
				
				String dados[] = linha.split("\\;");
				
				Pessoa pessoa = new Pessoa();
				
				pessoa.setNome(dados[0]);
				pessoa.setIdade(Integer.parseInt(dados[1]));
				
				listaPessoa.add(pessoa);
			}
			
		}
		
		for (Pessoa pessoas : listaPessoa) {
			System.out.println(pessoas);
		}
	}
	

}
