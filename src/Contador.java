import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        int parametroUm = 0;
        int parametroDois = 0;

        try {
            System.out.println("Digite o primeiro parâmetro");
            parametroUm = scanner.nextInt(); //12
            System.out.println("Digite o segundo parâmetro");
            parametroDois = scanner.nextInt(); //30
        } catch (Exception e) {
            System.out.println("Formato inválido. Digite um numero inteiro.");
        } finally {
            scanner.close();
        }
        
		
		try {
			contar(parametroUm, parametroDois);
		
		} catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException, InputMismatchException{
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = parametroDois - parametroUm;

        for(int i = 1 ; i <= contagem ; i++){
            System.out.println("Imprimindo o número "+ i);
        }
        
    }
}
