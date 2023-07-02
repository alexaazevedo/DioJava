import java.util.ArrayList;

public class Main {
	
	
	public static void main(String[] args) {
	Cliente Alexandre = new Cliente("Alexandre");
	Cliente Joao = new Cliente("Joao");
	String nomeBanco = "Banco do Alexandre";
	Banco banco = new Banco(nomeBanco);
	ArrayList<Conta> contas = new ArrayList<Conta>();
			
			
	ContaCorrente ccA = new ContaCorrente(Alexandre);
	ContaPoupanca cpA = new ContaPoupanca(Alexandre);
	ContaCorrente ccJ = new ContaCorrente(Joao);
	ContaPoupanca cpJ = new ContaPoupanca(Joao);
	
	contas.add(ccA);
	contas.add(cpA);
	contas.add(ccJ);
	contas.add(cpJ);
	
	banco.setContas(contas);
	banco.listarContas();
	banco.listarClientes();
	}
}
