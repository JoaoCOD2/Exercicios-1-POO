
package projetocarro;


public class ProjetoCarro {

    
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Projeto Carro!");
        
        Thread.sleep(1500);
        
        //Objeto carro
        Carro objCarro = new Carro ();
        
        objCarro.marca = "Toyota";
        objCarro.modelo = "Corolla";
        
        
        objCarro.imprimir();
        objCarro.status();
        objCarro.ligar();
        objCarro.status();
        
        
        
        
        
        
        
    }
    
}
