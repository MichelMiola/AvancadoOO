package cap4.encapsulamento;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Fatura {
	
	
	 private String cliente;
	    private double valor;
	    private List<Pagamento> pagamentos;
	    private boolean pago;

	    public Fatura(String cliente, double valor) {
	        this.cliente = cliente;
	        this.valor = valor;
	        this.pagamentos = new ArrayList<Pagamento>();
	        this.pago = false;
	    }

	    public String getCliente() {
	        return cliente;
	    }

	    public double getValor() {
	        return valor;
	    }

	    public List<Pagamento> getPagamentos() {
	    	return Collections.unmodifiableList(pagamentos);
	    }

	    public boolean isPago() {
	        return pago;
	    }

	    public void setPago(boolean pago) {
	        this.pago = pago;
	    }

	    public void adicionaPagamento(Pagamento pagamento)  {
	        this.pagamentos.add(pagamento);
	        if(valorTotalDosPagamentos()>this.valor)  {
	        	this.pago = true;
	        }
	    }

		private double valorTotalDosPagamentos() {
			double varlor = 0.0;
			
			for (Pagamento pagamento : pagamentos) {
				varlor = pagamento.getValor();
			}
			
			return varlor;
		}
	
}
