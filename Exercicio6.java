import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        int soma = 0;
        int numeroDigitado;

        System.out.println("--- Somador de Números ---");
        System.out.println("Digite os números que deseja somar (ou 0 para encerrar):");

        
        do {
            System.out.print("Número: ");
            numeroDigitado = leitor.nextInt();
            
            soma += numeroDigitado; // Incrementador
            
        } while (numeroDigitado != 0); 

        System.out.println("--------------------------");
        System.out.println("A soma total é: " + soma);
        System.out.println("Programa encerrado.");

        leitor.close();
    }
}