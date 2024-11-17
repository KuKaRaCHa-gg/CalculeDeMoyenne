import java.util.ArrayList;

public class GestionnaireNotes {
    private ArrayList<Matiere> matieres;

    // Constructeur
    public GestionnaireNotes() {
        matieres = new ArrayList<>();
    }

    // Ajouter une matière
    public void ajouterMatiere(Matiere matiere) {
        matieres.add(matiere);
    }

    // Calculer la moyenne pondérée
    public double calculerMoyennePonderee() {
        double sommeNotes = 0, sommeCoefficients = 0;
        for (Matiere matiere : matieres) {
            sommeNotes += matiere.getNote() * matiere.getCoefficient();
            sommeCoefficients += matiere.getCoefficient();
        }
        return sommeCoefficients == 0 ? 0 : sommeNotes / sommeCoefficients;
    }

    // Afficher les matières faibles
    public void afficherMatieresFaibles() {
        for (Matiere matiere : matieres) {
            if (matiere.getNote() < 10) {
                System.out.println("Matière : " + matiere.getNomMatiere() +
                        ", Note : " + matiere.getNote() +
                        ", Coefficient : " + matiere.getCoefficient());
            }
        }
    }
}
