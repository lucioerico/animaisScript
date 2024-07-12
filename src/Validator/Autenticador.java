package Validator;

import animais.Animal;
import animais.AnimalCachorro;
import animais.AnimalGato;
import animais.AnimalLeao;

public class Autenticador {
    public boolean autenticar(Animal animal, String tipoAutenticado) {
        if (animal instanceof AnimalCachorro && tipoAutenticado.equalsIgnoreCase("cachorro")) {
            return true;
        } else if (animal instanceof AnimalGato && tipoAutenticado.equalsIgnoreCase("gato")) {
            return true;
        } else if (animal instanceof AnimalLeao && tipoAutenticado.equalsIgnoreCase("leao")) {
            return true;
        }
        return false;
    }
}
