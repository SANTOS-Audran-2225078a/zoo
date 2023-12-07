package lasauce.animaux;

//création de la classe dragon une créature mythique

public class Dragon {
    // attributs du dragon
    private String nomEspece;
    private String sexe;
    private double poids;
    private double taille;
    private int age;
    private int faim = 100;
    private int dort;
    private int sante = 100;
    private boolean courrir;
    private boolean nager;
    private boolean voler;
    private boolean pond;
    private boolean renaitre;

    // Constructeur pour initialiser les attributs du dragon
    public Dragon(String nomEspece, String sexe, double poids, double taille, int age) {
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
        else if (faim < 90) {
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
        if (sante < 80) {
            sante += 20;
            System.out.println(nomEspece + " mange et gagne de la vie. ");
        } else {
            System.out.println(nomEspece + "ne peut pas manger car sa santé est déjà au maximum. ");
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
        System.out.println((nomEspece + "Vieillis "));

    }

    // fonction pour simuler l'action de courrir
    public void courrir(String nomEspece) {
        System.out.println(nomEspece + " est entrain de courir et fait une activité physique.");
        sante -= 10;
        faim = Math.max(faim - 2, 0);
    }

    // fonction pour simuler l'action de renaitre

    // fonction pour simuler l'action de nager 
    public void nager() {
    if (nager) {
        System.out.println(nomEspece + " est entrain de nager et fait une activité physique. ");
        sante = Math.min(sante + 10, 100);
        faim = Math.max(faim - 2, 0);
        if (sante == 100) {
            nager = false;
            System.out.println(nomEspece + " arrête de nager car sa santé est au maximum. ");
        }
    } else {
        System.out.println(nomEspece + " ne nage pas. ");
    }
}
        // fonction pour simuler l'action de voler 
    public void voler() {
    if (voler) {
        System.out.println(nomEspece + " est entrain de voler et fait une activité physique. ");
        sante = Math.min(sante + 10, 100);
        faim = Math.max(faim - 2, 0);
        if (sante == 100) {
            voler = false;
            System.out.println(nomEspece + " arrête de voler car sa santé est au maximum. ");
        }
    } else {
        System.out.println(nomEspece + " ne vole pas. ");
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

    public boolean isNager() {
        return nager;
    }

    public void setNager(boolean nager) {
        this.nager = nager;
    }

    public boolean isVoler() {
        return voler;
    }

    public void setVoler(boolean voler) {
        this.voler = voler;
    }

    public boolean isPond() {
        return pond;
    }

    public void setPond(boolean pond) {
        this.pond = pond;
    }

    public boolean isRenaitre() {
        return renaitre;
    }

    public void setRenaitre(boolean renaitre) {
        this.renaitre = renaitre;
    }

}