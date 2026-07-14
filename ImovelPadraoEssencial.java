public class ImovelPadraoEssencial extends Imovel {

    public ImovelPadraoEssencial(Proprietario proprietario, String enderecoCompleto, String fotos, String descricaoCompleta, String tipoAcomodacao, int qtdDeQuartos, String ID, float valorMaximoAluguel) {
        super(proprietario, enderecoCompleto, fotos, descricaoCompleta, tipoAcomodacao, qtdDeQuartos, ID, valorMaximoAluguel, 0.2f);
    }
}
