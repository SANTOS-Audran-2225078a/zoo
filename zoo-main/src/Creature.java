package td4;
public class Creature {
    private String nomEspece;
    private String sexe;
    private double poids;
    private double taille;
    private int age;
    private boolean faim;
    private boolean dort;
    private int sante;

   
    public Creature(String nomEspece, String sexe, double poids, double taille, int age) {
        this.nomEspece = nomEspece;
        this.sexe = sexe;
        this.poids = poids;
        this.taille = taille;
        this.age = age;
        this.faim = false;
        this.dort = false;
        this.sante = 100;
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
		System.out.println(nomEspece + "Ne peut pas se soigner ");
	
	}
	
}
public void dormir() {
	if (dormir==)
	System.out.println(nomEspece + "Est entrain de dormir");
	
}
public void vieillir() {
	System.out.println(nomEspece + "Vieillis");
	
}
public void Courir {
    system.out.println(nomEspece + "Courir");
}
public void Nager {
    system.out.println(nomEspece + "Nager");
}
public void Voler {
    system.out.println(nomEspece + "Voler");
}

    
    
    
// get and set
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

    public boolean aFaim() {
        return faim;
    }

    public void setFaim(boolean faim) {
        this.faim = faim;
    }

    public boolean dort() {
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


}
