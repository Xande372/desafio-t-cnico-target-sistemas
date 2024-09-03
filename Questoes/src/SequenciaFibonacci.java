import java.util.Scanner;

public class SequenciaFibonacci {

    // Método para verificar se um número pertence à sequência de Fibonacci.
    public static boolean Fibonacci(int num) {

        // Dois primeiros números da sequência.
        int a = 0, b = 1;

        // Verifica se o número informado é 0 ou 1, que fazem parte da sequência.
        if (num == a || num == b) {
            return true;
        }

        // Calcula a sequência de Fibonacci até que o número seja encontrado.
        int proxNum = a + b;
        while (proxNum <= num) {

            if(proxNum == num) {
                return true;
            }

            a = b;
            b = proxNum;
            proxNum = a + b;
        }

        return false;
    }

    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        // Usuário digita o número e salva o mesmo.
        System.out.println("Qual o número desejado?");
        int num = scanner.nextInt();

        // Verifica se o número pertence à sequência de Fibonacci.
        if(Fibonacci(num)) {
            System.out.println("O número " + num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + num + " não pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }
}
