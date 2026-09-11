package business;

public class GeradorSenhaForte extends GeradorSenha {

    private int tam;

    public GeradorSenhaForte(int tam) {

    	this.tam = tam;
    	
        if (tam < 12) {
            throw new IllegalArgumentException("A senha deve ter no mínimo 12 caracteres.");
        }
    }

    @Override
    public String gerarSenha() {

        String senha = "";

        senha += sortearCaractere(MAIUSCULAS);
        senha += sortearCaractere(MINUSCULAS);
        senha += sortearCaractere(NUMEROS);
        senha += sortearCaractere(ESPECIAIS);

        String todos =
                MAIUSCULAS +
                MINUSCULAS +
                NUMEROS +
                ESPECIAIS;

        while (senha.length() < tam) {
            senha += sortearCaractere(todos);
        }

        senha = embaralhar(senha);

        return senha;
    }
    
}