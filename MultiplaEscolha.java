import java.util.Scanner;

public class MultiplaEscolha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tentativas = 0;
        boolean acertou = false;
        char resposta;

        do {
            tentativas++;

            System.out.println("\nQuestão de Matemática:");
            System.out.println("Qual é o resultado de 5 + 3 * 2?");
            System.out.println("(a) 16");
            System.out.println("(b) 11");
            System.out.println("(c) 13");
            System.out.println("(d) 10");
            System.out.println("(e) 8");
            System.out.print("Escolha uma alternativa: ");

            resposta = scanner.next().toLowerCase().charAt(0);

            switch (resposta) {
                case 'b':
                    System.out.println("Resposta correta!");
                    System.out.println("Você acertou na tentativa " + tentativas + ".");
                    acertou = true;
                    break;
                case 'a':
                case 'c':
                case 'd':
                case 'e':
                    System.out.println("Resposta incorreta.");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    tentativas--; // não conta tentativa inválida
                    break;
            }

        } while (!acertou && tentativas < 3);

        if (!acertou) {
            System.out.println("Resposta incorreta nas 3 tentativas.");
        }

        scanner.close();
    }
}