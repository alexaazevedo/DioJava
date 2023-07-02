import java.util.ArrayList;
import java.util.List;

public class Banco {
	private String nome;
	private List<Conta> contas;
	private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	
	public void setContas(List<Conta> contas) {
		this.contas = contas;
		setClientes(contas);
		
	}
	
	private void setClientes(List<Conta> contas) {
		contas.forEach(conta -> {
			if (clientes.contains(conta.cliente)) {
				
			}else {
				clientes.add(conta.cliente);
			}
		});
		
	}
	public Banco(String nomeBanco) {
		this.nome = nomeBanco;
	}
	public String getNome() {
		return nome;
	}
	
	public void listarContas() {
		
		contas.forEach(conta -> {
			System.out.println(String.format("A conta de número %d é do tipo %s e pertence ao cliente %s",conta.getNumero(),conta.getTipoConta(),conta.getNomeCliente()));
		});
	}
	
	public void listarClientes() {
		System.out.println("*** Lista de Clientes ***");
		clientes.forEach(cliente -> {
			System.out.println(cliente.getNome());
		});
		
	}

}
