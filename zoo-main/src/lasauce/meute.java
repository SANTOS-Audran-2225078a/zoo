package lasauce;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class Meute {
    private Lycanthrope maleAlpha;
    private Lycanthrope femelleAlpha;
    private List<Lycanthrope> membres;

    public Meute(Lycanthrope maleAlpha, Lycanthrope femelleAlpha) {
        this.maleAlpha = maleAlpha;
        this.femelleAlpha = femelleAlpha;
        membres = new ArrayList<>();
        ajouterMembre(maleAlpha);
        ajouterMembre(femelleAlpha);
    }

    public void ajouterMembre(Lycanthrope lycanthrope) {
        membres.add(lycanthrope);
        lycanthrope.setMeute(this);
    }

    public void retirerMembre(Lycanthrope lycanthrope) {
        membres.remove(lycanthrope);
        lycanthrope.setMeute(null);
    }

    public void organiserHierarchie() {
        membres.sort(Comparator.comparing(Lycanthrope::getRang));
    }

    public void identifierLycanthropesOmega() {
        for (Lycanthrope lycanthrope : membres) {
            if (lycanthrope.getForce() < 3) {
                lycanthrope.setRang("ω");
            }
        }
    }

    public void reorganiserHierarchie() {
        membres.sort(Comparator.comparing(Lycanthrope::getRang));
    }

    public void changerRang(Lycanthrope lycanthrope, String nouveauRang) {
        lycanthrope.setRang(nouveauRang);
        reorganiserHierarchie();
    }

    public void gererPerteDeRang() {
        for (Lycanthrope lycanthrope : membres) {
            if (lycanthrope.getDominationsSubies() > 5) {

            }
        }
    }

    public Lycanthrope getMaleAlpha() {
        return maleAlpha;
    }

    public Lycanthrope getFemelleAlpha() {
        return femelleAlpha;
    }

}
