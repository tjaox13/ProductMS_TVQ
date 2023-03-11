package Entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "Product")
public class Product {
    @Id
    private String productId;
    @Id
    private String manId;
    @Column
    private String productName;
    @Column
    private String description;
    @ManyToOne
    @JoinColumn(name="namId", nullable = false)
    private Manufacturer manufacturer;

    public Product() {
    }

    public Product(String productId, String manId, String productName, String description, Manufacturer manufacturer) {
        this.productId = productId;
        this.manId = manId;
        this.productName = productName;
        this.description = description;
        this.manufacturer = manufacturer;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getManId() {
        return manId;
    }

    public void setManId(String manId) {
        this.manId = manId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return Objects.equals(productId, product.productId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId);
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId='" + productId + '\'' +
                ", manId='" + manId + '\'' +
                ", productName='" + productName + '\'' +
                ", description='" + description + '\'' +
                ", manufacturer=" + manufacturer +
                '}';
    }
}
