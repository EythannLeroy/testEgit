
public class CapitaleCo extends VilleCo {
    
    
    public CapitaleCo(VilleCo uneVille) {
        this.nom = uneVille.getNom();
        this.nbHabitants = uneVille.getNbHabitants();
        this.superficie = uneVille.getSuperficie();
        this.sonPays = uneVille.getSonPays();
    }
    
    /*
    public CapitaleCo(VilleCo uneVille) {
    	super(nom, nbHabitants, superficie, sonPays);
    }
    
    public CapitaleCo(String unNom, int unNbHabitants, PaysCo unSonPays) {
    	super(unNom, unNbHabitants, unSonPays);
    }
    
    public CapitaleCo(String unNom, PaysCo unSonPays) {
    	super(unNom, unSonPays);
    }
    
    */
    
    /*
    
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
    
	*/
    
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