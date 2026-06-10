
/**
 * Escreva uma descrição da classe Main aqui.
 * 
 * @author (Pedro da Paz) 
 * @version (14052026 01)
 */

import java.util.ArrayList;
public class Main
{
    public static void main (String [] args){
        
        
    Menu menu = new Menu();
    EntradaDados entrada = new EntradaDados();
    ArrayList <Proprietario> proprietarios = new ArrayList<>();
    ArrayList <Imovel> imoveis = new ArrayList<>();
    

    int opcao;

    do{

        System.out.println("\n Bem-vindo ao sistema FLATMETUNI");
        System.out.println("1 - Cadastrar Proprietário");
        System.out.println("2 - Cadastrar Imóvel");
        System.out.println("3 - Listar Proprietários");
        System.out.println("4 - Listar Imóveis");
        System.out.println("0 - Sair");

        opcao = entrada.lerOpcao();

        switch(opcao){

            case 1:
                Proprietario proprietario = menu.cadastraProprietario();
                proprietarios.add(proprietario);
                System.out.println("Proprietário cadastrado com sucesso!");
                break;
            case 2:
                Imovel imovel =
                menu.cadastraImovel(proprietarios);
                if(imovel != null){
                    imoveis.add(imovel);
                    System.out.println("Imóvel cadastrado com sucesso!");
                } else {
                    System.out.println("Erro no cadastro");
                }
                break;
            case 3:
                System.out.println("Lista de proprietarios: ");

                if(proprietarios.isEmpty()){

                    System.out.println(
                        "Nenhum proprietário cadastrado."
                    );

                }
                else{

                    for(Proprietario p : proprietarios){

                        System.out.println(p);

                    }

                }

                break;

            case 4:

                System.out.println(
                    "\n===== IMÓVEIS ====="
                );

                if(imoveis.isEmpty()){

                    System.out.println(
                        "Nenhum imóvel cadastrado."
                    );

                }
                else{

                    for(Imovel i : imoveis){
                        System.out.println(i);
                    }
                }

                break;

            case 0:

                System.out.println(
                    "Encerrando sistema..."
                );

                break;

            default:

                System.out.println(
                    "Erro: opção inválida."
                );

        }

    }while(opcao != 0);

}
        
        
        
        
    
}