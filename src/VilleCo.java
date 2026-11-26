public class VilleCo {
	
    public String nom; 
    public int nbHabitants;
    public int superficie;
    public PaysCo sonPays;
    
    // ceci est une ville hhg
    public VilleCo() {
    	
    }
    
    public VilleCo(String unNom, int unNbHabitants, int uneSuperficie, PaysCo unSonPays) {
        this.nom = unNom;
        this.nbHabitants = unNbHabitants;
        this.superficie = uneSuperficie;
        this.sonPays = unSonPays; // spécifique à la double navigabilité
        this.sonPays.ajouterVille(this); // spécifique à la double navigabilité
    }

	public VilleCo(String unNom, int unNbHabitants, PaysCo unSonPays) {
    	this.nom = unNom;
    	this.nbHabitants = unNbHabitants;
    	this.sonPays = unSonPays;
    	this.sonPays.ajouterVille(this);
    }
    
    public VilleCo(String unNom, PaysCo unSonPays) {
    	this.nom = unNom;
    	this.sonPays = unSonPays;
    	this.sonPays.ajouterVille(this);
    }
    

    
    public String getNom() {
        return this.nom;
    }
    
    
    public void setNom(String unNom) {
        this.nom = unNom;
    }
    

    public int getNbHabitants() {
        return this.nbHabitants;
    }
    
    
    public void setNbHabitants(int unNbHabitants) {
        this.nbHabitants = unNbHabitants;
    }

    
    public int getSuperficie() {
        return this.superficie;
    }
    
    
    public void setSuperficie(int uneSuperficie) {
        this.superficie = uneSuperficie;
    }
    
    public PaysCo getSonPays() {
		return sonPays;
	}

	public void setSonPays(PaysCo unSonPays) {
		this.sonPays = unSonPays;
	}

    
    
    public String toString() {
        String res = "";
        
        if (this.nom != null) 
            res += "\nNom Ville : " + this.nom;
        
        
        if (this.nbHabitants != 0) 
            res += "\nNbHabitants : " + this.nbHabitants;
        
            
        if (this.superficie != 0) 
            res += "\nSuperficie : " + this.superficie;
        
        
        res += "\n";
        
        return res;
    }
}