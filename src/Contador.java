import java.util.Scanner;

class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String message) {
        super(message);
    }
}

public class Contador {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int parametroUm = obterParametro(scanner, "Digite o primeiro parâmetro");
            int parametroDois = obterParametro(scanner, "Digite o segundo parâmetro");

            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    static int obterParametro(Scanner scanner, String mensagem) {
        System.out.println(mensagem);
        while (!scanner.hasNextInt()) {
            System.out.println("Entrada inválida. Por favor, digite um número inteiro:");
            scanner.next(); // Limpar o buffer
        }
        return scanner.nextInt();
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        System.out.println("Imprimindo os números entre " + parametroUm + " e " + parametroDois + ":");
        for (int i = parametroUm; i <= parametroDois; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
