package entidade;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Ordem {
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
}
