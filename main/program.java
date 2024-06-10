package main;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		// Exercicio 01
		// Cria uma ArrayList para armazenar as cores
       List<String> cores = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que digite 4 cores
        System.out.println("Digite 4 cores:");

        for (int i = 0; i < 4; i++) {
            System.out.print("Cor " + (i + 1) + ": ");
            String cor = scanner.nextLine();
            cores.add(cor);
        }

        // Mostra todas as cores adicionadas
        System.out.println("\nCores adicionadas:");
        for (String cor : cores) {
            System.out.println(cor);
        }

        // Coloca as cores em ordem crescente
        List<String> coresOrdenadas = new ArrayList<>(cores);
        Collections.sort(coresOrdenadas);

        // Mostra todas as cores ordenadas em ordem crescente
        System.out.println("\nCores adicionadas (ordenadas):");
        for (String cor : coresOrdenadas) {
            System.out.println(cor);
        }

        // Não esquecer de fechar o scanner
        scanner.close();

	}




	}


