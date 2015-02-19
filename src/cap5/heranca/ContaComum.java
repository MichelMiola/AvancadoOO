package cap5.heranca;

public class ContaComum {

	private ManipulaSaldo manipulador;
	
    public ContaComum() {
       this.manipulador = new ManipulaSaldo();
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
   
}
