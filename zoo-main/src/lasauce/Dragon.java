package lasauce;

public class dragons {
    private String nom;
    private char sexe;
    private double poids;
    private double taille;
    private int age;
    private boolean indicfaim; 
    private boolean indicsommeil;
    private boolean indicsante;

        public dragons(String nom, char sexe, double poids, double taille, int age) {
        this.nom = nom;
        this.sexe = sexe;
        this.poids = poids;
        this.taille = taille;
        this.age = age;
        this.indicfaim = false;
        this.indicsommeil = false;
        this.indicsante = true;
    }

    public void  manger() {
    	
    }
    public void emetson() {
    	
    }
    public void soin() {
    	
    }
    public void dormiroupas() {
    	
    }
    public void vieillir() {
    	
    }
    public void courrir() {
    	
    }
    public void pondre() {
    	
    }
    
    public void Voler() {
        System.out.println(super.getName() + "Vole" );
    }

    public void Courir() {
        System.out.println(super.getName() + "cour" );
    }

    public void Nager() {
        System.out.println(super.getName() + "nage" );
    }
    }