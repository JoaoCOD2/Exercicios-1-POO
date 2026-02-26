
package projetocontabancaria;


public class ContaBancaria {
    //Atributos
    String titular;
    double saldo;
    
    public void imprimir (){
        System.out.println("Você está na conta de " + titular);
    }
    
    public void depositar(double valor){
        saldo += valor;
    }
    
    public void sacar (double valor){
        if (valor <= saldo){
            saldo -= valor;
            System.out.println("Valor sacado!");
        }else{
            System.out.println("Você nao pode savcar o valor!");
        }
        
    }
    
    public void mostrarSaldo(){
        System.out.println("Seu saldo atual é de R$" + saldo);
    }
}
