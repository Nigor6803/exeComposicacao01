package entidade;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Ordem {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private Date momentoDoPedido;
	private OrdemStatus status;
	
	private Cliente cliente;
	
	private List <OrdemPedido> item = new ArrayList<>();
	
	public Ordem() {
		}
	public Ordem(Date momentoPedido, OrdemStatus status,Cliente cliente) {
		this.momentoDoPedido = momentoPedido;
		this.status = status;
		this.cliente = cliente;
	}
	public Date getMomentoDoPedido() {
		return momentoDoPedido;
	}
	public void setMomentoDoPedido(Date momentoDoPedido) {
		this.momentoDoPedido = momentoDoPedido;
	}
	public OrdemStatus getStatus() {
		return status;
	}
	public void setStatus(OrdemStatus status) {
		this.status = status;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public List<OrdemPedido> getItens() {
		return item;
	}
	
	public void addIntens(OrdemPedido itens) {
		item.add(itens);
	}
	
	public void removeIntens(OrdemPedido itens) {
		item.remove(itens);
	}
	
	public double total() {
		double soma = 0;
		for (OrdemPedido it : item) {
			soma+=it.subTotal();
		}
		return soma;
	}
	
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("MOMENTO DO PEDIDO:");
		sb.append(sdf.format(momentoDoPedido)+"\n");
		sb.append("STATUS DO PEDIDO:");
		sb.append(status+"\n");
		sb.append("CLIENTE:");
		sb.append(cliente+"\n");
		sb.append("ORDEM DOS PEDIDOS:\n");
		for(OrdemPedido item: item) {
			sb.append(item);
			sb.append("\n");
		}
		sb.append("VALOR FINAL: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}
	
	
	
	
	
}
