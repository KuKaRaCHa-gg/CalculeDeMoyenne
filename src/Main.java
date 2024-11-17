import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GestionnaireNotes gestionnaire = new GestionnaireNotes();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Ajouter une matière");
            System.out.println("2. Calculer la moyenne pondérée");
            System.out.println("3. Afficher les matières faibles");
            System.out.println("4. Quitter");
            System.out.print("Votre choix : ");

            int choix = scanner.nextInt();
            scanner.nextLine(); // Consomme la ligne

            switch (choix) {
                case 1:
                    System.out.print("Nom de la matière : ");
                    String nom = scanner.nextLine();
                    System.out.print("Coefficient : ");
                    double coefficient = scanner.nextDouble();
                    System.out.print("Note : ");
                    double note = scanner.nextDouble();
                    Matiere matiere = new Matiere(nom, coefficient, note);
                    gestionnaire.ajouterMatiere(matiere);
                    break;
                case 2:
                    System.out.println("Moyenne pondérée : " + gestionnaire.calculerMoyennePonderee());
                    break;
                case 3:
                    gestionnaire.afficherMatieresFaibles();
                    break;
                case 4:
                    System.out.println("Au revoir !");
                    return;
                default:
                    System.out.println("Choix invalide.");
            }
        }
    }
}
