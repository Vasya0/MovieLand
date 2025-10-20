package Version1.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;


@Entity
@Table(name = "COUNTRIES")

public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int countryID;

    private String name;


    @ManyToMany(mappedBy = "countries")
    @JsonIgnore
    private List<Movie> movies;

public Country(){

}
    public Country(String name) {

        this.name = name;
    }
    public Country(int countryID, String name) {
        this.countryID = countryID;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Country{" +
                "countryID=" + countryID +
                ", name='" + name + '\'' +
                '}';
    }

    public int getCountryID() {
        return countryID;
    }

    public String getName() {
        return name;
    }

    public void setCountryID(int countryID) {
        this.countryID = countryID;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Country)) return false;
        Country c = (Country) o;
        return Objects.equals(name, c.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

