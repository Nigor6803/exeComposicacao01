package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entidade.Cliente;
import entidade.Ordem;
import entidade.OrdemPedido;
import entidade.OrdemStatus;
import entidade.Produto;

public class Progama {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner edd = new Scanner(System.in);
		
		System.out.println("CLIENTE");
		System.out.print("NOME:");
		String nome = edd.nextLine();
		System.out.print("EMAIL:");
		String email = edd.nextLine();
		System.out.print("ANIVERSARIO:");
		Date diaDoAniversario = sdf.parse(edd.next());
		
		Cliente cliente = new Cliente(nome,email,diaDoAniversario);
		
		System.out.println("INFORMAÇÃO DO PEDIDO");
		System.out.print("STATUS:");
		OrdemStatus status = OrdemStatus.valueOf(edd.next());
		
		Ordem ordem = new Ordem(new Date(), status, cliente);
		
		System.out.println("QUANTIDADE DE INTENS:");
		int n = edd.nextInt();
		for (int i = 1;i<=n;i++) {
			System.out.println("PRODUTO N°"+i+":");
			System.out.print("PRODUTO:");
			edd.nextLine();
			String nomeProduto = edd.nextLine();
			System.out.print("PREÇO:");
			double precoProduto = edd.nextDouble();
			System.out.print("QUANTIDADE:");
			int quantidade = edd.nextInt();
			
			Produto produto = new Produto(nomeProduto,precoProduto);
			
			OrdemPedido it = new OrdemPedido(quantidade,precoProduto,produto);
			
			ordem.addIntens(it);
		}
		
		edd.close();
		

	}

}
