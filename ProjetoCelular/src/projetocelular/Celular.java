
package projetocelular;


public class Celular {
    //Atributos
    String marca;
    int bateria;
    boolean ligado;
    
    public void ligar(){
       if (bateria > 0){
           ligado = true;
           System.out.println("Celular ligado!");
       }else {
           System.out.println("Carregue o celular.");
       }
    }
    
    public void desligar(){
        ligado = false;
        System.out.println("Celular desligado");
    }
    
    public void usarBatria (int consumo){
        if (!ligado){
            System.out.println("O celular esta delisgado");
        }
        
        if(bateria - consumo < 0){
            
        }else{
            bateria -= consumo;
        }
        
        System.out.println("Bateria atual: " + bateria + "%");
        
        if(bateria == 0){
            
            System.out.println("Bateria esgotando. Celular desligando...");
            desligar();
            
        }
    }
    
    
    public void status(){
        System.out.println("Marca " + marca);
        System.out.println("Bateria " + bateria);
        System.out.println("Ligado " + ligado);
    }
}
//Regras: So pode usar bateria se estiver ligado, nao permite batria negativa.