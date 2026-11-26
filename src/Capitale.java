public class Capitale {
	
    public String nom; 
    public int nbHabitants;
    public int superficie;
    
    
    public Capitale () {
    	
    }
    
    public Capitale(String unNom, int unNbHabitants, int uneSuperficie) {
        this.nom = unNom;
        this.nbHabitants = unNbHabitants;
        this.superficie = uneSuperficie;
    }
    
    public Capitale(String unNom, int unNbHabitants) {
    	this.nom = unNom;
    	this.nbHabitants = unNbHabitants;
    }
    
    public Capitale(String unNom) {
    	this.nom = unNom;
    }
    
    
    
    //GETTER ET SETTER
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


    public float getSuperficie() {
        return this.superficie;
    }
    
    public void setSuperficie(int uneSuperficie) {
        this.superficie = uneSuperficie;
    }
    

    
    public String toString() {
        String res = "";
        
        if (this.nom != null) {
            res += "\nNom Capitale : " + this.nom;
        }
        
        if (this.nbHabitants != 0) {
            res += "\nNbHabitants : " + this.nbHabitants;
        }
        
        if (this.superficie != 0) {
            res += "\nSuperficie : " + this.superficie;
        }
        
        res += "\n";
        
        return res;
    }
}