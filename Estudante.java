
/**
 * Escreva uma descrição da classe Estudante aqui.
 * 
 * @author (Pedro da Paz) 
 * @version (05042026 01)
 */
 
 import java.util.ArrayList;
public class Estudante
{
    
    private Usuario usuario;
    private String nome;
    private String CPF;
    private String telefone;
    private Responsavel responsavel;
    private String comprovanteMatricula;
    private String numeroMatricula;
    private String universidade;
    private int idade;
    private String descricaoPessoal;
    private ArrayList<Contrato> contratosImoveis = new ArrayList<>();
    private ArrayList<InteresseImovel> interesses = new ArrayList<>();
    
    
    
    public Estudante(Usuario usuario, String nome, String CPF,String telefone, Responsavel responsavel, String numeroMatricula, String comprovanteMatricula,
                     String universidade, int idade, String descricaoPessoal) {
        this.usuario = usuario;
        this.nome = nome;
        this.CPF = CPF;
        this.telefone = telefone;
        this.responsavel = responsavel;
        this.numeroMatricula = numeroMatricula;
        this.comprovanteMatricula = comprovanteMatricula;
        this.universidade = universidade;
        this.idade = idade;
        this.descricaoPessoal = descricaoPessoal;
    }

    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public String getCPF(){
        return this.CPF;
    }
    
    public String getTelefone(){
        return this.telefone;
    }
    
    public Responsavel getResponsavel(){
        return this.responsavel;
    }

   

    public String getNumeroMatricula() {
        return this.numeroMatricula;
    }

    

    public String getComprovanteMatricula() {
        return this.comprovanteMatricula;
    }

    

    public String getUniversidade() {
        return this.universidade;
    }

    

    public int getIdade() {
        return this.idade;
    }



    public String getDescricaoPessoal() {
        return this.descricaoPessoal;
    }

    
    
    public Contrato getContrato(int indice){
        return this.contratosImoveis.get(indice);
    }
    
    public ArrayList<InteresseImovel> getInteresse(){
        return this.interesses;
    }
    
    public void setInteresse(InteresseImovel interesse){
        this.interesses.add(interesse);
    }
    
    public Imovel buscarImovelId(String idBusca){
        Imovel imovel = null;
        for (InteresseImovel interesse : interesses){
            if(interesse.getImovel().getID().equals(idBusca))
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

public void verEstudantesInteressadosPorEndereco(String enderecoBusca){
    Imovel imovel = buscarImovelPorEndereco(enderecoBusca);
    if (imovel != null){
        for (InteresseImovel interesse : interesses)
            System.out.println(interesse.getEstudante());
    } else {
        System.out.println("Erro: imovel nao encontrado!");
    }
}
    
    public void verDadosImoveis(){
        for (InteresseImovel interesse : interesses){
            System.out.println(interesse.getImovel());
        
        }
    }
    
    public void verEstudantesInteressados(String idBusca){
        Imovel imovel = buscarImovelId(idBusca);
        if (imovel!= null){
            for (InteresseImovel interesse : interesses)
                System.out.println(interesse.getEstudante());
        } else {
            System.out.println("Erro: imovel nao encontrado!");
        }
    }
    public String toString() {
    return String.format(
        "Nome: %s, CPF: %s, Telefone: %s, Idade: %d, Universidade: %s, Descrição Pessoal: %s",
        this.nome, this.CPF, this.telefone, this.idade, this.universidade, this.descricaoPessoal
    );
}

}
