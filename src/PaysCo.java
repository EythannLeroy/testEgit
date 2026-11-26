import java.util.ArrayList;

public class PaysCo {

    private String nom;

    private String langue;

    private String monnaie;

    private static int nbPays = 0;

    private CapitaleCo saCapitale;

    private ArrayList<VilleCo> desVilles;

    private int nbVilles;

    private ContinentCo sonContinent;


    public PaysCo() {

        nbPays++;

        this.desVilles = new ArrayList<VilleCo>();

    }


    public PaysCo(String unNom, String uneLangue, String uneMonnaie) {

        this.nom = unNom;
        this.langue = uneLangue;
        this.monnaie = uneMonnaie;

        nbPays++;

        this.desVilles = new ArrayList<VilleCo>();

    }


    public PaysCo(String unNom, String uneLangue) {

        this.nom = unNom;
        this.langue = uneLangue;

        nbPays++;

        this.desVilles = new ArrayList<VilleCo>();

    }


    public PaysCo(String unNom) {

        this.nom = unNom;

        nbPays++;

        this.desVilles = new ArrayList<VilleCo>();

    }


    public PaysCo(String unNom, CapitaleCo uneSaCapitale) {

        this.nom = unNom;
        this.saCapitale = uneSaCapitale;

        nbPays++;

        this.desVilles = new ArrayList<VilleCo>();

    }


    public PaysCo(String unNom, String uneLangue, CapitaleCo uneSaCapitale) {

        this.nom = unNom;
        this.langue = uneLangue;
        this.saCapitale = uneSaCapitale;

        nbPays++;

        this.desVilles = new ArrayList<VilleCo>();

    }


    public PaysCo(String unNom, String uneLangue, String uneMonnaie, CapitaleCo uneSaCapitale) {

        this.nom = unNom;
        this.langue = uneLangue;
        this.monnaie = uneMonnaie;
        this.saCapitale = uneSaCapitale;

        nbPays++;

        this.desVilles = new ArrayList<VilleCo>();

    }


    // GETTERS / SETTERS

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


    public static int getNbPays() {

        return nbPays;

    }


    public CapitaleCo getSaCapitale() {

        return this.saCapitale;

    }


    public void setSaCapitale(CapitaleCo uneCapitale) {

        this.saCapitale = uneCapitale;

    }


    public int getNbVilles() {

        return this.nbVilles;

    }


    public ContinentCo getSonContinent() {

        return this.sonContinent;

    }


    public void setSonContinent(ContinentCo unContinent) {

        this.sonContinent = unContinent;

    }


    // GESTION DES VILLES

    public boolean ajouterVille(VilleCo uneVille) {

        if (this.desVilles.contains(uneVille)) {

            return false;

        }

        this.desVilles.add(uneVille);

        this.nbVilles++;

        return true;

    }


    public boolean supprimerVille(VilleCo uneVille) {

        if (this.desVilles.contains(uneVille)) {

            this.desVilles.remove(uneVille);

            this.nbVilles--;

            return true;

        }

        return false;

    }


    public void supprimerVille(int index) {

        this.desVilles.remove(index);

        this.nbVilles--;

    }


    public ArrayList<VilleCo> getLesVilles() {

        return this.desVilles;

    }


    public VilleCo rechercherVille(String unNom) {

        for (VilleCo uneVille : this.desVilles) {

            if (uneVille.getNom().equalsIgnoreCase(unNom)) {

                return uneVille;

            }

        }

        return null;

    }


    public String afficher() {

        String res = "";

        res += "\nNom du pays : " + this.nom.toUpperCase();

        if (this.langue != null) {

            res += "\nLangue : " + this.langue;

        }

        if (this.monnaie != null) {

            res += "\nMonnaie : " + this.monnaie;

        }

        if (this.saCapitale != null) {

            res += this.saCapitale.toString();

        }

        res += "\nVilles : ";

        for (VilleCo uneVille : this.desVilles) {

            res += "\n" + uneVille;

        }

        return res;

    }

}