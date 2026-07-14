
/**
 * Escreva uma descrição da classe Menu aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */

import java.util.ArrayList;
public class Menu

{
    EntradaDados entrada = new EntradaDados();

    


public Proprietario cadastraProprietario(){
String nomeCompleto = entrada.lerNomeCompleto();
String dataNascimento = entrada.lerDataNascimento();
String celular = entrada.lerCelular();
String email = entrada.lerEmail();
String senha = entrada.lerSenha();
String documentosPropriedade = entrada.lerDocumentosPropriedade();

Proprietario proprietario = new Proprietario(nomeCompleto, dataNascimento,celular,email,senha,documentosPropriedade);


return proprietario;
}

public Proprietario buscaProprietario(ArrayList<Proprietario> proprietarios){
    System.out.println("Qual o nome completo do proprietário?");
    String nomeCompleto = entrada.lerNomeCompleto();
    Proprietario proprietarioBusca = null;
    for (Proprietario proprietario: proprietarios){
        if(proprietario.getNomeCompleto().equals(nomeCompleto))
            proprietarioBusca = proprietario;
        
    }
    
    return proprietarioBusca;
}
    

public Imovel cadastraImovel(ArrayList <Proprietario> proprietarios){

Proprietario proprietario = buscaProprietario(proprietarios);
Imovel imovel = null;
if (proprietario == null){
    System.out.println("Erro: proprietario não encontrado");
}
else {
String enderecoCompleto = entrada.lerEnderecoCompleto();
String fotos = entrada.lerFotos();
String descricaoCompleta = entrada.lerDescricaoCompleta();
String tipoAcomodacao = entrada.lerTipoAcomodacao();
int qtdDeQuartos = entrada.lerQtdDeQuartos();
String categoria = entrada.lerCategoria();
String ID = entrada.lerID();
float valorMaximoAluguel = entrada.lerFloat("Valor máximo do aluguel: ");
float IPTU = 0.0f;
float taxaCondominio = 0.0f;

switch (categoria) {
    case "A":
        imovel = new ImovelPadraoEssencial(proprietario, enderecoCompleto, fotos, descricaoCompleta, tipoAcomodacao, qtdDeQuartos, ID, valorMaximoAluguel);
        break;
    case "B":
        IPTU = entrada.lerFloat("Valor do IPTU: ");
        imovel = new ImovelPadraoUrbano(proprietario, enderecoCompleto, fotos, descricaoCompleta, tipoAcomodacao, qtdDeQuartos, ID, valorMaximoAluguel, IPTU);
        break;
    case "C":
        taxaCondominio = entrada.lerFloat("Valor do condomínio: ");
        imovel = new ImovelPadraoColetivo(proprietario, enderecoCompleto, fotos, descricaoCompleta, tipoAcomodacao, qtdDeQuartos, ID, valorMaximoAluguel, taxaCondominio);
        break;
    case "D":
        IPTU = entrada.lerFloat("Valor do IPTU: ");
        taxaCondominio = entrada.lerFloat("Valor do condomínio: ");
        imovel = new ImovelConforto1(proprietario, enderecoCompleto, fotos, descricaoCompleta, tipoAcomodacao, qtdDeQuartos, ID, valorMaximoAluguel, IPTU, taxaCondominio);
        break;
    case "E":
        IPTU = entrada.lerFloat("Valor do IPTU: ");
        taxaCondominio = entrada.lerFloat("Valor do condomínio: ");
        imovel = new ImovelConfortoPlus(proprietario, enderecoCompleto, fotos, descricaoCompleta, tipoAcomodacao, qtdDeQuartos, ID, valorMaximoAluguel, IPTU, taxaCondominio);
        break;
    case "F":
        IPTU = entrada.lerFloat("Valor do IPTU: ");
        taxaCondominio = entrada.lerFloat("Valor do condomínio: ");
        imovel = new ImovelPremium(proprietario, enderecoCompleto, fotos, descricaoCompleta, tipoAcomodacao, qtdDeQuartos, ID, valorMaximoAluguel, IPTU, taxaCondominio);
        break;
    case "G":
        IPTU = entrada.lerFloat("Valor do IPTU: ");
        taxaCondominio = entrada.lerFloat("Valor do condomínio: ");
        imovel = new ImovelMaster(proprietario, enderecoCompleto, fotos, descricaoCompleta, tipoAcomodacao, qtdDeQuartos, ID, valorMaximoAluguel, IPTU, taxaCondominio);
        break;
    default:
        break;
}
} return imovel;

}
}