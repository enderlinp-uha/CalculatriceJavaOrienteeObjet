public class Operateur implements IElementCalcul {

    private EOperateur operateur;

    public Operateur(EOperateur operateur) {
        this.operateur = operateur;
    }

    @Override
    public EType getType() {
        return EType.OPERATEUR;
    }
}
