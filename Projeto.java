package app;
import java.util.Scanner;

public class Projeto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);{

      int opcao;

       System.out.println("Escolha 1 numero");
        System.out.print(" 1: cadastrar ");
        System.out.print("2: login ");
        System.out.print("3: ver perfil ");
        System.out.println("4: sair ");
        opcao = scanner.nextLine();



        switch (opcao) {
            case "1":
                System.out.print("cadastrar");
                break;
            case "2":
                System.out.print("login");
                break;
            case "3":
                System.out.print("ver perfil");
            break;
            case "sair":
                System.out.print("sair");
                break;
            default: System.out.print ("opcao invalida");






        }



        }



            }

        }






