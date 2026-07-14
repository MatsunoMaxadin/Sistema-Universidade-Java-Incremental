
/**
 * Escreva uma descrição da classe EntradaDados aqui.
 * 
 * @author (Pedro da Paz) 
 * @version (14052026 01)
 */
import java.util.Scanner;

public class EntradaDados{
	private Scanner scanner;

	public EntradaDados(){
		this.scanner = new Scanner(System.in);
	}

	public String lerString(){
		String texto;
		do{
			texto = scanner.nextLine();
			if(texto.equals(""))
				System.err.println("Erro: campo não pode ser vazio");

		}while(texto.equals(""));

		return texto;
		
	}
	
	public int lerInt(){
	   int numero;
	   numero = scanner.nextInt();
	   scanner.nextLine();
	   
	   return numero;
	}

	public float lerFloat(String mensagem){
	    float valor;
        while scanner.hasNextFloat() == false {
            System.out.println("Erro: valor inválido. Digite um número.");
            scanner.nextLine();
        }
        valor = scanner.nextFloat();
	    scanner.nextLine();
	    return valor;
	}

	public String lerNomeCompleto(){
		System.out.print("Nome completo: ");
		String nome = lerString();
		return nome;
	}
	
	
	public String lerFuncao(){
		System.out.print("Função: ");
		String funcao = lerString();
		return funcao;
		
	}

	public String lerCPF(){
		System.out.print("CPF: ");
		String CPF = lerString();
		return CPF;
	}

	public String lerDepartamento(){
		System.out.print("Departamento: ");
		String departamento = lerString();
		return departamento;
	}

	

	public int lerOpcao(){
		System.out.print("Digite a Opção:");
		int op = scanner.nextInt();
		scanner.nextLine();
		
		return op;
	}

        public String lerDataNascimento(){
            System.out.print("Data de nascimento: ");
            String dataNascimento = lerString();
            return dataNascimento;
        }
        
        public String lerCelular(){
            System.out.print("Celular: ");
            String celular = lerString();
            return celular;
        }
        
        public String lerEmail(){
            System.out.print("Email: ");
            String email = lerString();
            return email;
        }
        
        public String lerSenha(){
            System.out.print("Senha: ");
            String senha = lerString();
            return senha;
        }
        
        public String lerDocumentosPropriedade(){
            System.out.print("Documentos da propriedade: ");
            String documentosPropriedade = lerString();
            return documentosPropriedade;
        }
        
        public int lerQtdDeQuartos(){
            System.out.print("Quantidade de quartos: ");
            int qtdDeQuartos;
            do {
            qtdDeQuartos = lerInt();
            
            if(qtdDeQuartos < 1)
             System.out.println("Erro: deve ter pelo menos um quarto!");
            
        } while(qtdDeQuartos < 1);
            return qtdDeQuartos;
        }
        public String lerEnderecoCompleto(){
            System.out.print("Endereço completo: ");
            String enderecoCompleto = lerString();
            return enderecoCompleto;
        }
        
        public String lerFotos(){
            System.out.print("Fotos: ");
            String fotos = lerString();
            return fotos;
        }
        
        public String lerDescricaoCompleta(){
            System.out.print("Descrição completa: ");
            String descricaoCompleta = lerString();
            return descricaoCompleta;
        }
        
        public String lerStatus(){
            System.out.print("Status: ");
            String status = lerString();
            return status;
        }
        
        public String lerTipoAcomodacao(){
            System.out.print("Tipo de acomodação: ");
            String tipoAcomodacao = lerString();
            return tipoAcomodacao;
        }
        
        
        public String lerCategoria(){

            String categoria;

            do{

                System.out.print("Categoria (A-G): ");
                categoria = lerString().toUpperCase();

                if(!categoria.equals("A") && !categoria.equals("B") && !categoria.equals("C") && !categoria.equals("D") && !categoria.equals("E") && !categoria.equals("F") && !categoria.equals("G") ){

                System.err.println(
                    "Erro: categoria inválida. Digite entre A e G."
                );

                }

            }while(!categoria.equals("A") && !categoria.equals("B") && !categoria.equals("C") && !categoria.equals("D") && !categoria.equals("E") && !categoria.equals("F") && !categoria.equals("G"));

        return categoria;
        }
        
        
        
        public String lerID(){
            System.out.print("ID: ");
            String ID = lerString();
            return ID;
        }
}

