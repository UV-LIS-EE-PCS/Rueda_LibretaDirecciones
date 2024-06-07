package address.data;


 // Esta clase solo trata de una entrada a la vez

public class AddressEntry {
    private String firstName;
    private String lastName;
    private String street;
    private String city;
    private String state;
    private int zip;
    private String phone;
    private String email;


    // El constructor inicializa una entrada de dirección con los datos proporcionados

    public AddressEntry(String firstName, String lastName, String street, String city, String state, int zip, String phone, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
        this.email = email;
    }

    // Métodos getters y setters para cada campo

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    // Devuelve una cadena de la entrada de dirección
    // Contiene toda la información de contacto

    @Override
    public String toString() {
        return firstName + " " + lastName + "\n" +
                street + "\n" +
                city + ", " + state + " " + zip + "\n" +
                phone + "\n" +
                email + "\n";
    }
}
