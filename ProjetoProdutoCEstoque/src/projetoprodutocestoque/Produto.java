
package projetoprodutocestoque;


public class Produto {
    //Atributos 
    String nome; 
    double preco;
    int quantidadeEstoque;
    
    public void vender (int quantidade){
     if (quantidade >= quantidadeEstoque){
         System.out.println("Vendendo " + nome);
     }else {
         System.out.println("Reponha " + nome + ", em falta!");
     }    
}   
    public void repor (int quantidade){
        if (quantidade < quantidadeEstoque){
            System.out.println("Produto indisponível, reponha o estoque");
        }
    }
    
    public void mostrarEstoque(){
        System.out.println("O estoque de " + nome + " é " + quantidadeEstoque);
    }
}
//Regra: Não vender mais do que ha no estoque