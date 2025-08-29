package subsistema2.cep;

public class CepApi {

    private static CepApi instance = new CepApi();

    public CepApi() {
    }

    public static CepApi getInstance() {
        return instance;
    }

    public String recuperarCidade(String cep) {
        return "Recuperando cidade do CEP: " + cep;
    }

    public String recuperarEstado(String cep) {
        return "Recuperando cidade do CEP: " + cep;
    }
}
