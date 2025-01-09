import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        System.out.println("Entrer le nom de l'ingredient : ");
        String nom = clavier.nextLine();
        System.out.println("Entrer la quantite de l'ingredient : ");
        double quantite = clavier.nextDouble();
        clavier.nextLine();
        System.out.println("Entrer l'unite de l'ingredient : ");
        String unite = clavier.nextLine();

        Ingrédient monIngrédient = new Ingrédient(nom, quantite, unite);

        System.out.println("la quantite de l'ingredient est  " + monIngrédient.getQuantite());
        System.out.println("l'unite' de l'ingredient est  " + monIngrédient.getUnite());
        System.out.println("le nom de l'ingredient est  " + monIngrédient.getNom());
    }
}