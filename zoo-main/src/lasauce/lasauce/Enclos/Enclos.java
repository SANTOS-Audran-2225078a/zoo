package lasauce.Enclos;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import lasauce.animaux.Dragon;

public class Enclos {
    private int superficie;
    private int nbMax;
    private int nbInEnclos;
    private String proprete;
    private String occupant;
    public Enclos(int superficie, int nbMax, int nbInEnclos, String proprete, String occupant) {
        this.superficie = superficie;
        this.nbMax = nbMax;
        this.nbInEnclos = nbInEnclos;
        this.proprete = proprete;
        this.occupant = occupant;
    }
    public void getDonneeEnclos() {
        System.out.println("----------------------------------------------------");
        System.out.println(" Vous êtes dans l'enclos des " + occupant + " avec : ");
        System.out.print("- Une superficie de : ");
        System.out.println(superficie);
        System.out.println("----------------------------------------------------");
        System.out.print("Le nombre d'occupant étant de : ");
        System.out.print(nbInEnclos);
        System.out.print("/");
        System.out.println(nbMax);
        System.out.println("----------------------------------------------------");
        System.out.println("propreté : " + proprete);
    }
    public void nettoyerEnclos() {
        if(proprete == "Bon") {
            System.out.println("Enclos déjà propre");
        } else if(proprete == "Correct") {
            System.out.println("Nettoyage en cours...");
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                System.err.format("IOException: %s%n", e);
            }
            System.out.println("mettoyage fini, état de propreté : bon");
            proprete = "Bon";
        } else {
            System.out.println("Nettoyage en cours...");
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                System.err.format("IOException: %s%n", e);
            }
            System.out.println("mettoyage fini, état de propreté : Correct");
            proprete = "Correct";
        }
    }
    public void degradation() {
        if(proprete == "Bon") {
            proprete = "Correct";
        } else if(proprete == "Correct") {
            proprete = "Mauvais";
        } else {
            System.out.println("Nettoyage de l'enclos de : " + occupant + " est obligatoire !!");
        }
    }

}
