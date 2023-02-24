package fr.epsi.b3.bo;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "number", nullable = false)
    private String number;

    @Column(name = "street", nullable = false)
    private String street;

    @Column(name = "zipcode", nullable = false)
    private String zipcode;

    @Column(name = "city", nullable = false)
    private String city;


    @OneToOne
    private Petstore petstore;

    public Address() {

    }

    public Address(String number, String street, String zipcode, String city) {
        this.number = number;
        this.street = street;
        this.zipcode = zipcode;
        this.city = city;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Petstore getPetstore() {
        return petstore;
    }

    public void setPetstore(Petstore petstore) {
        this.petstore = petstore;
    }
}
