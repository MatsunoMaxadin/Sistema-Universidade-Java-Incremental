
/**
 * Escreva uma descrição da classe Contrato aqui.
 * 
 * @author (Pedro da Paz) 
 * @version (05042026 01)
 */
public class Contrato
{
    public static final String STATUS_PENDENTE = "Pendente";
    public static final String STATUS_FORMALIZADO = "Formalizado";
    public static final String STATUS_ENCERRADO = "Encerrado";

    private Imovel imovel;
    private Proprietario proprietario;
    private Estudante estudante;
    private Responsavel responsavel;
    private String documentoDigital;
    private String status;
    private int tempoLocacao;
    private String assinaturaResponsavel;
    private String assinaturaProprietario;
    private String assinaturaEstudante;
    

    public Contrato(Imovel imovel, Proprietario proprietario, Estudante estudante, Responsavel responsavel, String documentoDigital, int tempoLocacao) {
        this.imovel = imovel;
        this.proprietario = proprietario;
        this.estudante = estudante;
        this.responsavel = responsavel;
        this.documentoDigital = documentoDigital;
        this.tempoLocacao = tempoLocacao;
        this.status = STATUS_PENDENTE;
    }

    public Imovel getImovel() {
        return this.imovel;
    }

    public Proprietario getProprietario() {
        return this.proprietario;
    }

    public Estudante getEstudante(){
        return this.estudante;
    }

    public Responsavel getResponsavel() {
        return this.responsavel;
    }


    public String getDocumentoDigital() {
        return this.documentoDigital;
    }

    

    public String getStatus() {
        return this.status;
    }

    
    
    public String getAssinaturaResponsavel(){
        return this.assinaturaResponsavel;
    }
    
    public String getAssinaturaProprietario(){
        return this.assinaturaProprietario;
    }
    
    public String getAssinaturaEstudante(){
        return this.assinaturaEstudante;
    }
    
    public boolean formalizarAluguel(String assinaturaResponsavel, String assinaturaProprietario, String assinaturaEstudante){
        if (!this.imovel.isDisponivel()) {
            System.err.println("Erro: imóvel não está disponível para locação.");
            return false;
        }

        if (assinaturaResponsavel == null || assinaturaProprietario == null || assinaturaEstudante == null) {
            System.err.println("Erro: todas as assinaturas digitais são obrigatórias.");
            return false;
        }

        this.assinaturaResponsavel = assinaturaResponsavel;
        this.assinaturaProprietario = assinaturaProprietario;
        this.assinaturaEstudante = assinaturaEstudante;
        this.status = STATUS_FORMALIZADO;
        this.imovel.alugar(this.estudante);
        this.estudante.adicionarContrato(this);
        return true;
    }

    public boolean encerrarContrato() {
        if (!this.status.equals(STATUS_FORMALIZADO)) {
            System.err.println("Erro: só é possível encerrar um contrato formalizado.");
            return false;
        }

        this.status = STATUS_ENCERRADO;
        this.imovel.desalugar();
        return true;
    }

    public boolean isFormalizado() {
        return STATUS_FORMALIZADO.equals(this.status);
    }

    public String toString() {
        return String.format("Contrato: imóvel=%s, estudante=%s, responsável=%s, status=%s",
            imovel.getID(), estudante.getCPF(), responsavel.getNomeCompleto(), status);
    }
}
