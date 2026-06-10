
/**
 * Escreva uma descrição da classe Contrato aqui.
 * 
 * @author (Pedro da Paz) 
 * @version (05042026 01)
 */
 
 import java.util.ArrayList;
public class Contrato
{
    
    private Imovel imovel;
    private Proprietario proprietario;
    private Estudante estudante;
    private Responsavel responsavel;
    private String documentoDigital;
    private String status;
    private String assinaturaResponsavel;
    private String assinaturaProprietario;
    private String assinaturaEstudante;

    public Contrato(Imovel imovel, Proprietario proprietario, Estudante estudante, Responsavel responsavel, String documentoDigital) {
        this.imovel = imovel;
        this.proprietario = proprietario;
        this.estudante = estudante;
        this.responsavel = responsavel;
        this.documentoDigital = documentoDigital;
        this.status = status;
        
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
    
    public void formalizarAluguel(String assinaturaResponsavel, String assinaturaProprietario, String assinaturaEstudante, Estudante estudante){
        if (this.imovel.getStatus().equals("Disponível")){
        this.assinaturaResponsavel = assinaturaResponsavel;
        this.assinaturaProprietario = assinaturaProprietario;
        this.assinaturaEstudante = assinaturaEstudante;
        this.imovel.setStatus("Alugado");
        this.imovel.setEstudante(estudante);
        
        }
    }
    
    

}
