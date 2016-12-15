import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by Verőci Ádám on 2016.12.14..
 */
@DatabaseTable(tableName = "address")
public class Address {
    @DatabaseField
    private String street;
    @DatabaseField
    private String city;
    @DatabaseField
    private String postcode;
    @DatabaseField
    private String country;
    @DatabaseField(generatedId = true)
    private int foreignId;

    public Address(){
    }

    public Address(String street, String city, String postcode, String country) {
        this.street = street;
        this.city = city;
        this.postcode = postcode;
        this.country = country;
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

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getForeignId() {
        return foreignId;
    }

    public void setForeignId(int foreignId) {
        this.foreignId = foreignId;
    }

    @Override
    public String toString() {
        return "{" + '\n' +
                "postcode = " + postcode + '\n' +
                "city = " + city + '\n' +
                "country = " + country + '\n' +
                "street = " + street + '\n' +
                "}";

    }
}
