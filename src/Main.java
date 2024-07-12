import Validator.Autenticador;
import animais.Animal;
import animais.AnimalCachorro;
import animais.AnimalGato;
import animais.AnimalLeao;


public class Main {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Uso: java Principal <tipo_autenticado> <tipo_animal>");
            return;
        }

        String tipoAutenticado = args[0].toLowerCase();
        String tipoAnimal = args[1].toLowerCase();

        Animal animal;

        switch (tipoAnimal) {
            case "cachorro":
                animal = new AnimalCachorro();
                break;
            case "gato":
                animal = new AnimalGato();
            case "leao":
                animal = new AnimalLeao();
                break;
            default:
                System.out.println("Animal não reconhecido!");
                return;
        }

        Autenticador autenticador = new Autenticador();
        if (autenticador.autenticar(animal, tipoAutenticado)) {
            animal.emitirSom();
        } else {
            System.out.println("Animal não autenticado!");
        }
    }
}