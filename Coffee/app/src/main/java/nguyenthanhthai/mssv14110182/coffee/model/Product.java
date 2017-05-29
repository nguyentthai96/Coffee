package nguyenthanhthai.mssv14110182.coffee.model;

import com.orm.SugarRecord;

import java.util.List;
import java.util.concurrent.locks.Condition;

/**
 * Created by NguyenThanhThai on 5/26/2017.
 */

public class Product extends SugarRecord {
    String name;
    String image;
    Double price;
    String unit;
    Long count;

    ProductType productType;

    public Product() {
    }

    public Product(String name, String image, Double price, String unit, ProductType productType) {
        this.name = name;
        this.image = image;
        this.price = price;
        this.unit = unit;
        this.productType = productType;
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

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public static List<Product> selectAll() {
        return Product.listAll(Product.class);
    }

    public static List<Product> selectFilter(final Long productTypeId) {
        return Product.find(Product.class, "PRODUCT_TYPE=?", productTypeId.toString());
    }
}
