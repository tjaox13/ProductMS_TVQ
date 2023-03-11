package Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class Manufacturer {
    @Id
    private String manId;
    @Column
    private String manName;
    @Column
    private String manContactName;
    @Column
    private String manContactEmail;
    @Column
    private String manContactPhone;
    @Column
    private String manWebsite;

    @OneToMany(mappedBy = "product")
    private Set<Product> products;
    public Manufacturer() {
    }

    public Manufacturer(String manId, String manName, String manContactName, String manContactEmail, String manContactPhone, String manWebsite) {
        this.manId = manId;
        this.manName = manName;
        this.manContactName = manContactName;
        this.manContactEmail = manContactEmail;
        this.manContactPhone = manContactPhone;
        this.manWebsite = manWebsite;
    }

    public String getManId() {
        return manId;
    }

    public void setManId(String manId) {
        this.manId = manId;
    }

    public String getManName() {
        return manName;
    }

    public void setManName(String manName) {
        this.manName = manName;
    }

    public String getManContactName() {
        return manContactName;
    }

    public void setManContactName(String manContactName) {
        this.manContactName = manContactName;
    }

    public String getManContactEmail() {
        return manContactEmail;
    }

    public void setManContactEmail(String manContactEmail) {
        this.manContactEmail = manContactEmail;
    }

    public String getManContactPhone() {
        return manContactPhone;
    }

    public void setManContactPhone(String manContactPhone) {
        this.manContactPhone = manContactPhone;
    }

    public String getManWebsite() {
        return manWebsite;
    }

    public void setManWebsite(String manWebsite) {
        this.manWebsite = manWebsite;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Manufacturer)) return false;
        Manufacturer that = (Manufacturer) o;
        return manId.equals(that.manId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manId);
    }

    @Override
    public String toString() {
        return "Manufacturer{" +
                "manId='" + manId + '\'' +
                ", manName='" + manName + '\'' +
                ", manContactName='" + manContactName + '\'' +
                ", manContactEmail='" + manContactEmail + '\'' +
                ", manContactPhone='" + manContactPhone + '\'' +
                ", manWebsite='" + manWebsite + '\'' +
                '}';
    }
}
