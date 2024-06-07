package address;
import address.data.AddressBook;

 //Clase principal del AddressBooka
 //Inicia la aplicación y muestra el menú

public class AddressBookApplication {
    public static void main(String[] args) {
        AddressBook addressBook = AddressBook.getInstance();
        Menu menu = new Menu();

        // Mostrar el menú e interactuar con el usuario
        menu.displayMenu();
    }
}
