public class ContaCorrente extends Conta {
	public ContaCorrente(Cliente cliente) {
		super(cliente);
		this.tipoConta = "Corrente";

	}

	public void imprimirExtrato(){
		System.out.println("*** Extrato da Conta Corrente ***");
		super.imprimirInfosComuns();
		
	}
	
}
