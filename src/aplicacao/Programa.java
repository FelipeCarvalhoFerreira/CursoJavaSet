package aplicacao;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

import model.entties.Usuario;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Set<Usuario> usuario = new HashSet<>();
		
		Integer quantidadeAlunos = 0;
		
		System.out.print("Quantos alunos para o curso A? ");
		quantidadeAlunos = sc.nextInt();
		Integer codigoUnico = 0;
		for (int i = 1; i <= quantidadeAlunos; i++) {
			codigoUnico = sc.nextInt();
			usuario.add(new Usuario(codigoUnico));
			
		}
		System.out.print("Quantos alunos para o curso B? ");
		quantidadeAlunos = sc.nextInt();
		for (int i = 1; i <= quantidadeAlunos; i++) {
			codigoUnico = sc.nextInt();
			usuario.add(new Usuario(codigoUnico));
		}
		
		System.out.print("Quantos alunos para o curso C? ");
		quantidadeAlunos = sc.nextInt();
		for (int i = 1; i <= quantidadeAlunos; i++) {
			codigoUnico = sc.nextInt();
			usuario.add(new Usuario(codigoUnico));
		}	
		System.out.print("Total de Alunos: ");
		System.out.println(usuario.size());
		sc.close();

		

	}

}
