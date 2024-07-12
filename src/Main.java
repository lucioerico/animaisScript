import Validator.Autenticador;
import animais.Animal;
import animais.AnimalCachorro;
import animais.AnimalGato;
import animais.AnimalLeao;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tipo de animal: ");
        String tipoAnimal = scanner.nextLine().toLowerCase();

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
        if (autenticador.autenticar(tipoAnimal)) {
            animal.emitirSom();
        } else {
            System.out.println("Animal não autenticado!");
        }
    }
}