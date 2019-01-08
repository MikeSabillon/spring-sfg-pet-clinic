package sabillon.springframework5.sfgpetclinic.model;

import java.util.HashSet;
import java.util.Set;

/**
 * The type Owner.
 */
public class Owner extends Person {

    private String address;
    private String city;
    private String telephone;
    private Set<Pet> pets = new HashSet<>();

    /**
     * Gets address.
     *
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets address.
     *
     * @param address the address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Gets city.
     *
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets city.
     *
     * @param city the city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Gets telephone.
     *
     * @return the telephone
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * Sets telephone.
     *
     * @param telephone the telephone
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /**
     * Gets pets.
     *
     * @return the pets
     */
    public Set<Pet> getPets() {
        return pets;
    }

    /**
     * Sets pets.
     *
     * @param pets the pets
     */
    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }
}
