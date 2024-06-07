package address.data;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


    // Clase de pruebas para AddressBook.

public class AddressBookTest {
    private AddressBook addressBook;

    @BeforeEach
    public void setUp() {
        addressBook = AddressBook.getInstance();
        addressBook.getAddressEntryList().clear();
    }

    @Test
    public void testAddEntry() {
        AddressEntry entry = new AddressEntry("John", "Doe", "123 Main St", "Anytown", "CA", 12345, "555-1234", "john.doe@example.com");
        addressBook.add(entry);
        assertEquals(1, addressBook.getAddressEntryList().size());
        assertEquals("John", addressBook.getAddressEntryList().get(0).getFirstName());
    }

    @Test
    public void testRemoveEntry() {
        AddressEntry entry = new AddressEntry("John", "Doe", "123 Main St", "Anytown", "CA", 12345, "555-1234", "john.doe@example.com");
        addressBook.add(entry);
        addressBook.remove(entry);
        assertTrue(addressBook.getAddressEntryList().isEmpty());
    }

    @Test
    public void testFindEntry() {
        AddressEntry entry = new AddressEntry("John", "Doe", "123 Main St", "Anytown", "CA", 12345, "555-1234", "john.doe@example.com");
        addressBook.add(entry);
        List<AddressEntry> foundEntries = addressBook.find("Doe");
        assertEquals(1, foundEntries.size());
        assertEquals("Doe", foundEntries.get(0).getLastName());
    }

    @Test
    public void testLoadFromFile() throws IOException {
        String testFileName = "test_address_book.txt";
        try (PrintWriter writer = new PrintWriter(new FileWriter(testFileName))) {
            writer.println("John,Doe,123 Main St,Anytown,CA,12345,555-1234,john.doe@example.com");
            writer.println("Jane,Smith,456 Oak St,Othertown,NY,67890,555-5678,jane.smith@example.com");
        }

        addressBook.loadFromFile(testFileName);
        List<AddressEntry> entries = addressBook.getAddressEntryList();

        assertEquals(2, entries.size());
        assertEquals("John", entries.get(0).getFirstName());
        assertEquals("Jane", entries.get(1).getFirstName());

        // Eliminar el archivo de prueba
        new File(testFileName).delete();
    }
}
