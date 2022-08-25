import java.util.Scanner;
import java.time.LocalTime;
public class Validacao {
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			//var
			int horaAgora =LocalTime.now().getHour();
			int senhaCorreta=123;
			String loginCorreto="adm";
			
			
		System.out.println("Bem-vindo a tela de login ");
		
		//logim
		System.out.print("Insira o login: ");
		String login= sc.nextLine();
		System.out.print("Insira a senha: ");
		int senha =sc.nextInt();
		
		//se login errado
		if(senha != senhaCorreta || login.equals(loginCorreto)==false ) {
			System.out.println("Usuario e/ou senha incorretos.");
		// se login certo
		}else {
			
			if(horaAgora>=6 && horaAgora<12) {
				System.out.println("Bom dia, voce se logou ao nosso sistema");
			}
			
			else if(horaAgora>=12 && horaAgora<18) {
				System.out.println("Boa tarde,voce se logou ao nosso sistema");
			}
			
			else if(horaAgora>=18 && horaAgora<24) {
				System.out.println("Boa noite,voce se logou ao nosso sistema");
			}
			
			else if(horaAgora>=0 && horaAgora <6) {
				System.out.println("Boa madrugada,voce se logou ao nosso sistema");
			}
		}
		
		
		}
	

}
