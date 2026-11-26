public class Main {
	
    public static void main(String[] args) {
        
        Capitale uneCapitale = new Capitale("Lisbonne", 2000000000, 123456789);
        Capitale autreCapitale = new Capitale("Paris", 10, 23);
        Capitale derniereCapitale = new Capitale("Londre");
        
        
        Pays unPays = new Pays("Portugal", "portugais", "Euro", uneCapitale);
        Pays unAutrePays = new Pays("France", "français", autreCapitale);
        Pays encoreUnPays = new Pays("Royaume-Uni", derniereCapitale);
        
        
        Ville uneVille = new Ville("Madeira", 200000, 500);
        Ville uneAutreVille = new Ville("Almada", 10000);
        Ville encoreUneVille = new Ville("Lyon");
        Ville encoreUneAutreVille = new Ville("Watford", 20);
        Ville uneDerniereVille = new Ville("Bareiro", 123, 987);
        
        
        
        
        //  Test ajout ville et affichage complet pour unPays
        unPays.ajouterUneVille(uneVille);
        //System.out.println(unPays.getNbVilles());
        
        unPays.ajouterUneVille(uneAutreVille);
        //System.out.println(unPays.getNbVilles());
        
        unPays.ajouterUneVille(uneDerniereVille);
        //System.out.println(unPays.getNbVilles());
        
        System.out.println(unPays.afficher());
        
        
        // DECOMMENTER 1 PAR 1 EN CAS DE BESOIN 
        
        // Test suppresion et recherche des villes de unPays !PENSEZ A DECOMMENTER LES AJOUT DE UNPAYS POUR FOCNTIONNER
        
        //System.out.println(unPays.rechercherUneVille("almada")); 
        
        //System.out.println(unPays.rechercherUneVille("bareiRo"));
        
        
        System.out.println(unPays.supprimerUneVille(1)); // suppression de almada
        
        System.out.println(unPays.afficher());
        
        //System.out.println(unPays.supprimerUneVille("Bareiro")); // suppression de bareiro (indice 1)
        
        
        
        
        
        /* A DECOMMENTER
        
        //  Test ajout ville et affichage complet pour unAutrePays
        unAutrePays.ajouterUneVille(encoreUneVille);
        //System.out.println(unAutrePays.getNbVilles());
        
        System.out.println(unAutrePays.afficher());
        
        
        */
        
        
        /* A DECOMMENTER
        
        // Test ajout ville et affichage complet pour encoreUnPays
        encoreUnPays.ajouterUneVille(encoreUneAutreVille);
        //System.out.println(encoreUnPays.getNbVilles());
        
        System.out.println(encoreUnPays.afficher());
        
        
        */
        
    }
}
