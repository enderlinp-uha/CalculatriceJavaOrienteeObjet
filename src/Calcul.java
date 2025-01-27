import java.util.ArrayList;

public class Calcul {

    private ArrayList<IElementCalcul> items = new ArrayList<IElementCalcul>();

    private Calcul(Builder builder) {
        this.items = builder.items;
    }

    private ArrayList<IElementCalcul> getItems() {
        return this.items;
    }

    public String toString() {
        StringBuilder result = new StringBuilder();

        for (IElementCalcul item : this.items) {
            result.append(item.toString()).append(" ");
        }

        result.append(" = ");

        return result.toString();
    }

    public static class Builder {

        private final ArrayList<IElementCalcul> items = new ArrayList<IElementCalcul>();

        public Builder addItem(IElementCalcul item) {
            this.items.add(item);
            return this;
        }

        public void execute() {

        }

        public void printHistory() {

        }

        public Calcul build() {
            return new Calcul(this);
        }
    }
}
