package examples.hashCodeAndEquals;

public class Address {

    private String street;
    private String houseNumber; //12A
    private String flat;//193a
    private String zipCode;
    private String city;

    public Address(String street,
                   String houseNumber,
                   String flat,
                   String zipCode,
                   String city) {
        this.street = street;
        this.houseNumber = houseNumber;
        this.flat = flat;
        this.zipCode = zipCode;
        this.city = city;
    }
}
