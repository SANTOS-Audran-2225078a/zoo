package lasauce;

public class sirènes {
	 private String nomEspece;
	    private char sexe;
	    private double poids;
	    private double taille;
	    private int age;
	    private boolean indicfaim; 
	    private boolean indicsommeil;
	    private boolean indicsante;

	        public sirènes(String nomEspece, char sexe, double poids, double taille, int age) {
	        this.nomEspece = nomEspece;
	        this.sexe = sexe;
	        this.poids = poids;
	        this.taille = taille;
	        this.age = age;
	        this.indicfaim = false;
	        this.indicsommeil = false;
	        this.indicsante = true;
	    }

	 @override
    public void Nager() {
        System.out.println(super.getName() + "nage" );
    }

}
