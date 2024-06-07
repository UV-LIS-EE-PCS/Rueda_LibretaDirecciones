package address.data;

/**
 * Clase que representa una entrada de dirección en la libreta de direcciones.
 */
public class AddressEntry {
    private String firstName;
    private String lastName;
    private String street;
    private String city;
    private String state;
    private int zip;
    private String phone;
    private String email;

    /**
     * Constructor que inicializa una entrada de dirección con los datos proporcionados.
     *
     * @param firstName El primer nombre.
     * @param lastName El apellido.
     * @param street La calle.
     * @param city La ciudad.
     * @param state El estado.
     * @param zip El código postal.
     * @param phone El número de teléfono.
     * @param email El correo electrónico.
     */
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

    /**
     * Retorna el primer nombre.
     *
     * @return El primer nombre.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Establece el primer nombre.
     *
     * @param firstName El primer nombre.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Retorna el apellido.
     *
     * @return El apellido.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Establece el apellido.
     *
     * @param lastName El apellido.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Retorna la calle.
     *
     * @return La calle.
     */
    public String getStreet() {
        return street;
    }

    /**
     * Establece la calle.
     *
     * @param street La calle.
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * Retorna la ciudad.
     *
     * @return La ciudad.
     */
    public String getCity() {
        return city;
    }

    /**
     * Establece la ciudad.
     *
     * @param city La ciudad.
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Retorna el estado.
     *
     * @return El estado.
     */
    public String getState() {
        return state;
    }

    /**
     * Establece el estado.
     *
     * @param state El estado.
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * Retorna el código postal.
     *
     * @return El código postal.
     */
    public int getZip() {
        return zip;
    }

    /**
     * Establece el código postal.
     *
     * @param zip El código postal.
     */
    public void setZip(int zip) {
        this.zip = zip;
    }

    /**
     * Retorna el número de teléfono.
     *
     * @return El número de teléfono.
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Establece el número de teléfono.
     *
     * @param phone El número de teléfono.
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Retorna el correo electrónico.
     *
     * @return El correo electrónico.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Establece el correo electrónico.
     *
     * @param email El correo electrónico.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Devuelve una cadena que representa la entrada de dirección con toda la información de contacto.
     *
     * @return Una cadena que representa la entrada de dirección.
     */
    @Override
    public String toString() {
        return firstName + " " + lastName + "\n" +
                street + "\n" +
                city + ", " + state + " " + zip + "\n" +
                phone + "\n" +
                email + "\n";
    }
}
