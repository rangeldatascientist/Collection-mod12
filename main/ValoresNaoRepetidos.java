package main;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class ValoresNaoRepetidos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				Set<Integer> numeros = new HashSet<>();
		        Scanner scanner = new Scanner(System.in);

		        // Solicitar ao usuário que digite 10 valores inteiros não repetidos
		        System.out.println("Digite 10 valores inteiros não repetidos:");

		        while (numeros.size() < 10) {
		            System.out.print("Valor " + (numeros.size() + 1) + ": ");
		            int numero = scanner.nextInt();
		            
		            // Verifica se o número já está no Set
		            
		            if (numeros.contains(numero)) {
		                System.out.println("O valor já foi inserido. Tente novamente.");
		            } else {
		                numeros.add(numero);
		            }
		        }

		        //Exibi todos os elementos da Collection Set usando Iterator
		        
		        System.out.println("\nElementos da Collection Set:");
		        Iterator<Integer> iterator = numeros.iterator();
		        while (iterator.hasNext()) {
		            System.out.println(iterator.next());
		        }
		        
		        scanner.close();
		    }
		

	}


