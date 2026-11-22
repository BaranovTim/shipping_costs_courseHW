import java.util.Objects;

public class Address {
    public String country;
    public String city;

    public Address(String country, String city) {
        this.country = country;
        this.city = city;
    }
    @Override
    public int hashCode() {
        return Objects.hash(country, city);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Address o)) return false;

        return country.equals(o.country) &&
            city.equals(o.city);
    }
}
