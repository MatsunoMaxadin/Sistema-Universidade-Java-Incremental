
/**
 * Escreva uma descrição da classe Proprietario aqui.
 * 
 * @author (Pedro da Paz) 
 * @version (05042026 01)
 */
import java.util.ArrayList;
public class Proprietario extends Usuario
{

    private String documentosPropriedade;
    private ArrayList <InteresseImovel> interesses = new ArrayList<>();

    public Proprietario(String nomeCompleto, String dataNascimento, String celular, String email, String senha, String documentosPropriedade) {
        super(nomeCompleto, dataNascimento, celular, email, senha);
        this.documentosPropriedade = documentosPropriedade;
    }


    


    public String getDocumentosPropriedade() {
        return this.documentosPropriedade;
    }

    
    
    public void setInteresse(InteresseImovel interesse){
        this.interesses.add(interesse);
    }
    
    public Imovel buscaImovelId(String IdBusca){
        Imovel imovel = null;
        for (InteresseImovel interesse : interesses){
            if(interesse.getImovel().getID().equals(IdBusca))
                imovel = interesse.getImovel();
        }
        return imovel;
    }
    
    public Imovel buscarImovelPorEndereco(String enderecoBusca){
    Imovel imovel = null;
    for (InteresseImovel interesse : interesses){
        if(interesse.getImovel().getEnderecoCompleto().equals(enderecoBusca))
            imovel = interesse.getImovel();
    }
    return imovel;
}
    
    public Estudante buscaEstudanteCpf(String Cpf){
        Estudante estudante = null;
        
        for (InteresseImovel interesse : interesses){
            if(interesse.getEstudante().getCPF().equals(Cpf))
                estudante = interesse.getEstudante();
        }
        
        return estudante;
    }
    
    
    
    public void mostrarEstudantesInteresseId(String idBusca){
        Imovel imovel = buscaImovelId(idBusca);
        if (imovel != null){
            for (InteresseImovel interesse: imovel.getInteresses()){
                System.out.println(interesse.getEstudante());
    
            } }else {
            System.out.println("Erro: imovel nao encontrado");
            }
                

        
        }
        
        public void mostrarEstudantesInteresseEndereco(String enderecoBusca){
        Imovel imovel = buscarImovelPorEndereco(enderecoBusca);
        if (imovel != null){
            for (InteresseImovel interesse: imovel.getInteresses()){
                System.out.println(interesse.getEstudante());
    
            } }else {
            System.out.println("Erro: imovel nao encontrado");
            }
                
        }
        
        public String toString(){

    return String.format("Nome Completo: %s\n Data de Nascimento: %s\n Celular: %s\n Email: %s\n Documentos da Propriedade: %s",
         this.getNomeCompleto(), this.getDataNascimento(), this.getCelular(), this.getEmail(), this.getDocumentosPropriedade());

}
    }

