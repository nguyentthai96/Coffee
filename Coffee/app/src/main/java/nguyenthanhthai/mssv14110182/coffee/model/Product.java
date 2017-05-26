package nguyenthanhthai.mssv14110182.coffee.model;

import com.orm.SugarRecord;

import java.util.List;

/**
 * Created by NguyenThanhThai on 5/26/2017.
 */

public class Product  extends SugarRecord{
    String name;
    String image;
    Double price;
    String unit;
    Long count;

    ProductType productType;
    public Product() {
    }

    public Product(String name, String image, Double price, String unit) {
        this.name = name;
        this.image = image;
        this.price = price;
        this.unit = unit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public static List<Product> selectAll() {
        return Product.listAll(Product.class);
    }
}
