package cap2.acoplamento;

public class EnviadorDeEmail implements AcoesDepoisDeGerarNota{

	@Override
	public void execute(NotaFiscal nf){
		System.out.println("mando email...");
	}
	
}
