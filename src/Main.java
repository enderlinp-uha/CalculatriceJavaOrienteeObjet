import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*
        List<IElementCalcul> elements = new ArrayList<IElementCalcul>();
        elements.add(FElementCalcul.creerValeur(1));
        elements.add(FElementCalcul.creerOperateur(EOperateur.ADD));
        elements.add(FElementCalcul.creerValeur(2));
        */

        Calcul.Builder calcul = new Calcul.Builder();
        calcul.addItem(FElementCalcul.creerValeur(1));
        calcul.addItem(FElementCalcul.creerOperateur(EOperateur.ADD));
        calcul.addItem(FElementCalcul.creerValeur(2));

        System.out.println(calcul);
    }
}