import java.util.Scanner;

public class MainCo {

	public static void main(String[] args) {
        
		
		/*
        PaysCo unPays = new PaysCo("Portugal", "portugais", "Euro");
        VilleCo toujoursPlusDeVille = new VilleCo("Lisbonne", 2000000000, 123456789, unPays);
        VilleCo uneDerniereVille = new VilleCo("Bareiro", 123, 987, unPays);
        VilleCo uneVille = new VilleCo("Madeira", 200000, 500, unPays);
        VilleCo uneAutreVille = new VilleCo("Almada", 10000, unPays);
		CapitaleCo uneCapitale = new CapitaleCo(toujoursPlusDeVille);
		
		
		PaysCo unAutrePays = new PaysCo("France", "français");
		VilleCo encoreUneVille = new VilleCo("Lyon", unAutrePays);
		VilleCo anotherOneVille = new VilleCo("Paris", 10, 23, unAutrePays);
        CapitaleCo autreCapitale = new CapitaleCo(anotherOneVille);
        
        
        PaysCo encoreUnPays = new PaysCo("Royaume-Uni");
        VilleCo laDerDesDerVille = new VilleCo("Londre", encoreUnPays);
        VilleCo encoreUneAutreVille = new VilleCo("Watford", 20, encoreUnPays);
        CapitaleCo derniereCapitale = new CapitaleCo(laDerDesDerVille);
        */
        
        
        //  Test collection ajout avec unPays
        //unPays.ajouterVille(uneVille);
        //System.out.println(unPays.ajouterVille(uneVille)); // retourne false sur la ligne au dessus est décommenté sinon retour true
        
        //unPays.ajouterVille(uneAutreVille);
        //System.out.println(unPays.ajouterVille(uneAutreVille)); // retourne false si la ligne du dessus est décommenté sinon retour true 
        //System.out.println(unPays.getLesVilles()); // les 2 villes ont bien été rajouté
        
        //unPays.ajouterVille(uneDerniereVille);
        //System.out.println(unPays.ajouterVille(uneDerniereVille)); 
        //System.out.println(unPays.getLesVilles()); // les 3 villes ont bien été rajouté
        
        
        //System.out.println(unPays.afficher()); // toutes les villes et la capitale s'affichent
        
        
        //  Test des fonctions de recherches et suppression 
        //System.out.println(unPays.rechercherVille("almAda")); // M'affiche bien la ville demandé malgré la faute d'écriture
        
        
        //System.out.println(unPays.supprimerVille(uneVille)); // la suppression de uneVille retourne un true 
        //System.out.println(unPays.getLesVilles());
        
        //System.out.println(unPays.supprimerVille(uneAutreVille));
        //System.out.println(unPays.supprimerVille(uneDerniereVille));
        //System.out.println(unPays.getLesVilles());
        
        
        
        
        
        // INCREMENTATION D'UN MENU 
        
        Scanner clavier = new Scanner(System.in);
        
        ContinentCo unContinent = null;
        
        int choix;

        do {

            System.out.println("========== MENU ==========");
            System.out.println("1 - Gestion des Continents");
            System.out.println("2 - Gestion des Pays");
            System.out.println("3 - Gestion des Villes");
            System.out.println("4 - Gestion des Capitales");
            System.out.println("0 - Quitter");
            System.out.println("==========================");
            System.out.print("Votre choix : ");

            choix = clavier.nextInt();

            switch (choix) {

                case 1:
                	
                	int choixContinent;
                	
                	do {
                        System.out.println("========== GESTION DES CONTINENTS ==========");
                        System.out.println("1 - Ajouter un continent");
                        System.out.println("2 - Supprimer un continent");
                        System.out.println("3 - Consulter les continents");
                        System.out.println("0 - Retour");
                        System.out.println("==================================");
                        System.out.print("Votre choix : ");

                        choixContinent = clavier.nextInt();

                        switch (choixContinent) {
                        case 1:
                        	clavier.nextLine();
                        	
                        	System.out.println("Nom du continent :");
                        	String nomContinent = clavier.nextLine();
                        	
                        	System.out.println("Superficie du continent :");
                        	int superficieContinent = clavier.nextInt();
                        	
                        	unContinent = new ContinentCo(nomContinent, superficieContinent);
                        	
                        	System.out.println("Continent ajouté !");
                        	break;
                        
                        case 2:
                        	if (unContinent != null) {
                                unContinent = null;
                                System.out.println("Continent supprimé !");
                            }
                            else {
                                System.out.println("Aucun continent à supprimer.");
                            }

                            break;
                        	 
                        	
                        case 3:
                        	if (unContinent != null) {
                       		 	System.out.println(unContinent.afficher());
                       	 	}
                        	else {
                        		System.out.println("Aucun continent n'a été créé.");
                       	 	}
                       	
                       	 	break;
                        	
                        }
                        
                	} while (choixContinent != 0);

                    break;

                    
                 
                case 2:
                    
                	int choixPays;
                	
                	do {
                        System.out.println("========== GESTION DES PAYS ==========");
                        System.out.println("1 - Ajouter un pays");
                        System.out.println("2 - Consulter les pays");
                        System.out.println("3 - Rechercher un pays");
                        System.out.println("4 - Supprimer les pays");
                        System.out.println("0 - Retour");
                        System.out.println("==================================");
                        System.out.print("Votre choix : ");
                        
                        choixPays = clavier.nextInt();
                        
                        switch (choixPays) {
                        case 1:

                            if (unContinent != null) {

                                clavier.nextLine();

                                System.out.print("Nom du pays : ");
                                String nomPays = clavier.nextLine();

                                System.out.print("Langue : ");
                                String langue = clavier.nextLine();

                                System.out.print("Monnaie : ");
                                String monnaie = clavier.nextLine();

                                PaysCo unPays = new PaysCo(nomPays,langue,monnaie);

                                if (unContinent.ajouterPays(unPays)) {

                                    unPays.setSonContinent(unContinent);

                                    System.out.println("Pays ajouté !");

                                }
                                else {

                                    System.out.println("Le pays existe déjà.");

                                }

                            }
                            else {

                                System.out.println("Aucun continent n'a été créé.");

                            }

                            break;

                        case 2:

                            if (unContinent != null) {

                                if (unContinent.getLesPays().isEmpty()) {

                                    System.out.println("Aucun pays n'existe.");

                                }
                                else {

                                    System.out.println("\n===== PAYS =====");

                                    for (PaysCo unPaysAffichage: unContinent.getLesPays()) {

                                        System.out.println(unPaysAffichage.afficher());

                                    }

                                }

                            }
                            else {

                                System.out.println("Aucun continent n'a été créé.");

                            }

                            break;

                        case 3:

                            if (unContinent != null) {

                                clavier.nextLine();

                                System.out.print("Nom du pays recherché : ");

                                String nomRecherche = clavier.nextLine();

                                PaysCo paysTrouve = unContinent.rechercherPays(nomRecherche);

                                
                                if (paysTrouve != null) {

                                    System.out.println(paysTrouve.afficher());

                                }
                                else {

                                    System.out.println("Pays introuvable.");

                                }

                            }
                            else {

                                System.out.println("Aucun continent n'a été créé.");

                            }

                            break;

                        case 4:

                            if (unContinent != null) {

                                clavier.nextLine();

                                System.out.print("Nom du pays à supprimer : ");

                                String nomSuppression = clavier.nextLine();

                                PaysCo paysSupprimer =unContinent.rechercherPays(nomSuppression);

                                if (paysSupprimer != null) {

                                    unContinent.supprimerPays(paysSupprimer);

                                    System.out.println("Pays supprimé !");

                                }
                                else {

                                    System.out.println("Pays introuvable.");

                                }

                            }
                            else {

                                System.out.println("Aucun continent n'a été créé.");

                            }

                            break;

                        case 0:

                            System.out.println("Retour au menu principal.");
                            break;
                        }

                } while (choixPays != 0);

                break;
                    
                case 3:
                	
                	int choixVille;
                	
                	do {
                        System.out.println("========== GESTION DES VILLES ==========");
                        System.out.println("1 - Ajouter une ville");
                        System.out.println("2 - Consulter les villes");
                        System.out.println("3 - Rechercher une ville");
                        System.out.println("4 - Supprimer une ville");
                        System.out.println("0 - Retour");
                        System.out.println("==================================");
                        System.out.print("Votre choix : ");
                        
                        choixVille = clavier.nextInt();
                        
                        switch (choixVille) {

                        case 1:

                            if (unContinent != null) {

                                clavier.nextLine();

                                System.out.print("Nom du pays de la ville : ");

                                String nomPaysVille = clavier.nextLine();

                                PaysCo paysVille = unContinent.rechercherPays(nomPaysVille);

                                if (paysVille != null) {

                                    System.out.print("Nom de la ville : ");

                                    String nomVille = clavier.nextLine();
                                    

                                    System.out.print("Nombre d'habitants : ");

                                    int nbHabitants = clavier.nextInt();
                                    

                                    System.out.print("Superficie : ");

                                    int superficie =clavier.nextInt();

                                    VilleCo uneVille = new VilleCo(nomVille,nbHabitants,superficie,paysVille);

                                    System.out.println("Ville ajoutée !");

                                }
                                else {

                                    System.out.println("Pays introuvable.");

                                }

                            }
                            else {

                                System.out.println("Aucun continent n'a été créé.");

                            }

                            break;

                        case 2:

                            if (unContinent != null) {

                                clavier.nextLine();

                                System.out.print("Nom du pays : ");

                                String nomPaysVilles = clavier.nextLine();

                                PaysCo paysVilles = unContinent.rechercherPays(nomPaysVilles);

                                if (paysVilles != null) {

                                    if (paysVilles.getLesVilles().isEmpty()) {

                                        System.out.println("Aucune ville.");

                                    }
                                    else {

                                        System.out.println("\n===== VILLES =====");

                                        for (VilleCo uneVille : paysVilles.getLesVilles()) {

                                        	System.out.println(uneVille);

                                        }

                                    }

                                }
                                else {

                                    System.out.println("Pays introuvable.");

                                }

                            }
                            else {

                                System.out.println("Aucun continent n'a été créé.");

                            }

                            break;

                        case 3:

                            if (unContinent != null) {

                                clavier.nextLine();

                                System.out.print("Nom du pays : ");

                                String nomPaysRechercheVille = clavier.nextLine();

                                PaysCo paysRechercheVille = unContinent.rechercherPays(nomPaysRechercheVille);
                                

                                if (paysRechercheVille != null) {

                                    System.out.print("Nom de la ville recherchée : ");

                                    String nomVilleRecherchee = clavier.nextLine();

                                    VilleCo villeTrouvee = paysRechercheVille.rechercherVille(nomVilleRecherchee);

                                    if (villeTrouvee != null) {

                                        System.out.println(villeTrouvee);

                                    }
                                    else {

                                        System.out.println("Ville introuvable.");

                                    }

                                }
                                else {

                                    System.out.println("Pays introuvable.");

                                }

                            }
                            else {

                                System.out.println("Aucun continent n'a été créé.");

                            }

                            break;

                        case 4:

                            if (unContinent != null) {

                                clavier.nextLine();

                                System.out.print("Nom du pays : ");

                                String nomPaysSupprimerVille = clavier.nextLine();

                                PaysCo paysSupprimerVille = unContinent.rechercherPays(nomPaysSupprimerVille);

                                if (paysSupprimerVille != null) {

                                    System.out.print("Nom de la ville : ");

                                    String nomVilleSupprimer = clavier.nextLine();

                                    VilleCo villeSupprimer = paysSupprimerVille.rechercherVille(nomVilleSupprimer);

                                    if (villeSupprimer != null) {

                                        paysSupprimerVille.supprimerVille(villeSupprimer);

                                        System.out.println("Ville supprimée !");

                                    }
                                    else {

                                        System.out.println("Ville introuvable.");

                                    }

                                }
                                else {

                                    System.out.println("Pays introuvable.");

                                }

                            }
                            else {

                                System.out.println("Aucun continent n'a été créé.");

                            }

                            break;

                        case 0:

                            System.out.println(
                                "Retour au menu principal."
                            );

                            break;

                    }

                } while (choixVille != 0);

                break;
                
                
                case 4:

                    int choixCapitale;

                    do {

                        System.out.println("========== GESTION DES CAPITALES ==========");
                        System.out.println("1 - Ajouter une capitale");
                        System.out.println("2 - Supprimer une capitale");
                        System.out.println("3 - Consulter les capitales");
                        System.out.println("4 - Rechercher une capitale");
                        System.out.println("0 - Retour");
                        System.out.println("===========================================");
                        System.out.print("Votre choix : ");

                        choixCapitale = clavier.nextInt();

                        switch (choixCapitale) {

                        case 1:

                            if (unContinent != null) {

                                clavier.nextLine();

                                System.out.print("Nom du pays : ");
                                String nomPaysCapitale = clavier.nextLine();

                                PaysCo paysCapitale = unContinent.rechercherPays(nomPaysCapitale);

                                if (paysCapitale != null) {

                                    System.out.print("Nom de la capitale : ");
                                    String nomCapitale = clavier.nextLine();

                                    System.out.print("Nombre d'habitants : ");
                                    int nbHabitantsCapitale = clavier.nextInt();

                                    System.out.print("Superficie : ");
                                    int superficieCapitale = clavier.nextInt();

                                    VilleCo uneVille = new VilleCo(nomCapitale,nbHabitantsCapitale,superficieCapitale,paysCapitale);

                                    CapitaleCo uneCapitale = new CapitaleCo(uneVille);

                                    paysCapitale.setSaCapitale(uneCapitale);

                                    System.out.println("Capitale ajoutée !");

                                }

                                else {

                                    System.out.println("Pays introuvable.");

                                }

                            }

                            else {

                                System.out.println("Aucun continent n'a été créé.");

                            }

                            break;


                        case 2:

                            if (unContinent != null) {

                                clavier.nextLine();

                                System.out.print("Nom du pays : ");
                                String nomPaysSupprimerCapitale = clavier.nextLine();

                                PaysCo paysSupprimerCapitale =
                                    unContinent.rechercherPays(nomPaysSupprimerCapitale);

                                if (paysSupprimerCapitale != null) {

                                    if (paysSupprimerCapitale.getSaCapitale() != null) {

                                        paysSupprimerCapitale.setSaCapitale(null);

                                        System.out.println("Capitale supprimée !");

                                    }

                                    else {

                                        System.out.println("Ce pays n'a pas de capitale.");

                                    }

                                }

                                else {

                                    System.out.println("Pays introuvable.");

                                }

                            }

                            else {

                                System.out.println("Aucun continent n'a été créé.");

                            }

                            break;


                        case 3:

                            if (unContinent != null) {

                                clavier.nextLine();

                                System.out.print("Nom du pays : ");
                                String nomPaysAfficherCapitale = clavier.nextLine();

                                PaysCo paysAfficherCapitale =
                                    unContinent.rechercherPays(nomPaysAfficherCapitale);

                                if (paysAfficherCapitale != null) {

                                    if (paysAfficherCapitale.getSaCapitale() != null) {

                                        System.out.println(
                                            paysAfficherCapitale.getSaCapitale()
                                        );

                                    }

                                    else {

                                        System.out.println("Ce pays n'a pas de capitale.");

                                    }

                                }

                                else {

                                    System.out.println("Pays introuvable.");

                                }

                            }

                            else {

                                System.out.println("Aucun continent n'a été créé.");

                            }

                            break;


                        case 4:

                            if (unContinent != null) {

                                clavier.nextLine();

                                System.out.print("Nom de la capitale recherchée : ");
                                String nomCapitaleRecherchee = clavier.nextLine();

                                boolean trouvee = false;

                                for (PaysCo unPays : unContinent.getLesPays()) {

                                    if (unPays.getSaCapitale() != null) {

                                        if (unPays.getSaCapitale().getNom().equalsIgnoreCase(nomCapitaleRecherchee)) {

                                            System.out.println(unPays.getSaCapitale());

                                            trouvee = true;

                                        }

                                    }

                                }

                                if (!trouvee) {

                                    System.out.println("Capitale introuvable.");

                                }

                            }

                            else {

                                System.out.println("Aucun continent n'a été créé.");

                            }

                            break;


                        case 0:

                            System.out.println("Retour au menu principal.");

                            break;


                        default:

                            System.out.println("Choix invalide.");

                        }

                    } while (choixCapitale != 0);

                    break;

                    
                    
                    
                case 0:
                    System.out.println("Au revoir !");
                    break;

            }

            System.out.println();

        } while (choix != 0);

        clavier.close();
    }
}