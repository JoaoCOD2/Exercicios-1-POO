
package projetocaneta;

//### 🔹 Métodos
//- rabiscar()
//- tampar()
//- destampar()


public class Caneta {
    //Atributos
    int tinta;
    String cor;
    String marca;
    double ponta;
    boolean tampa; //True - false
    
    public void imprimir (){
        System.out.println("Cor de tinta = " + cor);
        System.out.println("% de tinta = " + tinta);
        System.out.println("Marca da tinta = " + marca);
        System.out.println("Ponta da tinta = " + ponta); 
    }
    
    public void tampar (){
        tampa = true;
        if(tampa == true){
            System.out.println("Caneta tampada!");
        }
    }
    
    public void destampar (){
        tampa = false;
        if(tampa == false){
            System.out.println("Caneta destampada!");
        }
}
    public void rabiscar (){
        if (tampa == true){
            System.out.println("Não é possivel rabiscar!");
        }else{
            System.out.println("É possivel rabiscar");
        }
    }
    
}

   
