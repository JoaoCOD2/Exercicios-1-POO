
package projetocelular;


public class Celular {
    //Atributos
    String marca;
    int bateria;
    boolean ligado;
    
    public void ligar(){
       ligado = true;
    }
    
    public void desligar(){
        ligado = false;
    }
    
    public void usarBatria (int consumo){
        if (bateria >= 0 && bateria <=100){
            System.out.println("Ligado");
        }else {
            System.out.println("Descarregado");
        }
    }
    
    public void status(){
        
    }
}
//Regras: So pode usar batreia se estiver ligado, nao permite batria negativa.