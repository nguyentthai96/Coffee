package nguyenthanhthai.mssv14110182.coffee;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.List;

import nguyenthanhthai.mssv14110182.coffee.adapter.ProductRecyclerViewAdapter;
import nguyenthanhthai.mssv14110182.coffee.adapter.ProductTypeRecyclerViewAdapter;
import nguyenthanhthai.mssv14110182.coffee.event.ProductTypeRecyclerViewListenner;
import nguyenthanhthai.mssv14110182.coffee.holder.RecyclerViewHeader;
import nguyenthanhthai.mssv14110182.coffee.model.Product;
import nguyenthanhthai.mssv14110182.coffee.model.ProductType;
import nguyenthanhthai.mssv14110182.coffee.model.TableCafe;

public class TableActivity extends AppCompatActivity {

    private List<Product> products;
    private RecyclerView recyclerViewProduct;
    private ProductRecyclerViewAdapter mAdapterProduct;

    ProductTypeRecyclerViewAdapter mAdapterHeader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);

        addControls();

        addEvents();
    }

    private void addControls() {

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        spinner.setAdapter(new ArrayAdapter<TableCafe>(this, android.R.layout.simple_spinner_item, TableCafe.selectAll()));

        //Type Product
        RecyclerView recyclerViewProductType = (RecyclerView)findViewById(R.id.recyclerviewtype);
        recyclerViewProductType.setLayoutManager(new GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false));
        recyclerViewProductType.setItemAnimator(new DefaultItemAnimator());
        mAdapterHeader = new ProductTypeRecyclerViewAdapter(ProductType.getAll());
        recyclerViewProductType.setAdapter(mAdapterHeader);



        recyclerViewProduct = (RecyclerView) findViewById(R.id.recyclerviewproduct);
        products=Product.selectAll();
        mAdapterProduct = new ProductRecyclerViewAdapter(products);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this);
        recyclerViewProduct.setLayoutManager(mLayoutManager);
        recyclerViewProduct.setItemAnimator(new DefaultItemAnimator());
        recyclerViewProduct.setAdapter(mAdapterProduct);
        RecyclerViewHeader recyclerViewHeader = (RecyclerViewHeader) findViewById(R.id.header);
        recyclerViewHeader.attachToRecyclerView(recyclerViewProduct);
        if (products!=null){
            if (products.size()>0){
                recyclerViewProduct.setVisibility(View.VISIBLE);
            }
        }
    }

    private void addEvents() {
        mAdapterHeader.setOnClickItem(new ProductTypeRecyclerViewListenner() {
            @Override
            public void onClickProductType(ProductType productType) {
                Intent intent=new Intent(TableActivity.this,ProductSelectActivity.class);
                intent.putExtra("ProductTypeId",productType.getId());
                startActivity(intent);
            }
        });
    }
}
