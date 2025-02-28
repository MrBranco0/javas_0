
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Escola a operação");
        System.out.println("1 Soma");
        System.out.println("2 Subtração");
        System.out.println("3 Multiplicação");
        System.out.println("4 Divisão");
        System.out.println("5- Sair");
        
        System.out.print("Escolha a operação: ");

        int escolha = input.nextInt();

        switch (escolha) {
            case 1:

            System.out.print("Primeiro numero: ");
            float num1 = input.nextFloat();

            System.out.print("Escolha o segundo numero: ");
            float num2 = input.nextFloat();

            float resposta = num1 + num2;

            System.err.println("A resposta é"+ resposta);
            

                
                break;
        
            default:
                break;
            
            case 2:

            System.out.print("Primeiro numero: ");
            float num3 = input.nextFloat();

            System.out.print("Escolha o segundo numero: ");
            float num4 = input.nextFloat();

            float resposta1 = num4 - num3;

            System.err.println("A resposta é"+ resposta1);

                break;
        }




    



    }
}