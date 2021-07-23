package kg.megacom.dtosqlex.models.dto;

import kg.megacom.dtosqlex.enums.ProductType;


public class ProductDto {

    private String model;
    private String maker;
    private ProductType type;

    public ProductDto() {
    }

    public ProductDto(String model, String maker, ProductType type) {
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
