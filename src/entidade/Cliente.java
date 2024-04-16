package entidade;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private String cliente;
	private String email;
	private Date aniversario;
	
	public Cliente() {
		}
	
	public Cliente (String cliente, String email, Date aniversario) {
		this.cliente = cliente;
		this.email = email;
		this.aniversario = aniversario;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getAniversario() {
		return aniversario;
	}

	public void setAniversario(Date aniversario) {
		this.aniversario = aniversario;
	}
	
	@Override
	public String toString() {
		return cliente +"("+sdf.format(aniversario)+") - " +email;
	}
}
