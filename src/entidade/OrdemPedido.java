package entidade;

import java.util.ArrayList;
import java.util.List;

public class OrdemPedido {
	
	private Integer quantidade;
	private Double preco;
	
	private List <Produto> produtos = new ArrayList<>();
	
	public OrdemPedido() {
		}
	
	public OrdemPedido(Integer quantidade, Double preco) {
		this.quantidade = quantidade;
		this.preco = preco;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public Double subTotal() {
		return quantidade*preco;
	}
}
