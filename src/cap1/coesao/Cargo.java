package cap1.coesao;

public enum Cargo {
	
	DESENVOLVEDOR(new DescontoDezOuVintePorcento()),
    DBA(new DescontoQuinzeOuVinteCincoPorcento()),
    TESTER(new DescontoQuinzeOuVinteCincoPorcento());
    
    private Desconto desconto;
    
    Cargo(Desconto desconto){
		this.desconto = desconto;
	}
    
    public Desconto getDesconto() {
		return desconto;
	}
}
