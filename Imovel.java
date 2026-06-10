
/**
 * Escreva uma descrição da classe Imovel aqui.
 * 
 * @author (Pedro da Paz) 
 * @version (040502026 01)
 */
 
 import java.util.ArrayList;
public class Imovel
{
    
    private Proprietario proprietario;
    private String enderecoCompleto;
    private String fotos;
    private String descricaoCompleta;
    private String tipoAcomodacao;
    private ArrayList<Estudante> interessados = new ArrayList<>();
    private int qtdDeQuartos;
    private Estudante estudante;
    private Responsavel responsavel;
    private Avaliacao avaliacoes;
    private String categoria;
    private String status;
    private String ID;
    private ArrayList<InteresseImovel> interesses = new ArrayList<>();


    public Imovel(Proprietario proprietario, String enderecoCompleto, String fotos,
                  String descricaoCompleta, String tipoAcomodacao,int qtdDeQuartos, String categoria, String ID) {
        this.proprietario = proprietario;
        this.enderecoCompleto = enderecoCompleto;
        this.fotos = fotos;
        this.descricaoCompleta = descricaoCompleta;
        this.qtdDeQuartos = qtdDeQuartos;
        this.tipoAcomodacao = tipoAcomodacao;
        this.categoria = categoria;
        this.status = "Disponível";
        this.ID = ID;
    }
    
    public void setEstudante(Estudante estudante){
        this.estudante = estudante;
        this.responsavel = estudante.getResponsavel();
    
    }
    public Proprietario getProprietario() {
        return this.proprietario;
    }

    public String getEnderecoCompleto() {
        return this.enderecoCompleto;
    }

  

    public String getFotos() {
        return this.fotos;
    }

   

    public String getDescricaoCompleta() {
        return this.descricaoCompleta;
    }

   

    public String getTipoAcomodacao() {
        return this.tipoAcomodacao;
    }

    

    public ArrayList<Estudante> getInteressados() {
        return this.interessados;
    }


    public Avaliacao getAvaliacoes() {
        return this.avaliacoes;
    }

    public String getCategoria(){
        return this.categoria;
    }
    
    public String getStatus(){
        return this.status;
    }
    
    public void setStatus(String status){
        this.status = status;
    }
    
    public void finalizarContrato(){
        this.status = "Disponível";
        this.estudante = null;
        this.responsavel = null;
    }
    
    public String getID(){
        return this.ID;
    }
    
    public ArrayList<InteresseImovel> getInteresses(){
        return this.interesses;
    }
    
    public String toString() {
    return String.format(
        "Endereço completo: %s, Tipo de acomodação: %s",
        this.enderecoCompleto, this.tipoAcomodacao
    );
}

}
