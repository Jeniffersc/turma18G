package Arrays;
import java.util.Scanner;

public class Agenda {
	public static void main (String[] args) 
	{	
		Scanner ler = new Scanner (System.in);
		
		String [][]agenda = new String[24][31];
		int dia, hora, opcao, atividades = 0;
	   
		do
		{
            System.out.println("Minha agenda\n");

            System.out.println("Digite o numero do dia [1-31]");
            dia = ler.nextInt();
            dia = dia - 1;

            System.out.print("Digite o numero da hora [0-23]");
            hora = ler.nextInt();

            ler.nextLine(); //Limpar o leitor para ler o String agora
            
            System.out.print("Digite sua anotacao: ");
            agenda[hora][dia] = ler.nextLine();
            
            System.out.print("Desenja continuar? [1] - Sim / [0] - Nao: ");
            opcao = ler.nextInt();

		}
		
		while(opcao == 1);{
			for(int dias=0; dias<31; dias++) // vetor e matriz sempre vai ter giro -- giro dos dias
			{ 
		        for(int horas=0; horas<24; horas++) // giro das horas
		        {
		            if (agenda[horas][dias]!=null)
		            {
		            	System.out.println("Dia "+(dias+1)+" hora "+ horas+" e atividade: "+agenda[horas][dias]);
			            atividades++;
		            }
		        }
		     }
			System.out.print("Total de atividades cadastradas: "+ atividades);
		}
		
		ler.close();
		
	/*
	 * programa
{
    inclua biblioteca Util

    funcao inicio()
    {

        cadeia agenda[24][31]
        inteiro dia
        inteiro hora
        inteiro opcao
        inteiro atividades = 0

        faca{
            escreva("Minha agenda\n")
            escreva("\n")

            escreva("Digite o numero do dia [1-31]")
            leia(dia)

            dia = dia - 1

            escreva("Digite o numero da hora [0-23]")
            leia(hora)

            escreva("Digite sua anotacao: ")
            leia(agenda[hora][dia])

            escreva("Desenja continuar? [1] - Sim / [0] - Nao")
            leia(opcao)

		        }enquanto ( opcao == '1')

		    para(inteiro dias=0; dias<31; dias++) { // vetor e matriz sempre vai ter giro -- giro dos dias
		        para(inteiro horas=0; horas<24; horas++) {// giro das horas
		            se (agenda[horas][dias]!=""){
		            escreva("Dia ",dias+1," hora", horas," : ",agenda[horas][dias],"\n")
		            atividades++
		            }
		        }
		     }
		    escreva("\nTotal de atividades cadastradas: ", atividades)
		    }
		}
	 */
	}
}
