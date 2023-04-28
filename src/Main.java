import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Inserte dinero");
        Scanner numero= new Scanner(System.in);
        int saldo= numero.nextInt();

        System.out.println("Saldo actual: "+saldo+"€");

        System.out.println("Seleccione una opción \n 1-JUGAR \n 2-SALIR" );

        Scanner numero2= new Scanner(System.in);
        int iniciar= numero2.nextInt();

        do {

            if(saldo>0) {

                saldo = saldo - 1;

                switch (iniciar) {
                    case 1:

                        System.out.println("OK");

                        int combo1 = (int) (Math.random() * 3 + 1);
                        int combo2 = (int) (Math.random() * 3 + 1);
                        int combo3 = (int) (Math.random() * 3 + 1);

                        System.out.println(combo1 + " | " + combo2 + " | " + combo3);

                        if (combo1 == combo2 && combo2 == combo3) {
                            saldo = saldo + 2;
                            System.out.println("HAS GANADO");
                            System.out.println("Tu saldo actual: " + saldo);
                            System.out.println("----------------------------------------------------------");

                            System.out.println("Seleccione una opción \n 1-JUGAR \n 2-SALIR");
                            iniciar = numero2.nextInt();

                        } else {

                            System.out.println("HAS PERDIDO");
                            System.out.println("Tu saldo actual: " + saldo);
                            System.out.println("----------------------------------------------------------");

                            if (saldo>0) {
                                System.out.println("Seleccione una opción \n 1-JUGAR \n 2-SALIR");
                                iniciar = numero2.nextInt();
                            }else {

                                break;
                            }
                        }


                    default:
                        break;

                }
        }
            break;
        }while (iniciar==1);

        System.out.println("HASTA OTRA VAQUERO");
    }

}