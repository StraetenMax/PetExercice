package etudiant;

import java.util.Scanner;

public class TestEtudiant {

	public static void main(String[] args) {
		System.out.println("Donnez le nom de l'étudiant ");
		Scanner clavier = new Scanner(System.in);
		String nom = clavier.nextLine();
		Etudiant etudiant = new Etudiant(nom);
		etudiant.travailler();
		etudiant.seReposer();
		}
	}

