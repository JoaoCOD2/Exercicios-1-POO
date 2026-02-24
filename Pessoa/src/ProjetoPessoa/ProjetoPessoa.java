
package ProjetoPessoa;


public class ProjetoPessoa {

    
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Projeto pessoa!");
        
        Thread.sleep(2000);
        
        
        //Objeto apresentar P1
        Pessoa objApresentar = new Pessoa ();
        
        objApresentar.idade = 15;
        objApresentar.nome = "Alice";
        
        objApresentar.imprimir();
    }
    
}
