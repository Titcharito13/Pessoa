package pessoa;

public class Pessoa {

    public static void main(String[] args) {
       
        Rico p1 = new Rico();
        Pobre p2 = new Pobre();
        Miseravel p3 = new Miseravel();
        
        p1.fazCompras();
        p2.trabalha();
        p3.mendiga();
        
    }
    
}
