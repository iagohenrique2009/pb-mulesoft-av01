import java.util.Scanner;


public class CalculoDoBonus {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		double salario;
		String nome;
		
		System.out.print("Digite o numero de funcionarios que terao o bonus calculado: ");
		int x = sc.nextInt();
		
		
		Funcionario[] funcionarioArray = new Funcionario[x];
		
		
		for(int i=0;i<x;i++) {
			sc.nextLine();
			
			funcionarioArray[i] =new Funcionario();
			
			System.out.println("Digite o nome do funcionario: ");
			nome= sc.nextLine();
			funcionarioArray[i].setNome(nome);
			
			System.out.println("Digite o salario do funcionario: ");
			salario=sc.nextDouble();
			funcionarioArray[i].setSalario(salario);

			
			
		}
		
		
		System.out.println("Resultado do calculo do bônus: \n");
		
		for(int i=0;i<funcionarioArray.length;i++) {
			
			System.out.println("Funcionario: "+funcionarioArray[i].getNome());
			System.out.println("Salario:"+String.format("%.2f", funcionarioArray[i].getSalario()));
			funcionarioArray[i].bonificacao();
			System.out.println();
		}
		

	}

}
