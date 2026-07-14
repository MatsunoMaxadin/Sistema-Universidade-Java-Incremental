
/**
 * Escreva uma descrição da classe Responsavel aqui.
 * 
 * @author (Pedro da Paz) 
 * @version (05042026 01)
 */
public class Responsavel extends Usuario
{
   
    private Estudante estudanteVinculado;
    private String comprovanteResidencia;

    public Responsavel(String nomeCompleto, String dataNascimento, String celular, String email, String senha, Estudante estudanteVinculado, String comprovanteResidencia) {
        super(nomeCompleto, dataNascimento, celular, email, senha);
        this.estudanteVinculado = estudanteVinculado;
        this.comprovanteResidencia = comprovanteResidencia;
    }

    public Estudante getEstudanteVinculado() {
        return this.estudanteVinculado;
    }

    public void setEstudanteVinculado(Estudante estudanteVinculado) {
        this.estudanteVinculado = estudanteVinculado;
    }

    public String getComprovanteResidencia() {
        return this.comprovanteResidencia;
    }

    public void setComprovanteResidencia(String comprovanteResidencia) {
        this.comprovanteResidencia = comprovanteResidencia;
    }

}