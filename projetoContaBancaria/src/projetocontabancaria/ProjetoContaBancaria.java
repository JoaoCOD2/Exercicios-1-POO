
package projetocontabancaria;


public class ProjetoContaBancaria {

    //
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Projeto Conta Bancaria!");
        
        Thread.sleep(1500);
        
        ContaBancaria objConta = new ContaBancaria();
        
        objConta.titular = "João";
        objConta.saldo = 145.90;
        
        objConta.mostrarSaldo();
        
        Thread.sleep(1500);
        
        System.out.println("Depositando R$500,00");
        
        Thread.sleep(1500);
        
        objConta.depositar(500);
        objConta.mostrarSaldo();
        
        Thread.sleep(1500);
        
        System.out.println("Sacando R$100,00");
        
        Thread.sleep(1500);
        
        objConta.sacar(100);
        objConta.mostrarSaldo();
        
        Thread.sleep(1500);
        
        
        
       
    }
    
}
