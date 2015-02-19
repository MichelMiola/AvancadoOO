package cap5.heranca;

public class ContaDeEstudante {

	private ManipulaSaldo manipulador;
	private int milhas;

	public ContaDeEstudante() {
		manipulador = new ManipulaSaldo();
	}
	
	public void saca(double valor) {
		this.manipulador.saca(valor);
	}
    
    public void deposita(double valor) {
		this.manipulador.deposita(valor);
	}
    
    public void rende() {
		this.manipulador.somaInvestimento();
	}

    public double getSaldo() {
		return manipulador.getSaldo();
	}
	
}
