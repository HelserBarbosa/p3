package pacote1;

    public class ContaPoupança extends Conta {

	public ContaPoupança(String nome, int agencia,double saldo) {
		super(nome, agencia,saldo);
	}

	public void calculaSaldo() {
		saldo += saldo * 0.005;
	}
}
