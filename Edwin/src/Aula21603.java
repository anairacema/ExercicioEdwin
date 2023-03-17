
import java.util.Scanner;

public class Aula21603 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a nota do aluno: ");
		int nota = sc.nextInt();
		String mens = "";
		switch (nota) {
		case 0: case 1: case 2: case 3: case 4:
			mens = "Reprovado";
			break;
		case 5: case 6:
			mens = "Recuperação";
			break;
		case 7: case 8: case 9: case 10:
			mens = "Aprovado";
			break;
		default:
			mens = "Erro na digitação da nota";
			break;
			
		}
		
		System.out.println("Resultado final: " + mens);
		
		
		
	}

}
