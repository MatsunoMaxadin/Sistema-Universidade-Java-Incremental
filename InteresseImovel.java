
/**
 * Escreva uma descrição da classe InteresseImovel aqui.
 * 
 * @author (Pedro da Paz) 
 * @version (11052026 01)
 */

public class InteresseImovel
{
    private Estudante estudante;
    private Imovel imovel;
    private String status;
    private String dataInteresse;
   
    
    public InteresseImovel(Estudante estudante, Imovel imovel, String status, String dataInteresse){
        this.estudante = estudante;
        this.imovel = imovel;
        this.status = status;
        this.dataInteresse = dataInteresse;
    }
    
    public Estudante getEstudante() {
        return estudante;
    }

    public Imovel getImovel() {
        return imovel;
    }

    public String getStatus() {
        return status;
    }

    public String getDataInteresse() {
        return dataInteresse;
    }
}