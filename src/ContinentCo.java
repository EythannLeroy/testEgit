import java.util.ArrayList;

public class ContinentCo {

    private String nom;
    private int superficie;
    private ArrayList<PaysCo> desPays;


    public ContinentCo() {

        this.desPays = new ArrayList<PaysCo>();

    }


    public ContinentCo(String unNom) {

        this.nom = unNom;
        this.desPays = new ArrayList<PaysCo>();

    }


    public ContinentCo(String unNom, int uneSuperficie) {

        this.nom = unNom;
        this.superficie = uneSuperficie;
        this.desPays = new ArrayList<PaysCo>();

    }

    
    
    
    
    //METHODES GETTER/SETTER
    public String getNom() {

        return this.nom;

    }


    public void setNom(String unNom) {

        this.nom = unNom;

    }


    public int getSuperficie() {

        return this.superficie;

    }


    public void setSuperficie(int uneSuperficie) {

        this.superficie = uneSuperficie;

    }


    public ArrayList<PaysCo> getLesPays() {

        return this.desPays;

    }


    public boolean ajouterPays(PaysCo unPays) {

        if (this.desPays.contains(unPays)) {

            return false;

        }

        this.desPays.add(unPays);

        return true;

    }


    public boolean supprimerPays(PaysCo unPays) {

        if (this.desPays.contains(unPays)) {

            this.desPays.remove(unPays);

            return true;

        }

        return false;

    }


    public PaysCo rechercherPays(String unNom) {

        for (PaysCo unPays : this.desPays) {

            if (unPays.getNom().equalsIgnoreCase(unNom)) {

                return unPays;

            }

        }

        return null;

    }


    public String afficher() {

        String res = "";

        res += "\nNom : " + this.nom;
        res += "\nSuperficie : " + this.superficie;
        res += "\nPays : ";

        for (PaysCo unPays : this.desPays) {

            res += "\n" + unPays.getNom();

        }

        return res;

    }

}
