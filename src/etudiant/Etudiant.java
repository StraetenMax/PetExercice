package etudiant;

public class Etudiant {
	private String nom;
	
	public String Etudiant(String nom){
		return this.nom = nom;
	}
	
	public void travailler(){
		System.out.println(this.nom+" se met au travail !");
	}
	public void seReposer(){
		System.out.println(this.nom+" se repose !");
	}
}
