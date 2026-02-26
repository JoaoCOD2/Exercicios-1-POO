
package projetocaneta;


public class ProjetoCaneta {

    
    public static void main(String[] args) {
        System.out.println("Projeto Caneta");
        
        //Objeto caneta C1
        Caneta objcanetaPreta = new Caneta ();
        
        objcanetaPreta.cor = "Preta";
        objcanetaPreta.marca = "Bic";
        objcanetaPreta.tinta = 100;
        objcanetaPreta.ponta = 0.2;
        
        objcanetaPreta.imprimir();
        objcanetaPreta.tampar();
        objcanetaPreta.rabiscar();
        System.out.println("");
        
        Caneta objcanetaAzul = new Caneta ();
        
        objcanetaAzul.cor = "Azul";
        objcanetaAzul.marca = "Bic";
        objcanetaAzul.tinta = 70;
        objcanetaAzul.ponta = 0.2;
        
        objcanetaAzul.imprimir();
        objcanetaAzul.destampar();
        objcanetaAzul.rabiscar();
        System.out.println("");
        
        Caneta objcanetaVermelha = new Caneta ();
        
        objcanetaVermelha.cor = "Vermelha";
        objcanetaVermelha.marca = "Bic";
        objcanetaVermelha.tinta = 78;
        objcanetaVermelha.ponta = 0.2;
        objcanetaVermelha.imprimir();
                
        
    }
    
}
