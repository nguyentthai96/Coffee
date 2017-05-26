package nguyenthanhthai.mssv14110182.coffee;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.List;

import nguyenthanhthai.mssv14110182.coffee.adapter.ProductAllSelectRecyclerViewAdapter;
import nguyenthanhthai.mssv14110182.coffee.adapter.ProductRecyclerViewAdapter;
import nguyenthanhthai.mssv14110182.coffee.holder.RecyclerViewHeader;
import nguyenthanhthai.mssv14110182.coffee.model.Product;
import nguyenthanhthai.mssv14110182.coffee.model.ProductType;

public class ProductSelectActivity extends AppCompatActivity {


    private List<Product> products;
    private RecyclerView recyclerViewProduct;
    private ProductAllSelectRecyclerViewAdapter mAdapterProduct;

    Long productTypeId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_select);

        addControls();
    }

    private void addControls() {
        recyclerViewProduct = (RecyclerView) findViewById(R.id.recyclerviewproduct);
        Intent intent=getIntent();
        productTypeId= intent.getLongExtra("ProductTypeId", 0);
        products=Product.selectFilter(productTypeId);
        mAdapterProduct = new ProductAllSelectRecyclerViewAdapter(products);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this);
        recyclerViewProduct.setLayoutManager(mLayoutManager);
        recyclerViewProduct.setItemAnimator(new DefaultItemAnimator());
        recyclerViewProduct.setAdapter(mAdapterProduct);
        RecyclerViewHeader recyclerViewHeader = (RecyclerViewHeader) findViewById(R.id.header);
        recyclerViewHeader.attachToRecyclerView(recyclerViewProduct);
    }
}
