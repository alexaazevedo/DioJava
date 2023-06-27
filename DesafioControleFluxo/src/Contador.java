import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro paramêtro: ");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo paramêtro: ");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo paramêtro deve ser maior que o primeiro!");
        }

    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        } else {
            int contagem = parametroDois - parametroUm;
            for (int i = 0; i < contagem; i++) {
                System.out.println("Imprimindo o número " + (i+1));
            }
       }
    }
}
