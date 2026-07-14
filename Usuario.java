
/**
 * Escreva uma descrição da classe Usuario aqui.
 * 
 * @author (Pedro da Paz) 
 * @version (05042026 01)
 */
public abstract class Usuario
{
    
    private String nomeCompleto;
    private String dataNascimento;
    private String celular;
    private String email;
    private String senha;

    public Usuario(String nomeCompleto, String dataNascimento, String celular, String email, String senha) {
        this.nomeCompleto = nomeCompleto;
        this.dataNascimento = dataNascimento;
        this.celular = celular;
        this.email = email;
        this.senha = senha;
    }

    public String getNomeCompleto() {
        return this.nomeCompleto;
    }

   

    public String getDataNascimento() {
        return this.dataNascimento;
    }

    

    public String getCelular() {
        return this.celular;
    }

   

    public String getEmail() {
        return this.email;
    }

    

    public String getSenha() {
        return this.senha;
    }

    

}