import java.util.Scanner;

public class Pessoa {
	String Nome;
	String Sexo;
	int Altura;
	
	Scanner leia = new Scanner(System.in);
	// Cadastro
	public void cadastro() {
		System.out.println("Qual o nome da pessoa?");
		this.Nome = leia.next();
		System.out.println("Qual o sexo dela?(M ou F)");
		this.Sexo = leia.next().toUpperCase();
		//this.Sexo = this.Sexo.toUpperCase();
		
		if (this.Sexo.contentEquals("M")) {
			System.out.println("Qual altura dele?");
			this.Altura = leia.nextInt();
		}else {
			System.out.println("Qual altura dela?");
			this.Altura = leia.nextInt();
		}
	};
	
	// Verifica��o da altura
	
	public void estatura() {
		if (this.Sexo.contentEquals("M")) {
			if (this.Altura <= 165 ) {
				System.out.println("Voc� � baixo, pois possui apenas "+this.Altura+" de altura.");
			}else if (this.Altura <= 178) {
				System.out.println("Voc� tem uma altura mediana, pois possui "+this.Altura+" de altura.");
			}else {
				System.out.println("Voc� � alto, pois possui "+this.Altura+" de altura.");
			}
					
		}else if (this.Sexo.contentEquals("F")) {
			if (this.Altura <= 159 ) {
				System.out.println("Voc� � baixa, pois possui apenas "+this.Altura+" de altura.");
			}else if (this.Altura <= 170) {
				System.out.println("Voc� tem uma altura mediana, pois possui "+this.Altura+" de altura.");
			}else {
				System.out.println("Voc� � alta, pois possui "+this.Altura+" de altura.");
		
			}
	
		}else {
			System.out.println("Sexo invalido :(");
		}
	
	}
	
}
