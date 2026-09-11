package business;

public class GeradorSenhaForte extends GeradorSenha {
	
	
    private int tamanho;
    private boolean SenhaT = false;
    
    private boolean TemMaiuscula = false;
    private boolean TemMinuscula = false;
    private boolean TemNumeros = false;
    private boolean TemEspeciais = false;

    public GeradorSenhaForte(int tamanho) {
    	
        this.tamanho = tamanho;
        
        if (caracteres.lentgh() <12) {
        	SenhaT = false;
        }
        
    }

    @Override
    public String gerarSenha() {
        return null;
    }
    
}