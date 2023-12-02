package lasauce;
//création de la classe Licorne une créature mythique
public class Licorne {
	// attributs de la Licorne
    private String nomEspece;
    private String sexe;
    private double poids;
    private double taille;
    private int age;
    private boolean faim;
    private boolean dort;
    private int sante;
    private boolean courrir;
    private boolean accoucher;

   // Constructeur pour initialiser les attributs de le Licorne
    public Licorne(String nomEspece, String sexe, double poids, double taille, int age) {
        this.nomEspece = nomEspece;
        this.sexe = sexe;
        this.poids = poids;
        this.taille = taille;
        this.age = age;
        this.faim = false;
        this.dort = false;
        this.sante = 100;
        this.courrir = courrir;
        this.accoucher = accoucher;
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
        System.out.println((nomEspece + "Vieillis"));

    }
	// fonction pour simuler l'action de dourir
	public void courrir() {
    if (courrir) {
        System.out.println(nomEspece + " est entrain de courir et fait une activité physique.");
        sante = Math.min(sante + 10, 100);
        faim = Math.max(faim - 2, 0);
        if (sante == 100) {
            courrir = false;
            System.out.println(nomEspece + " arrête de courir car sa santé est au maximum.");
        }
    } else {
        System.out.println(nomEspece + " ne court pas.");
    }
}
	
	// fonction pour simuler l'action d'accoucher
	public void accoucher() {
		if (accoucher == true) {
			System.out.println(nomEspece + "Est entrain d'accouché");
		}
			else if (accoucher == false) {
				System.out.println(nomEspece + "N'est pas entrain d'accouché'");
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


	public boolean isCourrir() {
		return courrir;
	}


	public void setCourrir(boolean courrir) {
		this.courrir = courrir;
	}


	public boolean isAccoucher() {
		return accoucher;
	}


	public void setAccoucher(boolean accoucher) {
		this.accoucher = accoucher;
	}
		

	
}
