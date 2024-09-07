import java.util.Scanner;

public class desafio2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("\n      ======MENU CALCULADORA======");
            System.out.println("Qual operação deseja realizar:");
            System.out.println("1 -> Adição;");
            System.out.println("2 -> Subtração;");
            System.out.println("3 -> Multiplicação;");
            System.out.println("4 -> Divisão;");
            System.out.println("5 -> Módulo;");
            System.out.println("6 -> Sair!");
            System.out.print("Digite aqui: ");
            opcao = entrada.nextInt();

            if ( opcao >= 1 && opcao <= 5){
                System.out.print("Qual o primeiro valor:");
                while (!entrada.hasNextInt()){
                    System.out.println("Valor inválido, apenas valor inteiro!");
                    entrada.nextInt();
                    System.out.print("Qual o primeiro valor:");
                }
                int valor1 = entrada.nextInt();

                System.out.print("Qual o segundo valor:");
                while (!entrada.hasNextInt()){
                    System.out.println("Valor inválido, apenas valor inteiro!");
                    entrada.nextInt();
                    System.out.print("Qual o segundo valor:");
                }
                int valor2 = entrada.nextInt();

                switch (opcao){
                    case 1:
                        int soma = valor1 + valor2;
                        System.out.printf("%d + %d = %d", valor1, valor2, soma);
                        break;
                    case 2:
                        int sub = valor1 - valor2;
                        System.out.printf("%d - %d = %d", valor1, valor2, sub);
                        break;
                    case 3:
                        int mult = valor1 * valor2;
                        System.out.printf("%d * %d = %d", valor1, valor2, mult);
                        break;
                    case 4:
                        if (valor2 != 0){
                            int divi = valor1 / valor2;
                            System.out.printf("%d / %d = %d",valor1, valor2,divi);
                        } else {
                            System.out.println("Divisor por 0 não permitido!");
                        }
                        break;
                    case 5:
                        if (valor2 != 0){
                            int mod = valor1 % valor2;
                            System.out.printf("%d mod %d = %d", valor1, valor2, mod);
                        } else {
                            System.out.println("Divisor por 0 não permitido!");
                        }
                        break;
                }

            } else if (opcao == 6) {
                System.out.println("Encerrando...");
            } else {
                System.out.println("Opção indisponivel!");
            }

        } while (opcao != 6);

        entrada.close();
    }
}
