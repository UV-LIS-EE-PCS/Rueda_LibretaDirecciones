package address.data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


    //Clase que contiene todas las direcciones de la libreta de direcciones
    // Creamos una lista de direcciones
public class AddressBook {
    private List<AddressEntry> addressEntryList = new ArrayList<>();
    private static AddressBook instance;

    private AddressBook() {}

    // Obtiene la instancia de AddressBook (patrón Singleton)
    // Retorna la instancia de AddressBook

    public static AddressBook getInstance() {
        if (instance == null) {
            instance = new AddressBook();
        }
        return instance;
    }


     // Obtiene la lista de entradas de direcciones
     // Retorna la lista de entradas de direcciones

    public List<AddressEntry> getAddressEntryList() {
        return addressEntryList;
    }


    // Lista todas las entradas ordenadas alfabéticamente por el primer nombre

    public void list() {
        addressEntryList.sort(Comparator.comparing(AddressEntry::getFirstName));
        for (AddressEntry entry : addressEntryList) {
            System.out.println(entry);
        }
    }


    // Elimina una entrada de dirección de la lista

    public void remove(AddressEntry addressEntry) {
        addressEntryList.remove(addressEntry);
    }


    // Añade una nueva entrada de dirección a la lista.

    public void add(AddressEntry addressEntry) {
        addressEntryList.add(addressEntry);
    }


    // Busca entradas de dirección que coincidan con el inicio del apellido dado

    public List<AddressEntry> find(String startOfLastName) {
        List<AddressEntry> foundEntries = new ArrayList<>();
        for (AddressEntry entry : addressEntryList) {
            if (entry.getLastName().startsWith(startOfLastName)) {
                foundEntries.add(entry);
            }
        }
        return foundEntries;
    }


     // Carga entradas de dirección desde un archivo

    public void loadFromFile(String fileName) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 8) {
                    AddressEntry entry = new AddressEntry(data[0], data[1], data[2], data[3], data[4], Integer.parseInt(data[5]), data[6], data[7]);
                    add(entry);
                }
            }
        }
    }
}
