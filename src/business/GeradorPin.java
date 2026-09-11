package business;

public class GeradorPin extends GeradorSenha {

    @Override
    public String gerarSenha() {

        String pin = "";

        for (int i = 0; i < 6; i++) {

            pin += sortearCaractere(NUMEROS);
        }

        return pin;
    }
}