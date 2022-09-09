import java.util.ArrayList;
import java.util.Scanner;

public class Animals {

    private String animalName;
    private int animalBirthdate;
    private boolean male;

    public Animals() {
    }

    public String getAnimalName() {
        return this.animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public int getAnimalBirthdate() {
        return this.animalBirthdate;
    }

    public void setAnimalBirthdate(int animalBirthdate) {
        this.animalBirthdate = animalBirthdate;
    }

    public boolean getMale() {
        return this.male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }

//    public static void menu() {
//        System.out.println("Pasirinkite is meniu, ka norite padaryti:");
//        System.out.println(" Iveskite 1, jei norite atspausdinti gyvunu sarasa.");
//        System.out.println(" Iveskite 2, jei norite prideti papildoma gyvuna prie saraso.");
//        System.out.println(" Iveskite 3, jei norite isimti gyvuna is saraso.");
//        System.out.println(" Iveskite 4, jei norite pakeisti gyvuna sarase.");
//        System.out.println(" Iveskite 5, jei norite baigti darba. ");
//    }

    public static void animalsList(ArrayList<Animals> arr) {
        System.out.println("Gyvunu sarasas:");
        for (int i = 0; i < arr.size(); i++) {
            System.out.println((i + 1) + " " + arr.get(i));
        }
    }

    public static void addAnimal(Scanner sc, ArrayList<Animals> arr) {
        Animals newAnimal = new Animals();
        System.out.println("Parasykite gyvuno, kuri norite itraukti i sarasa, varda.");
        newAnimal.setAnimalName(sc.nextLine());
        System.out.println("Parasykite gyvuno, kuri norite itraukti i sarasa, gimimo metus.");
        newAnimal.setAnimalBirthdate(sc.nextInt());
        sc.nextLine();
        System.out.println("Nurodykite gyvuno lyti, parasydami 'true', jei vyriska arba 'false', jei moteriska");
        newAnimal.setMale(sc.nextBoolean());
        System.out.println("Jus itraukete i sarasa gyvuna : " + newAnimal);
        arr.add(newAnimal);
    }

    public static void removeAnimal(Scanner sc, ArrayList<Animals> arr) {
        System.out.println("Nurodykite gyvuno numeri, kuri norite isimti is sio saraso.");
        animalsList(arr);
        try {
            int numAnimal = sc.nextInt();
            sc.nextLine();
            while (numAnimal > 0 && numAnimal <= arr.size()) {
                System.out.println("Jus pasalinote gyvuna " + numAnimal + " " + arr.get(numAnimal - 1));
                arr.remove(numAnimal - 1);
            }
            System.out.println("ne tas skaicius");

        }
        catch (Exception e) {
            System.out.println("ivedete ne skaiciu");
        }

    }

    public static void changeAnimal(Scanner sc, ArrayList<Animals> arr) {
        System.out.println("Nurodykite gyvuno numeri, kuri norite pakeisti.");
        animalsList(arr);
        int num = sc.nextInt();
        sc.nextLine();
        System.out.println("Jus norite pakeisti " + num + " gyvuna " + arr.get(num - 1));
        System.out.println("Parasykite naujo gyvuno varda.");
        String newName = sc.nextLine();
        arr.get(num-1).setAnimalName(newName);
        System.out.println("Parasykite naujo gyvuno gimimo metus.");
        arr.get(num-1).setAnimalBirthdate(sc.nextInt());
        sc.nextLine();
        System.out.println("Nurodykite gyvuno lyti, parasydami 'true', jei vyriska arba 'false', jei moteriska");
        arr.get(num-1).setMale(sc.nextBoolean());
        System.out.println("Pakeistas saraso gyvunas: " + arr.get(num-1));

    }

    public static int checkOption(Scanner sc) {
        int opt = 0;
        try {
            opt = sc.nextInt();
        } catch (Exception e) {
        }
        return opt;
    }


    @Override
    public String toString() {
        return " Name is: " + animalName + " , Birth date is: " + animalBirthdate + ", Gender is: " + ((male) ? "Male" : "Female");
    }

}