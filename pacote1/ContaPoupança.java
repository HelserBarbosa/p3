package pacote1;

    public class ContaPoupan�a extends Conta {

	public ContaPoupan�a(String nome, int agencia,double saldo) {
		super(nome, agencia,saldo);
	}

	public void calculaSaldo() {
		saldo += saldo * 0.005;
	}
}
