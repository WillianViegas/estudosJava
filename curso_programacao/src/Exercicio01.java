import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

	}

	public static void ex01() {

		Scanner sc = new Scanner(System.in);

		int x;
		int y;
		int soma;

		System.out.println("Digite os valores:");

		x = sc.nextInt();
		y = sc.nextInt();

		soma = x + y;
		System.out.println(soma);
	}

	public static void ex02() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double raio = sc.nextDouble();
		double area;
		double pi = 3.14159;

		area = pi * Math.pow(raio, 2);

		System.out.printf("%.4f", area);
	}

	public static void ex03() {
		Scanner sc = new Scanner(System.in);

		int a, b, c, d, produto;

		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();

		produto = (a * b) - (c * d);

		System.out.println("Diferenca = " + produto);
	}

	public static void ex04() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int numero, horas;
		double valorHora, salario;

		numero = sc.nextInt();
		horas = sc.nextInt();
		valorHora = sc.nextDouble();

		salario = horas * valorHora;

		System.out.printf("Number = %d%n", numero);
		System.out.printf("Salary = U$ %.2f%n", salario);
	}

	public static void ex05() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int codigoP1, qntP1, codigoP2, qntP2;
		double valorUniP1, valorUniP2, valorP1, valorP2, valorTotal;

		codigoP1 = sc.nextInt();
		qntP1 = sc.nextInt();
		valorUniP1 = sc.nextDouble();

		valorP1 = qntP1 * valorUniP1;

		codigoP2 = sc.nextInt();
		qntP2 = sc.nextInt();
		valorUniP2 = sc.nextDouble();

		valorP2 = qntP2 * valorUniP2;

		valorTotal = valorP1 + valorP2;

		System.out.printf("VALOR A PAGAR: %.2f", valorTotal);
	}

	public static void ex06() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;

		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();

		triangulo = A * C / 2.0;
		circulo = 3.14159 * Math.pow(C, 2);
		trapezio = (A + B) / 2.0 * C;
		quadrado = Math.pow(B, 2);
		retangulo = A * B;

		System.out.printf("TRIANGULO: %.3f%n", triangulo);
		System.out.printf("CIRCULO: %.3f%n", circulo);
		System.out.printf("TRAPEZIO: %.3f%n", trapezio);
		System.out.printf("QUADRADO: %.3f%n", quadrado);
		System.out.printf("RETANGULO: %.3f%n", retangulo);

	}
}
