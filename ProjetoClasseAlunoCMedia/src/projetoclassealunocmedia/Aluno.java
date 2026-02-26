package projetoclassealunocmedia;

public class Aluno {
    // Atributos
    String nome;
    double nota1;
    double nota2;
    
    public void calcularMedia() {
        double media = (nota1 + nota2) / 2;
        System.out.println("A média é " + media);
    }
    
    public void verificarSituacao(){
        double media = (nota1 + nota2) /2; 
        if (media >= 7){
            System.out.println("Sua nota foi " + media + " você foi aprovado!");
        }
        else if (media >= 5) {
            System.out.println("Sua nota foi " + media + " você foi para recuperação");
        }
        else{
            System.out.println("Sua nota foi " + media + " você foi reprovado");
        }
    }
    
}