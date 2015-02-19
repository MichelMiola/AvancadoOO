package cap3.ocp.dip;

public class TestaCalculadoraDePrecos {

	public static void main(String[] args) {

		TabelaDePreco tabela = new TabelaDePrecoPadrao();
		ServicoDeEntrega entrega = new Frete();
		
		new CalculadoraDePrecos(tabela, entrega);

	}

}
