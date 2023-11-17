package td4;

public class nymphes {
	 private String nomEspece;
	    private char sexe;
	    private double poids;
	    private double taille;
	    private int age;
	    private boolean indicfaim; 
	    private boolean indicsommeil;
	    private boolean indicsante;

	        public nymphes(String nomEspece, char sexe, double poids, double taille, int age) {
	        this.nomEspece = nomEspece;
	        this.sexe = sexe;
	        this.poids = poids;
	        this.taille = taille;
	        this.age = age;
	        this.indicfaim = false;
	        this.indicsommeil = false;
	        this.indicsante = true;
	    }

}
