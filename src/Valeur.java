public class Valeur implements IElementCalcul {

    private double valeur;

    public Valeur(double valeur) {
        this.valeur = valeur;
    }

    @Override
    public EType getType() {
        return EType.VALEUR;
    }
}
