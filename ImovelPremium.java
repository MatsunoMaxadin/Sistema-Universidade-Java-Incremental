public class ImovelPremium extends Imovel {
    private float IPTU;
    private float taxaCondominio;

    public ImovelPremium(Proprietario proprietario, String enderecoCompleto, String fotos, String descricaoCompleta, String tipoAcomodacao, int qtdDeQuartos, String ID, float valorMaximoAluguel, float IPTU, float taxaCondominio) {
        super(proprietario, enderecoCompleto, fotos, descricaoCompleta, tipoAcomodacao, qtdDeQuartos, ID, valorMaximoAluguel, 0.9f);
        this.IPTU = IPTU;
        this.taxaCondominio = taxaCondominio;
    }

    public float getIPTU() {
        return this.IPTU;
    }

    public float getTaxaCondominio() {
        return this.taxaCondominio;
    }

    @Override
    public void setFinalAluguel(int diasAlocacao) {
        setValorFinalAluguel(getValorMaximoAluguel() * getFatorMultiplicador() * diasAlocacao + this.IPTU + this.taxaCondominio);
    }
}
