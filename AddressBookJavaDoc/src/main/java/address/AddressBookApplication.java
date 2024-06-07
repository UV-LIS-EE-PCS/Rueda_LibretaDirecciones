package address;

import address.data.AddressBook;

/**
 * Clase principal del AddressBook.
 * Inicia la aplicación y muestra el menú.
 */
public class AddressBookApplication {
    /**
     * Método principal que inicia la aplicación.
     *
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        AddressBook addressBook = AddressBook.getInstance();
        Menu menu = new Menu();

        // Mostrar el menú e interactuar con el usuario
        menu.displayMenu();
    }
}
