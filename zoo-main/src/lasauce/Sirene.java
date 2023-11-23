package lasauce;

public class Sirene {
	private String nomEspece;
	private String sexe;
	private double poids;
	private double taille;
	private int age;
	private boolean faim;
	private boolean dort;
	private int sante;
	private boolean nager;
	private boolean accoucher;



	public Sirene(String nomEspece, String sexe, double poids, double taille) {
		this.nomEspece = nomEspece;
		this.sexe = sexe;
		this.poids = poids;
		this.taille = taille;
		this.age = age;
		this.faim = false;
		this.dort = false;
		this.sante = 100;
		this.nager = nager;
		this.accoucher = accoucher;
	}


	public void manger() {
		if (dort==false) {
			System.out.println(nomEspece + "Est entrain de manger");
		}
		else if (dort==true) {
			System.out.println(nomEspece + "ne peut pas manger pour le moment");
		}

	}



	public void son() {
		System.out.println(nomEspece + "Est entrain de rugir");
	}

	public void soin() {
		if (sante !=100) {
			System.out.println(nomEspece + "Est entrain de se soigner");
		}
		else if (sante ==100) {
			System.out.println(nomEspece + "Ne peut pas soigne pas ");

		}

	}

	public void dormir() {
		if (dort==true) {
			System.out.println(nomEspece + "Est entrain de dormir");
		}
		else if (dort == false) {
			System.out.println(nomEspece + "Ne dort pas");
		}
	}
	public void vieillir() {
		System.out.println(nomEspece + "Vieillis");

	}


	public void nager() {
		if (nager==true) {
			System.out.println(nomEspece + "Est entrain de nager");
		}
		else if (nager==false) {
			System.out.println(nomEspece + "Ne nage pas");
		}
	}



	public void accoucher() {
		if (accoucher == true) {
			System.out.println(nomEspece + "Est entrain d'accoucher'");
		}
		else if (accoucher == false) {
			System.out.println(nomEspece + "N'est pas entrain d'accoucher'");
		}
	}



}
}
