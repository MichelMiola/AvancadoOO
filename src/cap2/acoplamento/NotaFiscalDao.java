package cap2.acoplamento;

public class NotaFiscalDao implements AcoesDepoisDeGerarNota{
	
	@Override
	public void execute(NotaFiscal nf){
		System.out.println("salvou banco...");
	}
}
