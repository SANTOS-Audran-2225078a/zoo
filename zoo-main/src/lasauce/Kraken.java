package lasauce;
//création de la classe kraken une créature mythique
public class Kraken {
    // attributs du Kraken
    private String nomEspece;
    private String sexe;
    private double poids;
    private double taille;
    private int age;
    private boolean faim;
    private boolean dort;
    private int sante;
    private boolean nager;
    private boolean pond;


// Constructeur pour initialiser les attributs du Kraken
    public Kraken(String nomEspece, String sexe, double poids, double taille) {
        this.nomEspece = nomEspece;
        this.sexe = sexe;
        this.poids = poids;
        this.taille = taille;
        this.age = age;
        this.faim = false;
        this.dort = false;
        this.sante = 100;
        this.nager = nager;
        this.pond = pond;
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
        if (sante < 90) {
            sante += 10;
            System.out.println(nomEspece + " mange et gagne de la vie. ");
        } else {
            System.out.println(nomEspece + "ne peut pas manger car sa santé est déjà au maximum. ");
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
        System.out.println((nomEspece + "Vieillis "));

    }
    // fonction pour simuler l'action de pondre
    public void pond() {
        if (pond == true) {
            System.out.println(nomEspece + "Est entrain de pondre ");
        }
        else if (pond == false) {
            System.out.println(nomEspece + "N'est pas entrain de pondre ");
        }
    }

    // fonction pour simuler l'action de nager
    public void nager() {
    if (nager) {
        System.out.println(nomEspece + " est entrain de nager et fait une activité physique.");
        sante = Math.min(sante + 10, 100);
        faim = Math.max(faim - 2, 0);
        if (sante == 100) {
            nager = false;
            System.out.println(nomEspece + " arrête de nager car sa santé est au maximum.");
        }
    } else {
        System.out.println(nomEspece + " ne nage pas.");
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


	public boolean isNager() {
		return nager;
	}


	public void setNager(boolean nager) {
		this.nager = nager;
	}


	public boolean isPond() {
		return pond;
	}


	public void setPond(boolean pond) {
		this.pond = pond;
	}


}
