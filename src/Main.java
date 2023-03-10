import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Inserte dinero");
        Scanner numero= new Scanner(System.in);
        int saldo= numero.nextInt();

        System.out.println("Saldo actual: "+saldo+"€");

        do {

            System.out.println("Pulsa iniciar para empezar a jugar");

        Scanner numero2= new Scanner(System.in);
        int iniciar= numero2.nextInt();



        saldo=saldo-1;

        System.out.println("OK");

            int combo1 = (int)(Math.random()*3+1);
            int combo2 = (int)(Math.random()*3+1);
            int combo3 = (int)(Math.random()*3+1);

            System.out.println(combo1+" | "+combo2+" | "+combo3);

            if(combo1==combo2 && combo2==combo3){
                saldo= saldo+2;
                System.out.println("HAS GANADO");
                System.out.println("Tu saldo actual: "+saldo);
                System.out.println("----------------------------------------------------------");
            }else {

                System.out.println("PERDISTE");
                System.out.println("Tu saldo actual: "+saldo);
                System.out.println("----------------------------------------------------------");
            }
        }while (saldo>=1);




    }

}