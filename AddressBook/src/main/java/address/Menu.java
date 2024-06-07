package address;

import address.data.AddressBook;
import address.data.AddressEntry;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;


    // Clase que maneja el menú de la aplicación y las interacciones con el usuario

public class Menu {
    private final AddressBook addressBook;


     // Constructor que inicializa la libreta de direcciones

    public Menu() {
        this.addressBook = AddressBook.getInstance();
    }


    // Muestra el menú principal y  las opciones seleccionadas por el usuario

    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("a) Load entries from a file");
            System.out.println("b) Add a new address entry");
            System.out.println("c) Remove an address entry");
            System.out.println("d) Search for entries");
            System.out.println("e) Display all entries");
            System.out.println("f) Quit");

            String choice = scanner.nextLine();

            switch (choice) {
                case "a":
                    loadEntries(scanner);
                    break;
                case "b":
                    addEntry(scanner);
                    break;
                case "c":
                    removeEntry(scanner);
                    break;
                case "d":
                    findEntry(scanner);
                    break;
                case "e":
                    listEntries();
                    break;
                case "f":
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice, Please try again."); // Si la opcion no existe muestra este mensaje de error
            }
        }
        scanner.close();
    }


    // Carga entradas desde un archivo dado por el usuario
    // Se usa el objeto Scanner para leer la entrada del usuario

    private void loadEntries(Scanner scanner) {
        System.out.println("Enter the filename:");
        String fileName = scanner.nextLine();
        try {
            String resourcePath = "src/main/resources/" + fileName;  // Ajusta la ruta según sea necesario, se debe escribir: AddressBook.txt
            addressBook.loadFromFile(resourcePath);
            System.out.println("Entries loaded from file.");
        } catch (IOException e) {
            System.out.println("Error loading entries from file: " + e.getMessage());
        }
    }


     // Añade una nueva entrada de dirección solicitando información al usuario

    public void addEntry(Scanner scanner) {
        System.out.println("Enter first name:");
        String firstName = scanner.nextLine();
        System.out.println("Enter last name:");
        String lastName = scanner.nextLine();
        System.out.println("Enter street:");
        String street = scanner.nextLine();
        System.out.println("Enter city:");
        String city = scanner.nextLine();
        System.out.println("Enter state:");
        String state = scanner.nextLine();
        System.out.println("Enter zip:");
        int zip = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter phone:");
        String phone = scanner.nextLine();
        System.out.println("Enter email:");
        String email = scanner.nextLine();

        AddressEntry entry = new AddressEntry(firstName, lastName, street, city, state, zip, phone, email);
        addressBook.add(entry);
    }


    // Elimina una entrada de dirección solicitando al usuario el inicio del apellido

    public void removeEntry(Scanner scanner) {
        System.out.println("Enter the start of last name to remove:");
        String removeStartOfLastName = scanner.nextLine();
        List<AddressEntry> entriesToRemove = addressBook.find(removeStartOfLastName);

        if (entriesToRemove.isEmpty()) {
            System.out.println("No entries found.");
        } else {
            for (int i = 0; i < entriesToRemove.size(); i++) {
                System.out.println((i + 1) + ": " + entriesToRemove.get(i));
            }

            System.out.println("Enter the number of the entry to remove:");
            int entryNumber = Integer.parseInt(scanner.nextLine()) - 1;

            if (entryNumber >= 0 && entryNumber < entriesToRemove.size()) {
                addressBook.remove(entriesToRemove.get(entryNumber));
                System.out.println("Entry removed.");
            } else {
                System.out.println("Invalid selection.");
            }
        }
    }


     // Busca entradas solicitando al usuario el inicio del apellido

    public void findEntry(Scanner scanner) {
        System.out.println("Enter the start of last name to find:");
        String findStartOfLastName = scanner.nextLine();
        List<AddressEntry> foundEntries = addressBook.find(findStartOfLastName);

        if (foundEntries.isEmpty()) {
            System.out.println("No entries found.");
        } else {
            foundEntries.forEach(System.out::println);
        }
    }


    // Lista todas las entradas ordenadas alfabéticamente por el primer nombre.

    public void listEntries() {
        addressBook.list();
    }
}
