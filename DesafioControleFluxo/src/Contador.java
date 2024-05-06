import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        boolean processado = false;
        int parametroUm;
        int parametroDois;
        Scanner terminal = new Scanner(System.in);
        do {
            System.out.println("Digite o primeiro parâmetro");
            parametroUm = terminal.nextInt();
            System.out.println("Digite o segundo parâmetro");
            parametroDois = terminal.nextInt();

            try {
                //chamando o método contendo a lógica de contagem
                contar(parametroUm, parametroDois);
                processado = true;

            } catch (ParametrosInvalidosException exception) {
                //imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
                System.out.println("O segundo parâmetro deve ser maior que o primeiro");
                System.out.println("Por favor, tente novamente!!!");
            }
        } while(!processado);

    }
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if(parametroUm > parametroDois)
            throw new ParametrosInvalidosException();

        int contagem = parametroDois - parametroUm;
        //realizar o for para imprimir os números com base na variável contagem
        for(int i = 1; i <= contagem; i++){
            System.out.println("Imprimindo o número" + i);
        }
    }
}
