package lasauce;
//création de la classe Lycanthrope une créature mythique
public class Lycanthrope extends meute {
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
    private int force;
    private int dominationsExercees;
    private int dominationsSubies;
    private String  rang;
    private int impetuosite;
    private Meute meute;

 // Constructeur pour initialiser les attributs du Lycanthrope
    public Lycanthrope(String nomEspece, String sexe, double poids, double taille) {
        this.nomEspece = nomEspece;
        this.sexe = sexe;
        this.poids = poids;
        this.taille = taille;
        this.age = age;
        this.force = genererForce(); 
        this.rang = rang;
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


    public void accoucher() {
        if (accoucher == true) {
            System.out.println(nomEspece + "Est entrain d'accouché'");
        }
        else if (accoucher == false) {
            System.out.println(nomEspece + "N'est pas entrain d'accouché'");
        }
    }
    
    public void interagirAvec(Lycanthrope lycanthrope1, Lycanthrope lycanthrope2) {
        // Comparaison de la force du premier lycanthrope avec celle du deuxième
        if (lycanthrope1.getForce() > lycanthrope2.getForce()) {
            lycanthrope1.augmenterDominationsExercees();
            lycanthrope2.augmenterDominationsSubies();
        } else if (lycanthrope1.getForce() < lycanthrope2.getForce()) {
            lycanthrope2.augmenterDominationsExercees();
            lycanthrope1.augmenterDominationsSubies();
        }
    }

    public int calculerFacteurDomination() {
        return dominationsExercees - dominationsSubies;
    }
    public void augmenterDominationsExercees() {
        dominationsExercees++;
    }

    public void augmenterDominationsSubies() {
        dominationsSubies++;
    }
    public void afficherCaracteristiques() {
    System.out.println("Nom de l'espèce : " + nomEspece);
    System.out.println("Sexe : " + sexe);
    System.out.println("Poids : " + poids);
    System.out.println("Taille : " + taille);
    System.out.println("Age : " + age);
    System.out.println("Force : " + force);
    System.out.println("Niveau : " + niveau);
    System.out.println("Rang : " + rang);
    System.out.println("FacteurDomination : " + FacteurDomination);
    System.out.println("Impetuosite : " + impetuosite);
    System.out.println("Meute : " + (meute != null ? "Appartient à une meute" : "Solitaire"));
}

    	private int genererForce() {
        return (int)(Math.random() * 10) + 1;
    }

    public int calculerNiveau() {
    int valeurAge = convertirAgeEnValeur();
    int niveau = valeurAge + this.force + calculerFacteurDomination() + this.rang;
    return niveau;
    }

    public void hurler() {
    System.out.println(nomEspece + " hurle.");
    if (sante < 20) {
        System.out.println(nomEspece + " hurle faiblement, montrant sa faiblesse.");
    } else if (impetuosite > 8) {
        System.out.println(nomEspece + " pousse un hurlement fort et impétueux.");
    } else if (meute != null) {
        System.out.println(nomEspece + " hurle pour communiquer avec sa meute.");
    } else {
        System.out.println(nomEspece + " pousse un hurlement solitaire.");
    }
    }

    public void entendreHurlement() {
    if (!dort && sante >= 50) {
        System.out.println(nomEspece + " entend un hurlement.");
        if (meute != null) {
            System.out.println(nomEspece + " se prépare à rejoindre sa meute en réponse au hurlement.");
        } else {
            System.out.println(nomEspece + " est attentif et cherche la source du hurlement.");
        }
        if (impetuosite > 7) {
            System.out.println(nomEspece + " répond par un hurlement fort, marquant son territoire.");
        }

    } else {
        System.out.println(nomEspece + " ne réagit pas au hurlement.");
    }
    }

    public void quitterMeute() {
    meute = null;
    System.out.println(nomEspece + " quitte sa meute.");

    public void seTransformerEnHumain() {
    System.out.println(nomEspece + " se transforme en humain.");
    sante = Math.max(sante - 30, 0);
    faim = Math.max(faim - 20, 0);
    System.out.println(nomEspece + " perd de la santé et de la faim à cause de la transformation.");
    dormir();
    }

    public void tenterDomination(Lycanthrope cible) {
    if (this == meute.getFemelleAlpha()) {
        System.out.println(nomEspece + " ne peut pas être dominée.");
        return;
    }

    if (this.impetuosite > cible.getImpetuosite() && (this.force >= cible.getForce() || cible.getRang().equals("ω"))) {
        accomplirDomination(cible);
    } else {
        System.out.println(nomEspece + " n'a pas réussi à dominer " + cible.getNomEspece());
        cible.reagirAgression(this);
    }
    }

    private void accomplirDomination(Lycanthrope cible) {
    String ancienRang = this.rang;
    this.rang = cible.getRang();
    cible.setRang(ancienRang);

    this.augmenterDominationsExercees();
    cible.augmenterDominationsSubies();

    System.out.println(nomEspece + " a dominé " + cible.getNomEspece() + " et échangé les rangs.");
    }

    private void reagirAgression(Lycanthrope agresseur) {
    System.out.println(nomEspece + " réagit agressivement à la tentative de domination de " + agresseur.getNomEspece());
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


	public String getAge() {
	    if (age >= 0 && age <= 100) {
	        return "Jeune";
	    } else if (age >= 101 && age <= 300) {
	        return "Adulte";
	    } else if (age >= 301 && age <= 370) {
	        return "Vieux";
	    } else {
	        return "Âge inconnu";
	    }
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

    public Meute getMeute() {
    return meute;
    }

    public void setMeute(Meute meute) {
    this.meute = meute;
    }


}
