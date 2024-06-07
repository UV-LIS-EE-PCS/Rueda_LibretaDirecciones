package address;

import address.data.AddressBook;
import address.data.AddressEntry;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


  // Clase de pruebas para Menu.

public class MenuTest {
    private Menu menu;
    private AddressBook addressBook;

    @BeforeEach
    public void setUp() {
        menu = new Menu();
        addressBook = AddressBook.getInstance();
        addressBook.getAddressEntryList().clear();  // Limpiar la lista antes de cada prueba
    }

    @Test
    public void testAddEntry() {
        String input = "John\nDoe\n123 Main St\nAnytown\nCA\n12345\n555-1234\njohn.doe@example.com\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        menu.addEntry(new Scanner(System.in));
        AddressEntry entry = addressBook.getAddressEntryList().get(0);

        assertEquals("John", entry.getFirstName());
        assertEquals("Doe", entry.getLastName());
    }

    @Test
    public void testRemoveEntry() {
        addressBook.add(new AddressEntry("John", "Doe", "123 Main St", "Anytown", "CA", 12345, "555-1234", "john.doe@example.com"));

        String input = "Doe\n1\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        menu.removeEntry(new Scanner(System.in));
        assertTrue(addressBook.getAddressEntryList().isEmpty());
    }

    @Test
    public void testFindEntry() {
        addressBook.add(new AddressEntry("John", "Doe", "123 Main St", "Anytown", "CA", 12345, "555-1234", "john.doe@example.com"));

        String input = "Doe\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        menu.findEntry(new Scanner(System.in));
        List<AddressEntry> foundEntries = addressBook.find("Doe");

        assertEquals(1, foundEntries.size());
        assertEquals("Doe", foundEntries.get(0).getLastName());
    }

    @Test
    public void testListEntries() {
        addressBook.add(new AddressEntry("John", "Doe", "123 Main St", "Anytown", "CA", 12345, "555-1234", "john.doe@example.com"));
        addressBook.add(new AddressEntry("Jane", "Smith", "456 Oak St", "Othertown", "NY", 67890, "555-5678", "jane.smith@example.com"));

        menu.listEntries();
        assertEquals(2, addressBook.getAddressEntryList().size());

        // Verificar que las entradas están ordenadas por el primer nombre
        assertEquals("Jane", addressBook.getAddressEntryList().get(0).getFirstName());
        assertEquals("John", addressBook.getAddressEntryList().get(1).getFirstName());
    }
}
