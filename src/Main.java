import java.util.Scanner;
import java.util.ArrayList;



public class Main {
    public static void main(String[] args) {

        // nepilnai sudetos apsaugos

        System.out.println();
        System.out.println("Sveiki atvyke i virtualu Zoologijos soda !");
        System.out.println();

        Scanner sc = new Scanner(System.in);

        Animals tiger = new Animals();
        tiger.setAnimalName("Tiger");
        tiger.setAnimalBirthdate(2010);
        tiger.setMale(true);

        Animals lion = new Animals();
        lion.setAnimalName("Lion");
        lion.setAnimalBirthdate(2015);
        lion.setMale(false);

        Animals wolf = new Animals();
        wolf.setAnimalName("Wolf");
        wolf.setAnimalBirthdate(2020);
        wolf.setMale(true);

        Animals fox = new Animals();
        fox.setAnimalName("Fox");
        fox.setAnimalBirthdate(2021);
        fox.setMale(false);


        ArrayList<Animals> animals = new ArrayList<Animals>();
        animals.add(tiger);
        animals.add(lion);
        animals.add(wolf);
        animals.add(fox);


        boolean shouldContinue = true;
        menu();

        while (shouldContinue) {
            int input = Animals.checkOption(sc);
            sc.nextLine();

            switch (input) {

                case 5:
                    System.out.println("Aciu, kad apsilankete. Lauksime sugriztant.");
                    shouldContinue = false;
                    break;
                case 1:
                    Animals.animalsList(animals);
                    System.out.println();
                    menu();
                    break;
                case 2:
                    Animals.addAnimal(sc, animals);
                    System.out.println();
                    menu();
                    break;
                case 3:
                    Animals.removeAnimal(sc, animals);
                    System.out.println();
                    menu();
                    break;
                case 4:
                    Animals.changeAnimal(sc, animals);
                    System.out.println();
                    menu();
                    break;
                default:
                    System.out.println("Neteisingai ivedete pasirinkima, bandykite is naujo.");
                    System.out.println();
                    menu();


            }
        }

    }

    public static void menu() {
        System.out.println("Pasirinkite is meniu, ka norite padaryti:");
        System.out.println(" Iveskite 1, jei norite atspausdinti gyvunu sarasa.");
        System.out.println(" Iveskite 2, jei norite prideti papildoma gyvuna prie saraso.");
        System.out.println(" Iveskite 3, jei norite isimti gyvuna is saraso.");
        System.out.println(" Iveskite 4, jei norite pakeisti gyvuna sarase.");
        System.out.println(" Iveskite 5, jei norite baigti darba. ");
    }


}