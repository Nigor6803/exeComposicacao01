package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import entidade.Cliente;
import entidade.OrdemPedido;
import entidade.OrdemStatus;
import entidade.Produto;

public class Progama {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner edd = new Scanner(System.in);
		
		Cliente cli = new Cliente("Morgana","maria@gmail.com",sdf.parse("11/11/2018"));
		
		System.out.println(cli);
		edd.close();

	}

}
