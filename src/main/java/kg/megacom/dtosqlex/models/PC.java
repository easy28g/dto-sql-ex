package kg.megacom.dtosqlex.models;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
@Entity
public class PC {

    @Id
    private Long code;
    @ManyToOne
    @JoinColumn(name = "model")
    private Product product;
    private int speed;
    private int ram;
    private double hd;
    private String cd;
    private double price;

    public PC() {
    }

    public PC(Long code, Product product, int speed, int ram, double hd, String cd, double price) {
        this.code = code;
        this.product = product;
        this.speed = speed;
        this.ram = ram;
        this.hd = hd;
        this.cd = cd;
        this.price = price;
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public double getHd() {
        return hd;
    }

    public void setHd(double hd) {
        this.hd = hd;
    }

    public String getCd() {
        return cd;
    }

    public void setCd(String cd) {
        this.cd = cd;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
