public class Matiere {
    private String nomMatiere;
    private double coefficient;
    private double note;

    // Constructeur pour initialiser une matière
    public Matiere(String nomMatiere, double coefficient, double note) {
        this.nomMatiere = nomMatiere;
        this.coefficient = coefficient;
        this.note = note;
    }

    // Getters pour accéder aux valeurs
    public String getNomMatiere() {
        return nomMatiere;
    }

    public double getCoefficient() {
        return coefficient;
    }

    public double getNote() {
        return note;
    }
}
