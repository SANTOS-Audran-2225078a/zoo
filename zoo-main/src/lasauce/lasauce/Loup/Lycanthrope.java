package lasauce.Loup;

import java.util.List;
import java.util.concurrent.TimeUnit;

import lasauce.Employee.Maitre;

//création de la classe Lycanthrope une créature mythique
public class Lycanthrope extends Meute{
	  // attributs du Lycanthrope
    private String nomEspece;
    private String sexe;
    private double poids;
    private double taille;
    private int age;
    private int faim=100;
    private int dort;
    private int sante=100;
    private boolean courrir;
    private boolean accoucher;

    private int force;
    private int dominationsExercees = 100;
    private int dominationsSubies = 50;
    private String  rang;
    private int rangPower;
    private int impetuosite;
    private String meute;
    


 // Constructeur pour initialiser les attributs du Lycanthrope
    public Lycanthrope(String nomEspece, String sexe, double poids, double taille, int age, String rang, int rangPower) {
        this.nomEspece = nomEspece;
        this.sexe = sexe;
        this.poids = poids;
        this.taille = taille;
        this.age = age;
        this.rang = rang;
        this.rangPower = rangPower;
    }
    // fonction pour simuler l'action de manger 
    public void manger(String nomEspece) {
        if (sante < 95 && sante >= 90) {
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
    public void son(String nomEspece) {
    if (faim < 50) {
        System.out.println(nomEspece + " est entrain de rugir de faim ! Il est temps de lui donner à manger.");
    } else {
        System.out.println(nomEspece + " est entrain de rugir smrrrr");
    }
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
    public void vieillir(String nomEspece) {
        age++;
    }
    public void courrir(String nomEspece) {
        System.out.println(nomEspece + " est entrain de courir et fait une activité physique.");
        sante -=20;
}
    public void interagirAvec(Lycanthrope lycanthrope1, Lycanthrope lycanthrope2) {
       
    }
    public int FacteurDomination() {
        return dominationsExercees - dominationsSubies;
    }
    //public void augmenterDominationsExercees() {
       
    //}
    //public void augmenterDominationsSubies() {
        
   // }
    private int genererForce() {
        return (FacteurDomination() - age) * rangPower;
    }
    public int calculerNiveau() {
        return age + genererForce() + rangPower;
    }
    //public void mourrir(Lycanthrope lycanDead, List<Lycanthrope> listLycan ,List<Lycanthrope> listLycanDead) {
    //    listLycan.remove(lycanDead);
    //    listLycanDead.add(lycanDead);
    //    System.out.println("-------------");
    //    System.out.println(lycanDead.getNomEspece() + " est mort ... ");
    //    System.out.println("-------------");
    //}
    public void seTransformerEnHumain() {
        
    }
    public void accomplirDomination(Lycanthrope defenseur) {
        System.out.println("-------------");
        System.out.println(getNomEspece() + " essaie d'exercer une domination sur " + defenseur.getNomEspece() + " ...");
        if(genererForce() < defenseur.genererForce()) {
            try {
			    TimeUnit.SECONDS.sleep(5);
			    System.out.println("-------------");
                System.out.println(defenseur.getNomEspece() +  " le défenseur a remporté la domination sur " + getNomEspece());
                defenseur.dominationsExercees += 30;
                dominationsSubies -= 30;
	        } catch (InterruptedException e) {
			    System.err.format("IOException: %s%n", e);
		    }
        } else {
             try {
			    TimeUnit.SECONDS.sleep(5);
			    System.out.println("-------------");
                System.out.println(getNomEspece() +  " l'attaquant a remporté la domination sur " + defenseur.getNomEspece());
                dominationsExercees += 30;
                dominationsSubies -= 30;
	        } catch (InterruptedException e) {
			    System.err.format("IOException: %s%n", e);
		    }
        }
    }
        public void seTransformerEnHumain(List<Maitre> allMaitre, List<Lycanthrope> allLycan, Lycanthrope myLycan) {
        Maitre newMaitre = new Maitre(myLycan.getNomEspece());
        allLycan.remove(myLycan);
        allMaitre.add(newMaitre);
    }
    public void combatMort(Lycanthrope agresseur, Lycanthrope agressé,  List<Lycanthrope> listLycan ,List<Lycanthrope> listLycanDead) {
        System.out.println("-------------");
        System.out.println(getNomEspece() + " va lancer un combat à mort contre " + agressé.getNomEspece() + " ... ");
        System.out.println("-------------");
        if(FacteurDomination() - agressé.FacteurDomination() < 0) {
            try {
			    TimeUnit.SECONDS.sleep(5);
			    System.out.println("-------------");
                System.out.println(agressé.getNomEspece() +  " le défenseur a tué " + getNomEspece());
                listLycan.remove(agresseur);
                listLycanDead.add(agresseur);
                System.out.println("-------------");
                System.out.println(agresseur.getNomEspece() + " est mort ... ");
                System.out.println("-------------");
	        } catch (InterruptedException e) {
			    System.err.format("IOException: %s%n", e);
		    }
        } else {
             try {
			    TimeUnit.SECONDS.sleep(5);
			    System.out.println("-------------");
                System.out.println(getNomEspece() +  " l'attaquant a tué " + agressé.getNomEspece());
                listLycan.remove(agresseur);
                listLycanDead.add(agresseur);
                System.out.println("-------------");
                System.out.println(agresseur.getNomEspece() + " est mort ... ");
                System.out.println("-------------");
	        } catch (InterruptedException e) {
			    System.err.format("IOException: %s%n", e);
		    }
        }
    }
    public void infoLoup() {
        System.out.println("--------------");
        System.out.println("Nom : " + getNomEspece());
        System.out.println("Age : " + getAge());
        System.out.println("Vie : " + getSante());
        System.out.println("Rang / puissanceRang : " + rang + "/" + rangPower);
        System.out.println("facteur Domination : " + FacteurDomination());
        System.out.println("Niveau : " + calculerNiveau());
        System.out.println("Puissance : "+ genererForce());
        System.out.println("--------------");
    }

	public String getNomEspece() {
		return nomEspece;
	}
    public String getRangEspece() {
        return rang;
    }
    public int getRangPower() {
        return rangPower;
    }
    public void getListeMort(String nom) {
        System.out.println(nom);
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
	public int getForce() {
	    return force;
	}
    public String getRang() {
    return rang;
    }

    public int getImpetuosite() {
    return impetuosite;
    }

    public void setImpetuosite(int impetuosite) {
    this.impetuosite = impetuosite;
    }


    public void setRang(String rang) {
    this.rang = rang;
}




}
