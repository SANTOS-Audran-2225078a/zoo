package lasauce.Employee;
import java.util.Collections;
import java.util.List;

import lasauce.Loup.Lycanthrope;
import lasauce.animaux.*;

public class Maitre {
    private String nom;
    public Maitre(String nom) {
        this.nom = nom;
    }
    public void changerEnclos(List<String> enclosOrdre, String animaux1, String animaux2) {
       Collections.swap(enclosOrdre, enclosOrdre.indexOf(animaux1), enclosOrdre.indexOf(animaux2));
        System.out.println("Voici le nouvel ordre des animaux actuels : ");
		for(String elem : enclosOrdre) {
			System.out.println(elem);
        }
    }
    public String getName() {
        return nom;
    }
}
