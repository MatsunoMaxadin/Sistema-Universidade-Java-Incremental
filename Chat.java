
/**
 * Escreva uma descrição da classe Chat aqui.
 * 
 * @author (Pedro da Paz) 
 * @version (05042026 01)
 */
public class Chat
{
    
    private Estudante estudante;
    private Proprietario proprietario;
    private Imovel imovelReferencia;
    private String mensagens;

    public Chat(Estudante estudante, Proprietario proprietario, Imovel imovelReferencia, String mensagens) {
        this.estudante = estudante;
        this.proprietario = proprietario;
        this.imovelReferencia = imovelReferencia;
        this.mensagens = mensagens;
    }

    public Estudante getEstudante() {
        return this.estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }

    public Proprietario getProprietario() {
        return this.proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }

    public Imovel getImovelReferencia() {
        return this.imovelReferencia;
    }

    public void setImovelReferencia(Imovel imovelReferencia) {
        this.imovelReferencia = imovelReferencia;
    }

    public String getMensagens() {
        return this.mensagens;
    }

    public void setMensagens(String mensagens) {
        this.mensagens = mensagens;
    }

    
}