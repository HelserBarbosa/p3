package pacote1;

    public class ContaPoupanša extends Conta {

	public ContaPoupanša(String nome, int agencia,double saldo) {
		super(nome, agencia,saldo);
	}

	public void calculaSaldo() {
		saldo += saldo * 0.005;
	}
}
