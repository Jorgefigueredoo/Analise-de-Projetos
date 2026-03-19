import java.util.Scanner;

public class Exercicio4{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite suas três notas para saber a média:");

        System.out.println("Nota 1:");
        double nota1 = sc.nextDouble();
        System.out.println("Nota 2:");
        double nota2 = sc.nextDouble();
        System.out.println("Nota 3:");
        double nota3 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        if (media >= 7){
            System.out.printf("Parabêns, APROVADO com média: %s", media);
        }
        else if (media >= 5){
            System.out.printf("Ops!! Você está de recuperação, sua média é: $s ", media);
            
        }
        else{
            System.out.printf("Estudar Mais! Você foi reprovado, sua média é: $s ", media);
        }

        sc.close();


    }
}