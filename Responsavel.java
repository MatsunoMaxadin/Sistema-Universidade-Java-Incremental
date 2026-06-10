
/**
 * Escreva uma descrição da classe Responsavel aqui.
 * 
 * @author (Pedro da Paz) 
 * @version (05042026 01)
 */
public class Responsavel
{
   
    private Usuario usuario;
    private Estudante estudanteVinculado;
    private String comprovanteResidencia;

    public Responsavel(Usuario usuario, Estudante estudanteVinculado, String comprovanteResidencia) {
        this.usuario = usuario;
        this.estudanteVinculado = estudanteVinculado;
        this.comprovanteResidencia = comprovanteResidencia;
    }

    public Usuario getUsuario() {
        return this.usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
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