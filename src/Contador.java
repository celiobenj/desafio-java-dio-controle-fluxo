import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
        Scanner terminal = new Scanner(System.in);

		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();

		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		try {
            //chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException exception) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}	
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if (parametroUm > parametroDois) throw new ParametrosInvalidosException();

		//realizar o for para imprimir os números com base na variável contagem
		int contagem = parametroDois - parametroUm;
        for (int número = 1; número <= contagem; número++) System.out.println("Imprimindo o número " + número);
	}
}