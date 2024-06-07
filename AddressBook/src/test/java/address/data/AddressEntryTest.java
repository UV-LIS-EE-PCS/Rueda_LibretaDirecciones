package address.data;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


 // Clase de pruebas para AddressEntry.

public class AddressEntryTest {

    @Test
    public void testAddressEntry() {
        AddressEntry entry = new AddressEntry("John", "Doe", "123 Main St", "Anytown", "CA", 12345, "555-1234", "john.doe@example.com");

        assertEquals("John", entry.getFirstName());
        assertEquals("Doe", entry.getLastName());
        assertEquals("123 Main St", entry.getStreet());
        assertEquals("Anytown", entry.getCity());
        assertEquals("CA", entry.getState());
        assertEquals(12345, entry.getZip());
        assertEquals("555-1234", entry.getPhone());
        assertEquals("john.doe@example.com", entry.getEmail());
    }

    @Test
    public void testToString() {
        AddressEntry entry = new AddressEntry("John", "Doe", "123 Main St", "Anytown", "CA", 12345, "555-1234", "john.doe@example.com");
        String expected = "John Doe\n123 Main St\nAnytown, CA 12345\n555-1234\njohn.doe@example.com\n";
        assertEquals(expected, entry.toString());
    }
}
