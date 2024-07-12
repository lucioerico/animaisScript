package Validator;

public class Autenticador {
    public boolean autenticar(String tipoAutenticado) {
        if (tipoAutenticado.equalsIgnoreCase("cachorro")) {
            return true;
        } else if (tipoAutenticado.equalsIgnoreCase("gato")) {
            return true;
        } else if (tipoAutenticado.equalsIgnoreCase("leao")) {
            return true;
        }
        return false;
    }
}
