package lasauce.animaux;
//création de la classe Sirene une créature mythique
public class Sirene {
	// attributs de la Siréne
	private String nomEspece;
	private String sexe;
	private double poids;
	private double taille;
	private int age;
	private int faim = 100;
	private boolean dort;
	private int sante = 100;
	private boolean nager;
	private boolean accoucher;


// Constructeur pour initialiser les attributs de la Sirene
	public Sirene(String nomEspece, String sexe, double poids, double taille, int age) {
		this.nomEspece = nomEspece;
		this.sexe = sexe;
		this.poids = poids;
		this.taille = taille;
		this.age = age;
	}

	// fonction pour simuler l'action de manger 
	public void manger(String nomEspece) {
        if (sante < 95) {
            sante += 5;
            System.out.println(nomEspece + " mange et gagne de la vie. ");
        }
        if (faim < 90) {
            this.faim += 10;
            System.out.println(nomEspece + " a récupérer 10 de faim ");

        }else {
            System.out.println(nomEspece + "ne peut pas manger car sa santé est déjà au maximum. ");
        }
    }


	// fonction pour simuler l'action de faire du bruit
    public String son(String nomEspece) {
		if (faim < 50) {
			return nomEspece + " est entrain de rugir de faim ! Il est temps de lui donner à manger.";
		}
		return nomEspece + " est en train de rugirrrrrrrr";
	}

	// fonction pour simuler l'action de se soigner
	public void soin(String nomEspece) {
		if (sante <80) {
			System.out.println(nomEspece + "Est entrain de se soigner");
			sante+=20;
		}
		else{
			System.out.println(nomEspece + "Ne peut pas soigne pas ");
		}

	}
	// fonction pour simuler l'action de dormir
	public void dormir(String nomEspece) {
		if (sante < 80) {
        	System.out.println(nomEspece + " est entrain de dormir. ");
			sante += 20;
    	}
	}

	// fonction pour simuler l'action de vieillir
	 public void vieillir(String nomEspece) {
        age++;
        System.out.println((nomEspece + "Vieillis"));

    }

	// fonction pour simuler l'action de nager
	public void nager(String nomEspece) {
        System.out.println(nomEspece + " est entrain de nager et fait une activité physique.");
        sante -= 20;
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


	public int isFaim() {
		return faim;
	}


	public void setFaim(int faim) {
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


	public boolean isAccoucher() {
		return accoucher;
	}


	public void setAccoucher(boolean accoucher) {
		this.accoucher = accoucher;
	}
	public int getFaim() {
		return faim;
	}




}