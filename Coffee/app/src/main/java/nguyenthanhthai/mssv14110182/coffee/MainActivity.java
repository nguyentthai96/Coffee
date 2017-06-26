package nguyenthanhthai.mssv14110182.coffee;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import nguyenthanhthai.mssv14110182.coffee.model.Product;
import nguyenthanhthai.mssv14110182.coffee.model.ProductType;
import nguyenthanhthai.mssv14110182.coffee.model.TableCafe;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TableCafe.listAll(TableCafe.class);
        ProductType.listAll(ProductType.class);
        Product.listAll(Product.class);
        //Insert initial data
        TableCafe.insertDataInit();
        ProductType.insertDataInit();
        Intent intent = new Intent(this, TableActivity.class);
        startActivity(intent);
    }

}
