public class ImovelPadraoColetivo extends Imovel {
    private float taxaCondominio;

    public ImovelPadraoColetivo(Proprietario proprietario, String enderecoCompleto, String fotos, String descricaoCompleta, String tipoAcomodacao, int qtdDeQuartos, String ID, float valorMaximoAluguel, float taxaCondominio) {
        super(proprietario, enderecoCompleto, fotos, descricaoCompleta, tipoAcomodacao, qtdDeQuartos, ID, valorMaximoAluguel, 0.5f);
        this.taxaCondominio = taxaCondominio;
    }

    public float getTaxaCondominio() {
        return this.taxaCondominio;
    }

    @Override
    public void setFinalAluguel(int diasAlocacao) {
        setValorFinalAluguel(getValorMaximoAluguel() * getFatorMultiplicador() * diasAlocacao + this.taxaCondominio);
    }
}
