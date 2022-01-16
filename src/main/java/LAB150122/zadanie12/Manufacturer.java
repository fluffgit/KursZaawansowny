package LAB150122.zadanie12;

import java.util.Date;
import java.util.Objects;

public class Manufacturer {

    private String name;
    private Date productionYear;
    private String country;

    public Manufacturer(String name, Date productionYear, String country) {
        this.name = name;
        this.productionYear = productionYear;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(Date productionYear) {
        this.productionYear = productionYear;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o instanceof Manufacturer) {
            Manufacturer manu = (Manufacturer) o;
            return Objects.equals(name, manu.name) && Objects.equals(productionYear, manu.productionYear) && Objects.equals(country, manu.country);
        }else{
            return false;
        }

    }

    @Override
    public int hashCode() {
        return Objects.hash(name, productionYear, country);
    }
}
