package projeto;
import java.util.Scanner;
public class Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int idade ;
        String usuario;
        String senha;

        System.out.print("digite sua idade :");
         idade = sc.nextInt();

        if ( idade >= 18) {
            System.out.println("idade permitida para cadastro");
        }else {
            System.out.println ("idade nao permitida para cadastro");
             return;

        }

         System.out.println ("Digie nome de usuario");
          usuario = sc.next();

         System.out.println ("digite sua senha");
          senha = sc.next();

         System.out.println ("Usuario registrado");




    }
    }










