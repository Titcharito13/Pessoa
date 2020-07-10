package pessoa;

public class Rico {
    
    private double dinheiro = 999999;
    
    public double getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(double dinheiro) {
        this.dinheiro = dinheiro;
    }
    
    public void fazCompras(){
        System.out.println("Gastei milhares de reais hoje");
    }
    
}
