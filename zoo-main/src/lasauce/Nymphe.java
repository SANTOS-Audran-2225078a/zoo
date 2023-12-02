package lasauce;
//création de la classe Nymphe une créature mythique
public class Nymphe {
	// attributs de la Nymphe
	private String nomEspece;
	private String sexe;
	private double poids;
	private double taille;
	private int age;
	private boolean faim;
	private boolean dort;
	private int sante;
	private boolean accoucher;
	private boolean renaitre;

// Constructeur pour initialiser les attributs de la Nymphe
	public Nymphe(String nomEspece, String sexe, double poids, double taille) {
		this.nomEspece = nomEspece;
		this.sexe = sexe;
		this.poids = poids;
		this.taille = taille;
		this.age = age;
		this.faim = false;
		this.dort = false;
		this.sante = 100;
		this.accoucher = accoucher;
		this.renaitre = renaitre;
	}

	// fonction pour simuler l'action de manger 
	public void manger() {
        if (sante < 95) {
            sante += 5;
            System.out.println(nomEspece + " mange et gagne de la vie. ");
        }
        else if (faim < 90) {
            this.faim += 10;
            System.out.println(nomEspece + " a récupérer 10 de faim ");

        }else {
            System.out.println(nomEspece + "ne peut pas manger car sa santé est déjà au maximum. ");
        }
    }


	// fonction pour simuler l'action de faire du bruit
	public void son() {
    if (faim < 50) {
        System.out.println(nomEspece + " est entrain de rugir de faim ! Il est temps de lui donner à manger.");
    }
}

	// fonction pour simuler l'action de se soigner
	public void soin() {
		if (sante !=100) {
			System.out.println(nomEspece + "Est entrain de se soigner");
		}
		else if (sante ==100) {
			System.out.println(nomEspece + "Ne peut pas soigne pas ");

		}

	}
	// fonction pour simuler l'action de dormir
	public void dormir() {
    if (sante < 20) {
        sante = Math.min(sante + 10, 100);
        System.out.println(nomEspece + " est très faible et dort automatiquement pour récupérer. ");
    }
    else if (sante < 100) {
        System.out.println(nomEspece + " est entrain de dormir. ");
    }
    else {
        System.out.println(nomEspece + " ne dort pas car sa santé est déjà au maximum. ");
    }
}

	// fonction pour simuler l'action de vieillir
	 public void vieillir() {
        age++;
        System.out.println((nomEspece + "Vieillis"));

    }


	// fonction pour simuler l'action de renaitre
	public void renaitre(Dragon listeMort, Dragon listeVivant){
        listeVivant.add(listeMort[0]);
        System.out.println(nomEspece + "Est entrain de renaitre ");
    }

	// fonction pour simuler l'action de accoucher
	public void accoucher(){
		if (accoucher == true) {
			System.out.println(nomEspece + "Est entrain d'accoucher'");
		}
		else if (accoucher == false) {
			System.out.println(nomEspece + "N'est pas entrain d'accoucher");
		}
	}


	public String getNomEspece() {
		return nomEspece;
	}


	public void setNomEspece(String nomEspece) {
		this.nomEspece = nomEspece;
	}


	public String getSexe() {
		return sexe;
	}


	public void setSexe(String sexe) {
		this.sexe = sexe;
	}


	public double getPoids() {
		return poids;
	}


	public void setPoids(double poids) {
		this.poids = poids;
	}


	public double getTaille() {
		return taille;
	}


	public void setTaille(double taille) {
		this.taille = taille;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public boolean isFaim() {
		return faim;
	}


	public void setFaim(boolean faim) {
		this.faim = faim;
	}


	public boolean isDort() {
		return dort;
	}


	public void setDort(boolean dort) {
		this.dort = dort;
	}


	public int getSante() {
		return sante;
	}


	public void setSante(int sante) {
		this.sante = sante;
	}


	public boolean isAccoucher() {
		return accoucher;
	}


	public void setAccoucher(boolean accoucher) {
		this.accoucher = accoucher;
	}


	public boolean isRenaitre() {
		return renaitre;
	}


	public void setRenaitre(boolean renaitre) {
		this.renaitre = renaitre;
	}





}
