package nguyenthanhthai.mssv14110182.coffee.model;

import com.orm.SugarRecord;
import com.orm.dsl.Ignore;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by NguyenThanhThai on 5/26/2017.
 */

public class ProductType extends SugarRecord {

    String nameProductType;
    String image;

    public ProductType() {
    }

    public ProductType(String nameProductType, String image) {
        this.nameProductType = nameProductType;
        this.image = image;
    }

    public String getNameProductType() {
        return nameProductType;
    }

    public void setNameProductType(String nameProductType) {
        this.nameProductType = nameProductType;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }


    public static List<ProductType> getAll() {
        return ProductType.listAll(ProductType.class);
    }

    public static void insertDataInit() {
        try {
            Product.deleteAll(Product.class);
            ProductType.deleteAll(ProductType.class);
        } catch (Exception e) {

        }
        ProductType productType = new ProductType("Cafe", "cafe");
        productType.save();
        Product product = new Product("Cafe hạt1", "cafe", 12D, "Ly",productType);
        product.save();
        product = new Product("Cafe hạt2", "cafe", 12D, "Ly",productType);
        product.save();

        productType = new ProductType("sinh tố", "sinhto");
        productType.save();
        product = new Product("Cafe hạt3", "cafe", 12D, "Ly",productType);
        product.save();
        product = new Product("Cafe hạt4", "cafe", 12D, "Ly",productType);
        product.save();

        productType = new ProductType("trà sữa", "trasua");
        productType.save();
        product = new Product("Cafe hạt5", "cafe", 12D, "Ly",productType);
        product.save();
        product = new Product("Cafe hạt6", "cafe", 12D, "Ly",productType);
        product.save();

        productType = new ProductType("nước ép", "nuocep");
        productType.save();
        product = new Product("Cafe hạt7", "cafe", 12D, "Ly",productType);
        product.save();
        product = new Product("Cafe hạt8", "cafe", 12D, "Ly",productType);
        product.save();
    }
}
