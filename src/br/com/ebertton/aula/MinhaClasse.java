package br.com.ebertton.aula;

public class MinhaClasse {
    
    public static void main (String [] args) {
        String primeiroNome = "Ebertton";
        String segundoNome = "Abreu Rodrigues";
        System.out.print(nomeCompleto(primeiroNome, segundoNome));
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
