

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception{

        Deck deck= new Deck();
        deck.construir();
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;
        int opciones;
        System.out.println("Bienvenido a Poker!");

        while (!salir){
            System.out.println("Opciones a elegir:");
            System.out.println("1 Mezclar deck");
            System.out.println("2 Sacar una carta");
            System.out.println("3 Carta al azar");
            System.out.println("4 Generar una mano de 5 cartas");
            System.out.println("0 Salir");
            try {
                System.out.println("Selecciona una opción:");
                opciones = scanner.nextInt();
                switch (opciones){
                    case 1:
                        deck.barajear();
                        break;
                    case 2:
                        deck.head();
                        break;
                    case 3:
                        deck.pick();
                        break;
                    case 4:
                        deck.hand();
                        break;
                    case 0:
                        salir = true;
                        System.out.println("Se acabo el juego");
                        break;
                    default:
                        throw new IllegalStateException("opción no valida " + opciones);
                }
            }
            catch (InputMismatchException e){
                System.out.println("Opción no válida");
                scanner.next();
            }
            catch (Exception a){
                a.printStackTrace();
            }
        }
    }
}
