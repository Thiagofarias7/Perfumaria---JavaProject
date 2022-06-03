/* 
PROBLEMA: Determinado dono de uma perfumaria 
percebeu que os preços colocados nos perfumes 
para indicar o seu valor, saíam muito facilmente (muitos clientes retiravam ou por algum motivo o adesivo se descolava por si só...),  
sem falar que muitas vezes, os estoques velhos perdiam suas informações como marca e fragrância.
Sabendo disso, o proprietário da perfumaria contratou um desenvolvedor de software, e o pediu que criasse um software 
orientado a objetos que conseguisse guardar essas informações a partir de uma "matrícula do perfume", "o perfumista  colocaria 
no perfume apenas a matrícula (aproximadamennte dois dígitos)".
Sendo assim, ele poderia facilmente encontrá-los e a partir do software conseguir informações do produto, 
tais como: marca, lote, nome do produto, matrícula no sistema, 
valor do produto e se o mesmo está disponível (em estoque) para a venda.  
O software em si, guarda todas essas informações, e assim que o usuário digita a matrícula, fica fácil
 descobrir todas as informações que dizem respeito aquele perfume.
O nome do software é SGP (sistema gerenciador de perfumes) 
*/

package dominio;

public class Perfumaria {
	private String nome;
	private String marca;
	private int matricula;
	private int  lote;
	private double valor;
	private boolean disponivelPCompra;
	
	
	public Perfumaria(){
		
	}
	
	public Perfumaria(String nomeD, String marcaD, int matriculaD, int loteD, double valorD, boolean diponivelPCompraD) {
		nome = nomeD;
		marca = marcaD;
		matricula = matriculaD;
		lote = loteD;
		valor = valorD;
		disponivelPCompra = diponivelPCompraD;
	}

	
	public Object verificaInformacoes() {
		return (nome + "\n" + marca + "\n" + matricula + "\n" + lote + "\n" + valor); 
	}
	
	public String verificaNome() {		
		return ("Nome do produto é: "+ nome);
	}
	
	public String verificaMarca() {		
		return ("Marca do produto é: "+ marca);
	}
	
	public String verificaMatricula() {		
		return ("Matrícula do produto é: "+ matricula);
	}
	
	public String verificaLote() {		
		return ("Lote do produto é: "+ lote);
	}
	
	public String verificaValor() {		
		return ("Valor do produto é: R$"+ valor);
	}
	
	public boolean verificaDisponibilidade() {		
		if(disponivelPCompra) {
			return true;
		}else {
			return false;
		}
	}
	
	public void alterarValor(int novoValor) {
		valor = novoValor;	
	}
	
	
	// GETS
	public String getNome() {
		return nome;
		}
	
	public String getMarca() {
		return marca;
		}
	
	public int getMatricula() {
		return matricula;
		}
	
	public int getLote() {
		return lote;
		}
	
	public double getValor() {
		return valor;
		}
	
	public boolean getDisponibilidadeProduto() {
		return disponivelPCompra;
		}
	
	//SETS
	
	//SETS
	public String setNome() {
		return nome;
		}

	public String setMarca() {
		return marca;
		}

	public int setMatricula() {
		return matricula;
		}
	
	public int setLote() {
		return lote;
		}
	
	public double setValor() {
		return valor;
		}
	
	public boolean setDisponibilidadeProduto() {
		return disponivelPCompra;
		}
	
	
}
