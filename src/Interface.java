import java.util.Scanner;

public class Interface {

    static String commando = "";
   static Scanner input = new Scanner(System.in);

    static void run(){
        System.out.println("-----------   Programa de Estudo sobre Lógica de Preposição --------------------------------");

        while(!Interface.commando.equals("sair")){
            System.out.println("Escolha a quantidade de proposições lógicas: ");
            System.out.println("1 - (p)");
            System.out.println("2 - (p), (q)");
            System.out.println("3 - (p), (q), (r)");

            System.out.print(": ");
            Interface.commando = input.nextLine();

            if(Interface.commando.equals("1")){
                controle1 c1 = new controle1();
                c1.iniciar_Estudo();
            }
        }

        System.out.println("FIM ");
    }
}
