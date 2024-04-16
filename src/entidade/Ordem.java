package entidade;

import java.util.Date;

public class Ordem {
	private Date momentoDoPedido;
	private OrdemStatus status;
	
	public Ordem() {
		}
	public Ordem(Date momentoPedido, OrdemStatus status) {
		this.momentoDoPedido = momentoPedido;
		this.status = status;
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
}
