package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Basico;

public class ProgramaEscola {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		final int MOVIMENTOS = 3;
		final String SLOGAN = "SEU FUTURO COMEÇA AQUI";
		
		char codigo = ' ';
		String nome = "";
		int diaAniversario = 0;
		int matricula = 0;
		String cpf = "";
		char numeroStatus = ' ';
		boolean status = true;
		boolean opcaoValida = false;
		//double pontos = 0.0;
		char continuarMovimento = 'S';
		
		do {
			System.out.println("ESCOLA G6");
			System.out.println(SLOGAN);
			
			System.out.println("1 - BASICO");
		    System.out.println("2 - MEDIO"); 
		    System.out.println("3 - GRADUACAO");
		    System.out.println("4 - POS");
		    System.out.println("5 - MESTRADO");
		    System.out.println("6 - SAIR");
		    System.out.print("DIGITE O CÓDIGO DA OPÇÃO SELECIONADA: ");
		    codigo = leia.next().charAt(0);
		    
		    if (codigo != '6') {
		    	System.out.println("\nESCOLA G6");
			    System.out.println(SLOGAN);
			    
			    if(codigo == '1') {
			    	System.out.println("\nENSINO BÁSICO");
			    } else if(codigo == '2') {
			    	System.out.println("\nENSINO MÉDIO");
			    } else if(codigo == '3') {
			    	System.out.println("\nENSINO GRADUAÇÃO");
			    } else if(codigo == '4') {
			    	System.out.println("\nENSINO PÓS");
			    } else {
			    	System.out.println("\nENSINO MESTRADO");
			    }
			     
			    System.out.print("\nNOME: ");
			    nome = leia.next();
		
			    System.out.print("DIA DE ANIVERSARIO: ");
			    diaAniversario = leia.nextInt();
			     
			    System.out.print("MATRICULA: ");
			    matricula = leia.nextInt();
			    System.out.print("CPF: ");
			    cpf = leia.next();
			    System.out.print("STATUS (1 - ATIVO / 2 - INATIVO): ");
			    numeroStatus = leia.next().charAt(0);
			    if (numeroStatus == 1) {
			    	status = true;
			    }
			    else {
			    	status = false;
			    }
		    }
		    
		    switch (codigo) {
			case '1':
				Basico alunoBasico = new Basico(matricula, cpf, 0.0, status, nome, diaAniversario);
				int contadorBasico = 0;
				while(contadorBasico < MOVIMENTOS && continuarMovimento == 'S') {
			    	System.out.println("\nMOVIMENTO: " + (contadorBasico+1));
			     	System.out.println("TOTAL DA NOTA ATUAL (" + alunoBasico.getPontos() + ")\n");
			     	System.out.print("MOVIMENTO (I - INCLUSAO DE NOTA / R - RETIRADA DE NOTA): ");
				    char operacao = leia.next().toUpperCase().charAt(0);
		
				    System.out.print("VALOR DO MOVIMENTO: ");
				    double valorMovimento = leia.nextDouble();
		
				    if (operacao == 'I') {
				     	//adicionarNota
				     	alunoBasico.adicionarNota(valorMovimento);
				    }
				    else if (operacao == 'R') {
			    		//tirarNota
				    	alunoBasico.tirarNota(valorMovimento);
			    	}
				    System.out.println("TOTAL DA NOTA ATUAL APÓS O MOVIMENTO (" + alunoBasico.getPontos() + ")\n");
				    if (contadorBasico < (MOVIMENTOS - 1)) {
				     	System.out.print("CONTINUAR? (S/N): ");
				     	continuarMovimento = leia.next().toUpperCase().charAt(0);
					}
				    contadorBasico++;
			    }
				System.out.print("INSIRA O DIA ATUAL: ");
				int diaAtual = leia.nextInt();
				alunoBasico.bonusAniversario(diaAtual);
				System.out.println("TOTAL DA NOTA ATUAL APÓS A APLICAÇÃO DO BÔNUS DE ANIVERSÁRIO: " + alunoBasico.getPontos());
				opcaoValida = true;
				break;	
			case '2':
				
				break;
			case '3':
				
				break;	
			case '4':
				
				break;
			case '5':
				
				break;
			case '6':
				
				break;
			default:
				
				break;
		    }

		    
		} while (opcaoValida == false);
		
		System.out.println("FIM DE PROGRAMA!");
		
		leia.close();
	}
}
