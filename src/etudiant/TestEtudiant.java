package etudiant;

import java.util.Scanner;

public class TestEtudiant {

	public static void main(String[] args) {
		Etudiant etudiant = new Etudiant();
		System.out.println("Donnez le nom de l'étudiant ");
		Scanner clavier = new Scanner(System.in);
		String nom = clavier.nextLine();
		etudiant.travailler();
		etudiant.seReposer();
	}
}
