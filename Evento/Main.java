package Evento;

import Evento.Artigos.ArtigosCadastrados;
import Evento.Artigos.ListarArtigos;
import Evento.Participantes.ListaParticipantes;
import Evento.Participantes.Participantes;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
   public static void main(String[] args){
       int choice;
       Scanner input;
       input = new Scanner(System.in);
       String login, password;
       String tituloAvaliacao;
       String tituloNegado, tituloAceito;
       String avaliacaoArtigo, tituloArtigoAvaliacao;
       String certificadoCpf, certificadoNome, certificadoCargo;
       String cpf, name, age, passwordContainer, institution, academicTtle, key;
       String autoresArtigo, tituloArtigo;
       String tituloDados;
       ArrayList<String> autoresVetor;
       String validacaoCpf, inavlidacaoCpf;
       Participantes novoPartcipante = new Participantes();
       ArtigosCadastrados novoArtigo = new ArtigosCadastrados();
       ListaParticipantes novaListaParticipantes = new ListaParticipantes();
       ListarArtigos novaListaArtigos = new ListarArtigos();

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
                   System.out.println("Informe o cpf que deseja validar:");
                   validacaoCpf = input.nextLine();

                   break;
               case 4:
                   System.out.println("Informe o cpf que deseja invalidar:");
                   inavlidacaoCpf = input.nextLine();
                   break;
               case 5:
                   System.out.println("Informe o cpf:");
                   certificadoCpf = input.nextLine();
                   System.out.println("Informe o nome:");
                   certificadoNome = input.nextLine();
                   System.out.println("Informe o cargo:");
                   certificadoCargo = input.nextLine();

                   System.out.println("*-----------------------------------*");
                   System.out.println("CERTIFICADO");
                   System.out.println("O/A " + certificadoNome + " participou do evento");
                   System.out.println("sob o cargo de " + certificadoCargo + ".");
                   System.out.println("*------------------------------------*");
                   break;
               case 6:
                   System.out.println("Informe o número de autores (até 5):");
                   int x = input.nextInt();
                   while(x>0) {
                       System.out.println("Informe autor(a)" + x + ":");
                       autoresArtigo = input.nextLine();
                       x-=1;
                   };
                   System.out.println("Informe o título do artigo:");
                   tituloArtigo = input.nextLine();
                   novoArtigo = new ArtigosCadastrados(tituloArtigo);
                   novaListaArtigos.insertArtigos(novoArtigo);
                   break;
               case 7:
                   System.out.println("Informe o título do artigo:");
                   tituloArtigoAvaliacao = input.nextLine();
                   System.out.println("Digite sua avaliação:");
                   avaliacaoArtigo = input.nextLine();
                   break;
               case 8:
                   System.out.println("Informe o título do artigo:");
                   tituloAvaliacao = input.nextLine();
                   break;
               case 9:
                   System.out.println("Informe o título do artigo:");
                   tituloAceito = input.nextLine();
                   break;
               case 10:
                   System.out.println("Informe o título do artigo:");
                   tituloNegado = input.nextLine();
                   break;
               case 11:
                   //novaListaNegados.listarValidos();
                   break;
               case 12:
                   //novaListaValidos.listarNegados();
                   break;
               case 13:
                   System.out.println("Informe o título do artigo");
                   tituloDados = input.nextLine();
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
