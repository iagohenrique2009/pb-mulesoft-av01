
public class Funcionario {
	
	private String nome;
	private double salario;
	
	
	public void bonificacao(){
		double somaValor = 0;
		
		if(this.salario<=1000) {
			somaValor=this.salario*0.2;
			System.out.println("Bonus: "+String.format("%.2f",somaValor));
		}
		
		else if(this.salario>1000 && this.salario<2000) {
			somaValor=this.salario*0.1;
			System.out.println("Bonus: "+String.format("%.2f", somaValor));
		}
		
		else if(this.salario >=2000) {
			somaValor=(this.salario*0.1);
			System.out.println("Desconto: "+String.format("%.2f",somaValor));
			somaValor=-1*(this.salario*0.1);
		}
		
		System.out.println("Salário liquido: "+(this.salario+somaValor) );
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	

}
