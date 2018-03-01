package pacote1;

public abstract class Conta {
	private String nome;
	private int agencia;
	private static long NUMERO_CONTA = 0;
	private long numeroConta;
	protected double saldo;
	
	public Conta(String nome, int agencia,double saldo )
	{	
		this.nome = nome;
		this.agencia = agencia;
		this.saldo = saldo;
		this.numeroConta = geraNumeroConta();
	}
	
	public abstract void calculaSaldo();
	
	public double getSaldo() 
	{
		return this.saldo;
	}
	public void depositar(double montante) 
	{
		if(montante > 0) 
		{
		saldo+=montante;
		}
	}
	public void sacar(double montante)
	{
		if(montante <= saldo && montante > 0) 
		{
			saldo-=montante;
		}
	}
	public long geraNumeroConta() 
	{
		NUMERO_CONTA++;
		return NUMERO_CONTA;
	}
}