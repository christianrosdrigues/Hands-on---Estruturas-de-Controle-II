import java.util.Scanner;

public class ContadorCaracteres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite aqui: ");
        String entrada = scanner.nextLine();

        int letras = 0;
        int numeros = 0;
        int espacos = 0;
        int outros = 0;

        for (int i = 0; i < entrada.length(); i++) {
            char c = entrada.charAt(i);

            if (Character.isLetter(c)) {
                letras++;
            } else if (Character.isDigit(c)) {
                numeros++;
            } else if (Character.isWhitespace(c)) {
                espacos++;
            } else {
                outros++;
            }
        }

        System.out.println("Quantidade de letras: " + letras);
        System.out.println("Quantidade de números: " + numeros);
        System.out.println("Quantidade de espaços: " + espacos);
        System.out.println("Quantidade de outros caracteres: " + outros);

        scanner.close();
    }
}