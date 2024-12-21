public class NombreNegatifException extends Exception {

    private int valErronee;

    public NombreNegatifException(int val) {
        super("C'est un nombre négatif");
        this.valErronee = val;
    }

    public int getValErronee() {
        return valErronee;
    }
}
