package cap2.acoplamento;

import java.util.List;

public class GeradorDeNotaFiscal {

    private List<AcoesDepoisDeGerarNota> acoes;

	public GeradorDeNotaFiscal(List<AcoesDepoisDeGerarNota> acoes) {
		this.acoes = acoes;
    	
    }

    public NotaFiscal gera(Fatura fatura) {

        double valor = fatura.getValorMensal();

        NotaFiscal nf = new NotaFiscal(valor, impostoSimplesSobreO(valor));

        for (AcoesDepoisDeGerarNota acoesDepoisDeGerarNota : acoes) {
			acoesDepoisDeGerarNota.execute(nf);
		}

        return nf;
    }

    private double impostoSimplesSobreO(double valor) {
        return valor * 0.06;
    }
	
}
