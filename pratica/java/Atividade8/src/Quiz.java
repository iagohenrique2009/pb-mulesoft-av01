import java.util.Scanner;
public class Quiz {
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pontos=0;
		
		String[] questoes = {"Qual foi o ultimo ano que o brasil ganhou a copa do mundo?",
				"Que ano surgiu o facebook",
				"Quantos dias sao necessarios para a terra girar o sol? ",
				"Qual o menor pais do mundo?",
				"Qual a empresa de carros mais antiga do mundo?",
				"De que cidade vieram os beattles?",
				"Qual é o planeta mais proximo do sol?",
				"Quantos planetas ha no nosso sistema solar?",
				"Qual foi o ano de lançamento do super Nintendo?",
				"Quantas cores há na bandeira do brasil",
				"Quantos braços tem um polvo?",
				"Qual o livro mais vendido no mundo ?",
		};
		
		String[] respostas = {"2002",
				"2004",
				"365",
				"vaticano",
				"peugeot",
				"liverpool",
				"mercurio",
				"8",
				"1990",
				"4",
				"8",
				"biblia"};
		
		System.out.println("Bem-vindo ao meu Quiz!!");
		System.out.println("Digite o seu nome Jogador: ");
		String nome= sc.nextLine();
		for(int i =0;i<questoes.length;i++) {
			System.out.println("Questao "+(i+1));
			System.out.println(questoes[i]+" Digite a respota abaixo: ");
			String resposta =sc.nextLine().toLowerCase();
			if(resposta.equals(respostas[i])) {
				pontos+=1;
			}
			
			
		}
		System.out.println("Jogador: "+nome);
		System.out.println("Acertos:" +pontos);
		System.out.println("Erros:"+(12-pontos));
		
		
	}

	

}
