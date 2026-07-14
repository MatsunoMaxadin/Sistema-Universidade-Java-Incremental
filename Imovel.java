
/**
 * Escreva uma descrição da classe Imovel aqui.
 * 
 * @author (Pedro da Paz) 
 * @version (040502026 01)
 */
 
 import java.util.ArrayList;
public abstract class Imovel
{
    private static final String STATUS_DISPONIVEL = "Disponível";
    private static final String STATUS_ALUGADO = "Alugado";
    private static final String STATUS_MANUTENCAO = "Manutenção";
    private static final String STATUS_INDISPONIVEL = "Indisponível";
    
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
    private String status;
    private String ID;
    private float valorFinalAluguel;
    private float valorMaximoAluguel;
    private float fatorMultiplicador;
    
    private ArrayList<InteresseImovel> interesses = new ArrayList<>();


    public Imovel(Proprietario proprietario, String enderecoCompleto, String fotos, String descricaoCompleta, String tipoAcomodacao, int qtdDeQuartos, String ID, float valorMaximoAluguel, float fatorMultiplicador) {
        this.proprietario = proprietario;
        this.enderecoCompleto = enderecoCompleto;
        this.fotos = fotos;
        this.descricaoCompleta = descricaoCompleta;
        this.qtdDeQuartos = qtdDeQuartos;
        this.tipoAcomodacao = tipoAcomodacao;
        this.status = STATUS_DISPONIVEL;
        this.ID = ID;
        this.valorMaximoAluguel = valorMaximoAluguel;
        this.fatorMultiplicador = fatorMultiplicador;
        this.valorFinalAluguel = 0.0f;
    }
    
    public void setEstudante(Estudante estudante){
        this.estudante = estudante;
        if (estudante != null) {
            this.responsavel = estudante.getResponsavel();
        } else {
            this.responsavel = null;
        }
    }

    public boolean isDisponivel() {
        return this.status.equals(STATUS_DISPONIVEL);
    }

    public void alugar(Estudante estudante) {
        if (isDisponivel()) {
            setEstudante(estudante);
            this.status = STATUS_ALUGADO;
        }
    }
    
    public void desalugar(){
        if(!this.isDisponivel()){
            this.estudante = null;
            this.responsavel = null;
            this.status = STATUS_DISPONIVEL;
        }
    }

    public void adicionarInteresse(InteresseImovel interesse) {
        this.interesses.add(interesse);
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

    public String getStatus(){
        return this.status;
    }
    
    public void setFinalAluguel(int diasAlocacao){
        setValorFinalAluguel(this.valorMaximoAluguel * this.fatorMultiplicador * diasAlocacao);
    }

    public float getValorFinalAluguel(){
        return this.valorFinalAluguel;
    }

    public void setValorFinalAluguel(float valorFinalAluguel) {
        this.valorFinalAluguel = valorFinalAluguel;
    }

    public float getValorMaximoAluguel(){
        return this.valorMaximoAluguel;
    }

    public float getFatorMultiplicador(){
        return this.fatorMultiplicador;
    }

    public String getID(){
        return this.ID;
    }
    
    public ArrayList<InteresseImovel> getInteresses(){
        return this.interesses;
    }
    
    public String toString() {
        return String.format(
            "ID: %s | Endereço completo: %s | Tipo de acomodação: %s | Fator: %.1f | Status: %s",
            this.ID, this.enderecoCompleto, this.tipoAcomodacao, this.fatorMultiplicador, this.status
        );
    }
    

}
