import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Entrez un entier naturel : ");
            int val = sc.nextInt();
            EntierNaturel n = new EntierNaturel(val);
            //System.out.println("val = " + n.getVal());

            System.out.println("Modifiez l'entier naturel : ");
            int newVal = sc.nextInt();
            n.setVal(newVal);
            //System.out.println("val après modification : " + n.getVal());

            while (true) {
                n.decrementer();
                System.out.println("val après décrémentation : " + n.getVal());
            }
        } catch (NombreNegatifException e) {
            System.out.println("Exception : " + e.getMessage());
            System.out.println("Valeur erronée : " + e.getValErronee());
        }
        sc.close();
    }
}
