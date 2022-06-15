package visao;

import dominio.Perfumaria;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int matriculaLida, op = 0, novoValor;
		
		Perfumaria p1 = new Perfumaria("Alchemist Rose - Eau de Parfum", "o Boticário", 1, 25, 875.75, true);
		Perfumaria p2 = new Perfumaria("Musk Marine", "Avon", 2, 25, 20.00, true);
		Perfumaria p3 = new Perfumaria("Homem", "Natura", 3, 25, 89.90, true);
		
		System.out.println("\tSeja bem vindo(a) ao sistema gerenciador de perfumes (SGP)");
		do {
			System.out.println("\nMatrículas existentes: "+ p1.getMatricula() + ", " + p2.getMatricula() + ", "  + p3.getMatricula() + ", " );
			System.out.println("Digite a matrícula do produto o qual você quer obter informações");
			matriculaLida = ler.nextInt();
			switch(matriculaLida) {

				//se for o perfume p1...
				case 1:
					System.out.println("\tO QUE VOCÊ QUER SABER/FAZER?");
					System.out.println("1 - Informações do Produto;");
					System.out.println("2 - Nome do Produto;");
					System.out.println("3 - Marca do Produto;");
					System.out.println("4 - Matrícula do produto;");
					System.out.println("5 - Lote do Produto;");
					System.out.println("6 - Valor do Produto;");
					System.out.println("7 - Disponibilidade para compra;");
					System.out.println("8 - Alterar Valor;  ou");
					System.out.println("9 - Sair do SGP.");
					op = ler.nextInt();
					
					switch(op) {	
						case 1:
							System.out.println(p1.verificaInformacoes());
							break;
						case 2:
							System.out.println(p1.verificaNome());
							break;
						case 3:
							System.out.println(p1.verificaMarca());
							break;
						case 4:
							System.out.println(p1.verificaMatricula());
							break;	
						case 5:
							System.out.println(p1.verificaLote());
							break;	
						case 6:
							System.out.println(p1.verificaValor());
							break;	
						case 7:
							if(p1.verificaDisponibilidade()) {
								System.out.println("O produto está disponível");
							}else {
								System.out.println("O produto está indisponível");
							}
							break;
						case 8:
							System.out.println("Qual o novo valor do produto?");
							novoValor = ler.nextInt();
							p1.alterarValor(novoValor);
							System.out.println("Valor atualizado: R$"+novoValor);
							break;
						case 9:
							System.out.println("Você Saiu do SGP!");
							break;
						default:
							System.out.println("Opção Inválida!");
							break;
					}
					break;
					
					
					//se for o perfume p2...
				case 2:
					System.out.println("\tO QUE VOCÊ QUER SABER/FAZER?");
					System.out.println("1 - Informações do Produto;");
					System.out.println("2 - Nome do Produto;");
					System.out.println("3 - Marca do Produto;");
					System.out.println("4 - Matrícula do produto;");
					System.out.println("5 - Lote do Produto; ou");
					System.out.println("6 - Valor do Produto.");
					System.out.println("7 - Disponibilidade para compra;");
					System.out.println("8 - Alterar Valor;  ou");
					System.out.println("9 - Sair do SGP.");
					op = ler.nextInt();
					
					switch(op) {	
					case 1:
						System.out.println(p2.verificaInformacoes());
						break;
					case 2:
						System.out.println(p2.verificaNome());
						break;
					case 3:
						System.out.println(p2.verificaMarca());
						break;
					case 4:
						System.out.println(p2.verificaMatricula());
						break;	
					case 5:
						System.out.println(p2.verificaLote());
						break;	
					case 6:
						System.out.println(p2.verificaValor());
						break;	
					case 7:
						if(p1.verificaDisponibilidade()) {
							System.out.println("O produto está disponível");
						}else {
							System.out.println("O produto está indisponível");
						}
						break;
					case 8:
						System.out.println("Qual o novo valor do produto?");
						novoValor = ler.nextInt();
						p2.alterarValor(novoValor);
						System.out.println("Valor atuualizado: R$"+novoValor);
						break;
					case 9:
						System.out.println("Você Saiu do SGP!");
						break;
					default:
						System.out.println("Opção Inválida!");
						break;
				}					
					
					break;
				//Se for o perfume p3...	
				case 3:
					System.out.println("\tO QUE VOCÊ QUER SABER/FAZER?");
					System.out.println("1 - Informações do Produto;");
					System.out.println("2 - Nome do Produto;");
					System.out.println("3 - Marca do Produto;");
					System.out.println("4 - Matrícula do produto;");
					System.out.println("5 - Lote do Produto; ou");
					System.out.println("6 - Valor do Produto.");
					System.out.println("7 - Disponibilidade para compra;");
					System.out.println("8 - Alterar Valor;  ou");
					System.out.println("9 - Sair do SGP.");
					op = ler.nextInt();
					
					switch(op) {	
					case 1:
						System.out.println(p3.verificaInformacoes());
						break;
					case 2:
						System.out.println(p3.verificaNome());
						break;
					case 3:
						System.out.println(p3.verificaMarca());
						break;
					case 4:
						System.out.println(p3.verificaMatricula());
						break;	
					case 5:
						System.out.println(p3.verificaLote());
						break;	
					case 6:
						System.out.println(p3.verificaValor());
						break;	
					case 7:
						if(p1.verificaDisponibilidade()) {
							System.out.println("O produto está disponível");
						}else {
							System.out.println("O produto está indisponível");
						}						
						break;
					case 8:
						System.out.println("Qual o novo valor do produto?");
						novoValor = ler.nextInt();
						p3.alterarValor(novoValor);
						System.out.println("Valor atuualizado: R$"+novoValor);
						break;
					case 9:
						System.out.println("Você Saiu do SGP!");
						break;					
					default:
						System.out.println("Opção Inválida!");
						break;
				}					
					
					break;
				default:	
					System.out.println("O Perfume Não Existe! \nTente outra matrícula.");
					break;
				}
			}while(op != 9);
			
			
	
		
	}
}
