package lasauce;
//création de la classe Lycanthrope une créature mythique
public class Lycanthrope {
	  // attributs du Lycanthrope
    private String nomEspece;
    private String sexe;
    private double poids;
    private double taille;
    private int age;
    private int faim;
    private int dort;
    private int sante;
    private boolean courrir;
    private boolean accoucher;


 // Constructeur pour initialiser les attributs du Lycanthrope
    public Lycanthrope(String nomEspece, String sexe, double poids, double taille) {
        this.nomEspece = nomEspece;
        this.sexe = sexe;
        this.poids = poids;
        this.taille = taille;
        this.age = age;
    }


 // fonction pour simuler l'action de manger 
    public void manger() {
        if (sante < 95) {
            sante += 5;
            System.out.println(nomEspece + " mange et gagne de la vie. ");
        } 
        else if (faim < 90) {
        	faim += 10;
        	System.out.println(nomEspece + " a récupérer 10 de faim ");
        	
        }else {
            System.out.println(nomEspece + "ne peut pas manger car sa santé est déjà au maximum. ");
        }
    }



    public void son() {
        System.out.println(nomEspece + "Est entrain de rugir");
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

    public void courrir() {
        if (courrir==true) {
            System.out.println(nomEspece + "Est entrain de courrir");
        }
        else if (courrir==false) {
            System.out.println(nomEspece + "Ne court pas");
        }
    }


    public void accoucher() {
        if (accoucher == true) {
            System.out.println(nomEspece + "Est entrain d'accouché'");
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


	public int getFaim() {
		return faim;
	}


	public void setFaim(int faim) {
		this.faim = faim;
	}


	public int getDort() {
		return dort;
	}


	public void setDort(int dort) {
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
