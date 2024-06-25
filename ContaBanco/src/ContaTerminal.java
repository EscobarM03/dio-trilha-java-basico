import java.util.Scanner;

public class ContaTerminal {
   public static void main(String[] args) {
	   //Importar a classe Scanner
	   Scanner mensagem =  new Scanner(System.in);
	 	
	  
	   
	   
	   //Exibe mensagem solicitando os dados
	   System.out.println("Informe o numero de sua conta: ");
	   //Obter pela Scanner os valores digitados no terminal 
	   int numero = mensagem.nextInt();
	   
	   System.out.println("Informe o numero da sua agencia: ");
	   String agencia = mensagem.next();
	   
	   System.out.println("Informe o valor de saldo: ");
	   Float saldo = mensagem.nextFloat();
	   
	   System.out.println("Informe o seu nome: ");
	   String nomeCliente = mensagem.next();
	   
	   //Exibir a mensagem da conta criada
	   System.out.println("\n Olá ".concat(nomeCliente).concat(", obrigado por criar uma conta em nosso banco, sua agência é ").concat(agencia)
			   .concat(" conta ") + numero + " e seu saldo " + saldo +
			   " já está disponível para saque");
	   
}
}
