

public class Principal {
    public static void main(String[] args) {        
        // Crear un objeto de la clase Animal
        Animal animal1 = new Animal();
        animal1.nombre = "Firulais";
        animal1.edad = 5;
        animal1.peso = 10.5;

        System.out.println("Nombre: " + animal1.nombre);
        System.out.println("Edad: " + animal1.edad);
        System.out.println("Peso: " + animal1.peso);

        animal1.comer();
        animal1.dormir();

    }
}
