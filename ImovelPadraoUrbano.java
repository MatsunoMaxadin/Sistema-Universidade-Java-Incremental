public class ImovelPadraoUrbano extends Imovel {
    private float IPTU;

    public ImovelPadraoUrbano(Proprietario proprietario, String enderecoCompleto, String fotos, String descricaoCompleta, String tipoAcomodacao, int qtdDeQuartos, String ID, float valorMaximoAluguel, float IPTU) {
        super(proprietario, enderecoCompleto, fotos, descricaoCompleta, tipoAcomodacao, qtdDeQuartos, ID, valorMaximoAluguel, 0.4f);
        this.IPTU = IPTU;
    }

    public float getIPTU() {
        return this.IPTU;
    }

    @Override
    public void setFinalAluguel(int diasAlocacao) {
        setValorFinalAluguel(getValorMaximoAluguel() * getFatorMultiplicador() * diasAlocacao + this.IPTU);
    }
}
