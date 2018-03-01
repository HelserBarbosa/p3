package pacote2;
import java.util.Scanner;
import pacote1.Conta;
import pacote1.ContaPoupança;

public class ContaApp 
{
	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		int menu = 0;
		while(menu != 5) 
		{
			System.out.println("opções : Criar conta(1) Sacar(2) Depositar(3) VerSaldo(4) Sair(5)");
			menu = Integer.parseInt(teclado.nextLine());
			Conta conta = null;
			switch(menu) 
			{
				case 1:
				{
					System.out.println("Digite um nome, uma agencia e um deposito inicial para criar e se será conta corrente ou poupança");
					String nome = teclado.nextLine();
					int agencia = Integer.parseInt(teclado.nextLine());
					double deposito = Double.parseDouble(teclado.nextLine());
					String tipo = teclado.nextLine();
					if(tipo == "poupança") 
					{
						 conta = new ContaPoupança(nome,agencia,deposito);
					}
					if(tipo == "corrente") 
					{
						 conta = new ContaCorrente(nome,agencia,deposito);
					}
				}
					break;
				case 2:
				{
					System.out.println("Quanto gostaria de sacar");
					double montante = Double.parseDouble(teclado.nextLine());
					conta.sacar(montante);
				}
					break;
				case 3:
				{
					System.out.println("Quanto gostaria de depositar");
					double montante = Double.parseDouble(teclado.nextLine());
					conta.depositar(montante);	
				}
				break;
				case 4:
				{
					System.out.println("Saldo :" + conta.getSaldo());
				}
				break;
			}
		}
		teclado.close();
	}

}
