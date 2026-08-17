package academy.devdojo.maratonajava.exerciciosrevisão.dominio;

public class Validador {
    public static boolean apenasNumeros(String s) {
        if (s == null || s.isEmpty()) return false;
        return s.chars().allMatch(Character::isDigit);
    }

    public static boolean possuiOnzeCaracteres(String s) {
        return s != null && s.length() == 11;
    }

    public static String removerPontuacao(String cpf) {
        if (cpf == null) return null;
        return cpf.replace(".", "").replace("-", "");
    }

    public static boolean validarCPF(String cpf) {
        if (cpf == null) return false;


        String limpo = removerPontuacao(cpf);

        if (!possuiOnzeCaracteres(limpo)) {
            return false;
        }

        if (!apenasNumeros(limpo)) {
            return false;
        }

        return true;
    }
}
