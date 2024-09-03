import java.util.Scanner;

public class VerificadorString {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Usuário digita a frase e salva a mesma em minúscula.
        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine().toLowerCase();

        // Para fazer a contagem, podendo ser alterada.
        char letraEscolhida = 'a';

        // Verifica cada caractere da String.
        int count = 0;
        for(int i = 0; i < frase.length(); i++) {
            if(frase.charAt(i) == letraEscolhida) {
                count++;
            }
        }

        // Exibir o resultado
        if (count > 0) {
            System.out.println("A letra 'a' tanto maiúscula quanto minúscula aparece " + count + " vezes na frase.");
        } else {
            System.out.println("A letra 'a' não aparece na frase.");
        }

        scanner.close();
    }
}
