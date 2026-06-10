
/**
 * Escreva uma descrição da classe Avaliacao aqui.
 * 
 * @author (Pedro da Paz) 
 * @version (05042026 01)
 */
public class Avaliacao
{
    
    private Estudante autor;
    private Imovel imovel;
    private float nota;
    private String comentario;
    private String dataPublicacao;

    public Avaliacao(Estudante autor, Imovel imovel, float nota,
                     String comentario, String dataPublicacao) {
        this.autor = autor;
        this.imovel = imovel;
        this.nota = nota;
        this.comentario = comentario;
        this.dataPublicacao = dataPublicacao;
    }

    public Estudante getAutor() {
        return this.autor;
    }

    public void setAutor(Estudante autor) {
        this.autor = autor;
    }

    public Imovel getImovel() {
        return this.imovel;
    }

    public void setImovel(Imovel imovel) {
        this.imovel = imovel;
    }

    public float getNota() {
        return this.nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public String getComentario() {
        return this.comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getDataPublicacao() {
        return this.dataPublicacao;
    }

    public void setDataPublicacao(String dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

}