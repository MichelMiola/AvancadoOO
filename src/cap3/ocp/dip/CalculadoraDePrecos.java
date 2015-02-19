package cap3.ocp.dip;

public class CalculadoraDePrecos {

	private ServicoDeEntrega entrega;
	private TabelaDePreco tabela;

	public CalculadoraDePrecos(TabelaDePreco tabela, ServicoDeEntrega entrega) {
		this.tabela = tabela;
		this.entrega = entrega;
	}
	
	public double calcula(Compra produto) {

        double desconto = tabela.descontoPara(produto.getValor());
        double frete = entrega.para(produto.getCidade());

        return produto.getValor() * (1-desconto) + frete;
    }
	
}
