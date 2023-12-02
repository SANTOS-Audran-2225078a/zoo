package lasauce;

//création de la classe dragon une créature mythique

public class Dragon {
    // attributs du dragon
    private String nomEspece;
    private String sexe;
    private double poids;
    private double taille;
    private int age;
    private int faim;
    private int dort;
    private int sante = 100;
    private boolean courrir;
    private boolean nager;
    private boolean voler;
    private boolean pond;
    private boolean renaitre;

    // Constructeur pour initialiser les attributs du dragon
    public Dragon(String nomEspece, String sexe, double poids, double taille) {
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

    // fonction pour simuler l'action de courrir
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


    // fonction pour simuler l'action de pondre
    public void pond() {
        if (pond == true) {
            System.out.println(nomEspece + "Est entrain de pondre ");
        }
        else if (pond == false) {
            System.out.println(nomEspece + "N'est pas entrain de pondre ");
        }
    }

    // fonction pour simuler l'action de renaitre
    public void renaitre(Dragon listeMort, Dragon listeVivant){
        listeVivant.add(listeMort[0]);
        System.out.println(nomEspece + "Est entrain de renaitre ");
    }

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
