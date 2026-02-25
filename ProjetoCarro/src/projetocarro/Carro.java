
package projetocarro;


public class Carro {
   //Atributos
    String marca;
    String modelo;
    boolean ligado;
    
    public void imprimir (){
        System.out.println("A marca do carro é " + marca);
        System.out.println("O modelo do carro é " + modelo);
        
        
    
}
    public void ligar (){
        ligado = true;

        System.out.println("Ligar");
        
    }
    public void desligar (){
        ligado = false;

        System.out.println("Desligar");
                 
    }
    
    public void status (){
        if (ligado == false){
            System.out.println("O carro está desligado");
        }else {
            System.out.println("O carro está ligado");
        }
            
    }
}
