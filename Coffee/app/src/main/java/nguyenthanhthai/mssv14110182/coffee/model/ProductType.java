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
    List<Product> products;

    public ProductType() {
    }

    public ProductType(String nameProductType, String image, List<Product> products) {
        this.nameProductType = nameProductType;
        this.image = image;
        this.products = products;
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
        List<Product> products = new ArrayList<>();
        Product product = new Product("Cafe hạt", "cafe", 12D, "Ly");
        product.save();
        products.add(product);
        product = new Product("Cafe hạt", "cafe", 12D, "Ly");
        product.save();
        products.add(product);
        product = new Product("Cafe hạt", "cafe", 12D, "Ly");
        product.save();
        products.add(product);
        ProductType productType = new ProductType("Cafe", "cafe", products);
        productType.save();

        products = new ArrayList<>();
        product = new Product("Cafe hạt", "cafe", 12D, "Ly");
        product.save();
        products.add(product);
        product = new Product("Cafe hạt", "cafe", 12D, "Ly");
        product.save();
        products.add(product);
        product = new Product("Cafe hạt", "cafe", 12D, "Ly");
        product.save();
        products.add(product);
        productType = new ProductType("sinh tố", "sinhto", products);
        productType.save();

        products = new ArrayList<>();
        product = new Product("Cafe hạt", "cafe", 12D, "Ly");
        product.save();
        products.add(product);
        product = new Product("Cafe hạt", "cafe", 12D, "Ly");
        product.save();
        products.add(product);
        product = new Product("Cafe hạt", "cafe", 12D, "Ly");
        product.save();
        products.add(product);
        productType = new ProductType("trà sữa", "trasua", products);
        productType.save();

        products = new ArrayList<>();
        product = new Product("Cafe hạt", "cafe", 12D, "Ly");
        product.save();
        products.add(product);
        product = new Product("Cafe hạt", "cafe", 12D, "Ly");
        product.save();
        products.add(product);
        product = new Product("Cafe hạt", "cafe", 12D, "Ly");
        product.save();
        products.add(product);
        productType = new ProductType("nước ép", "nuocep", products);
        productType.save();
    }
}
