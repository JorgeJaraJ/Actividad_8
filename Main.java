import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Deck mazo = new Deck();
System.out.println("Que acción es la que quieres llevar a cabo?");
Scanner scanner1 = new Scanner(System.in);
if(scanner1.equals("suflle")) {

     mazo.suflle();
}else if(scanner1.equals("head")){
    mazo.head();
}else if(scanner1.equals("pick")){
    mazo.pick();
}else if(scanner1.equals("hand")){
    mazo.hand();
}
Scanner scanner = new Scanner(System.in);
System.out.println("Please, enter an Integer:");
        System.out.println("Your Integer was: " + scanner.nextInt());

        System.out.println("Please, enter a Double:");
        System.out.println("Your Double was: " + scanner.nextDouble());

        System.out.println("Please, enter a Boolean:");
        System.out.println("Your Boolean was: " + scanner.nextBoolean());

        System.out.println("Please, enter a String:");
        System.out.println("Your String was: " + scanner.next());
        System.out.println(scanner.next());

        System.out.println("Deck de Cartas para Iniciar: " + mazo.getSize());

        for (Card elemento : mazo.getDeck()) {
            System.out.print(elemento + " / ");
        }
        System.out.println("\n");
        mazo.suflle();
        System.out.println("\n");
        mazo.head();
        System.out.println("\n");
        mazo.pick();
        System.out.println("\n");
        mazo.hand();

    }

}
