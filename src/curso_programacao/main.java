package curso_programacao;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		System.out.println("Olá! Me informe seu peso e sua altura para que eu possa calcular seu IMC.");

		Scanner sc = new Scanner(System.in);

		System.out.print("Peso: ");

		int peso = sc.nextInt();

		System.out.print("Altura: ");

		double altura = sc.nextDouble();

		sc.close();

		double x = (altura * altura);

		double imc = peso / x;

		System.out.printf("Seu IMC é de: %.1f\n", imc);

		if (imc < 18.5) {
			System.out.println(
					"De acordo com a classificação da OMS, seu peso está abaixo do normal. Procure um especialista para analisar sua situação.");
		} else if (imc <= 24.9) {
			System.out.println("De acordo com a classificação da OMS, seu peso está adequado. Parabéns!");
		} else if (imc <= 29.9) {
			System.out.println(
					"De acordo com a classificação da OMS, seu peso está acima do normal. Consulte um médico e reveja hábitos para obter melhora. ");
		} else {
			System.out.println(
					"De acordo com a classificação da OMS, você está com obesidade grau I. Procure um médico o mais rápido possível.");
		}

	}

}