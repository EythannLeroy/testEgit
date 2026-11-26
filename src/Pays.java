public class Pays {
	
    private String nom;
    
    private String langue;
    
    private String monnaie;
    
    private static int nbPays = 0;
    
    private Capitale saCapitale;
    
    private Ville lesVilles[];
    
    private int nbVilles;
    
    
    
    public Pays() {
        nbPays = nbPays + 1;
        this.lesVilles = new Ville[2];
    }
    
    public Pays(String unNom, Capitale uneSaCapitale) {
    	this.nom = unNom;
    	this.saCapitale = uneSaCapitale;
    	nbPays = nbPays + 1;
    	this.lesVilles = new Ville[2];
    }
    
    public Pays(String unNom, String uneLangue, Capitale uneSaCapitale) {
        this.nom = unNom;
        this.langue = uneLangue;
        this.saCapitale = uneSaCapitale;
        nbPays = nbPays + 1;
        this.lesVilles = new Ville[2];
    }
    
    public Pays(String unNom, String uneLangue, String uneMonnaie, Capitale uneSaCapitale) {
        this.nom = unNom;
        this.langue = uneLangue;
        this.monnaie = uneMonnaie;
        this.saCapitale = uneSaCapitale; 
        nbPays = nbPays + 1;
        this.lesVilles = new Ville[2];
    }
    
    
    
    //METHODES
    public String getNom() {
        return this.nom;
    }
    
    public void setNom(String unNom) {
        this.nom = unNom;
    }
    
    public String getLangue() {
        return this.langue;
    }
    
    public void setLangue(String uneLangue) {
        this.langue = uneLangue;
    }
    
    public String getMonnaie() {
        return this.monnaie;
    }
    
    public void setMonnaie(String uneMonnaie) {
        this.monnaie = uneMonnaie;
    }
    
    public static int getNbPays(){
        return nbPays; 
    }

    public Capitale getSaCapitale() {
        return this.saCapitale;
    }
    
    public void setSaCapitale(Capitale maCapitale) {
        this.saCapitale = maCapitale;
    }
    
    public Ville[] getLesVilles() {
        return this.lesVilles;
    }
    
    public int getNbVilles() {
        return this.nbVilles;
    }
    
    
    public boolean ajouterUneVille(Ville uneVille) {
        if (this.nbVilles < 2) {
            this.lesVilles[this.nbVilles] = uneVille;
            this.nbVilles = this.nbVilles + 1;
            return true;
        }
        
        return false;
    }
    
    
    public Ville rechercherUneVille(String unNom) {
        for (int i = 0; i < this.nbVilles; i++) {
            if (this.lesVilles[i].getNom().equalsIgnoreCase(unNom)) {
                return this.lesVilles[i];
            }
        }
        
        return null;
    }
    
    
    public String supprimerUneVille(int position) {
    	String rep ="";
        if (position >= 0 && position < this.nbVilles) {
            for (int i = position; i < this.nbVilles - 1; i++) {
                this.lesVilles[i] = this.lesVilles[i + 1];
            }
            
            this.lesVilles[this.nbVilles - 1] = null;
            this.nbVilles = this.nbVilles - 1;
            
            rep = "La ville a bien été supprimé !";
            
            return rep;
        }
        
        rep = "Erreur, veuillez réessayer.";
        
        return rep;
    }


    public String supprimerUneVille(String unNom) {
        for (int i = 0; i < this.nbVilles; i++) {
            if (this.lesVilles[i].getNom().equalsIgnoreCase(unNom)) {
                return supprimerUneVille(i);
            }
        }
        
        return "Erreur, veuillez réessayer.";
    }
    
    
    
    
    public String afficher() {
        String res = "";
        
        if (this.nom != null) 
            res += "\nNom : " + this.nom.toUpperCase();
        
        
        if (this.langue != null) 
            res += "\nLangue : " + this.langue;
        
        
        if (this.monnaie != null) 
            res += "\nMonnaie : " + this.monnaie;
        
        res += "\n";
        
        if (this.saCapitale != null) 
        	res += this.saCapitale.toString();
        
        
        res += "\nNombres de villes : "+this.nbVilles;
        
        if (this.nbVilles != 0) {
            for (int i = 0; i < this.nbVilles; i++) {
                    res += this.lesVilles[i]; 
            }                
        }
        
        res += "\n";
        
        return res;
    }
}