public class Main {
    public static void main(String[] args) {
        GestionnaireNotes gestionnaire = new GestionnaireNotes();
        Matiere matiere = new Matiere();
        matiere.AjouterMatiere("Mathematiques");
        matiere.AjouterNote(matiere, 12.0);
        matiere.AjouterNote(matiere, 14.0);
        matiere.AjouterNote(matiere, 16.0);
        gestionnaire.AjouterMatiere(matiere);
        gestionnaire.AfficherNotes();


    }
}