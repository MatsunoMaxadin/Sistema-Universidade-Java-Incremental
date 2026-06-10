
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

imovel = new Imovel(proprietario, enderecoCompleto, fotos, descricaoCompleta, tipoAcomodacao, qtdDeQuartos, categoria, ID);
} return imovel;

}
}