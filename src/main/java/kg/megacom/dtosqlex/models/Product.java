package kg.megacom.dtosqlex.models;

import kg.megacom.dtosqlex.enums.ProductType;
import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

@Data
@Entity
public class Product {

    @Id
    private String model;
    private String maker;
    @Enumerated(EnumType.STRING)
    private ProductType type;

    public Product() {
    }

    public Product(String model, String maker, ProductType type) {
        this.model = model;
        this.maker = maker;
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public ProductType getType() {
        return type;
    }

    public void setType(ProductType type) {
        this.type = type;
    }
}
