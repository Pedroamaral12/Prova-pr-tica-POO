package Evento;

import java.util.Collection;
import java.util.Scanner;

public class Main {
   public static void main(String[] args){
       int choice;
       Scanner input;
       input = new Scanner(System.in);
       String login, password;
       String cpf, name, age, passwordContainer, institution, academicTtle, key;
       Participantes novoPartcipante = new Participantes();
       ListaParticipantes novaListaParticipantes = new ListaParticipantes();

       do{
           System.out.println("#-----------------------------------------#");
           System.out.println("MENU");
           System.out.println("#-----------------------------------------#");
           System.out.println("1. Fazer login.");
           System.out.println("2. Inscrever participante.");
           System.out.println("3. Validar inscrição de participante.");
           System.out.println("4. Invalidar inscri¸c˜ao de participante.");
           System.out.println("5. Emitir certificado para participante.");
           System.out.println("6. Submeter artigo.");
           System.out.println("7. Enviar avaliação de artigo.");
           System.out.println("8. Ver avaliações de um artigo.");
           System.out.println("9. Aceitar artigo.");
           System.out.println("10. Rejeitar artigo.");
           System.out.println("11. Listar artigos aceitos em ordem alfabética.");
           System.out.println("12. Listar artigos negados em ordem alfabética.");
           System.out.println("13. Ver dados de um artigo.");
           System.out.println("14. Listar participantes do evento em ordem alfabética.");
           System.out.println("15. Sair. Encerrar o programa.");

           choice = input.nextInt();
           input.nextLine();

           switch(choice){

               case 1:
                   System.out.println("Digite o login:");
                   login = input.nextLine();
                   System.out.println("Digite a senha:");
                   password = input.nextLine();
                   break;
               case 2:
                   System.out.println("Digite o CPF:");
                   cpf = input.nextLine();
                   System.out.println("Digite o nome:");
                   name = input.nextLine();
                   System.out.println("Digite a data de nascimento:");
                   age = input.nextLine();
                   System.out.println("Digite a titulação acadêmica:");
                   academicTtle = input.nextLine();
                   System.out.println("Digite a instituição de vínculo:");
                   institution = input.nextLine();
                   System.out.println("Digite a senha:");
                   passwordContainer = input.nextLine();
                   System.out.println("Digite:1 para program chair" +
                           " 2 para general chair" +
                           " 3 para autor" +
                           " 4 para revisor");
                   key = input.nextLine();
                   novoPartcipante = new Participantes(cpf, name, age, institution, academicTtle, passwordContainer, key);

                   novaListaParticipantes.insertParticipantes(novoPartcipante);

                   break;
               case 3:
                   break;
               case 4:
                   break;
               case 5:
                   break;
               case 6:
                   break;
               case 7:
                   break;
               case 8:
                   break;
               case 9:
                   break;
               case 10:
                   break;
               case 11:
                   break;
               case 12:
                   break;
               case 13:
                   break;
               case 14:
                   novaListaParticipantes.listarParticipantes();
                   break;
               default:
                   System.out.println("Digite somente um número, de 1 a 15.");
           }

       }while (choice != 15);
   }
}
