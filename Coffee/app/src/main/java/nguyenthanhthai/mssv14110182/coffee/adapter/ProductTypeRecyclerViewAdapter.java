package nguyenthanhthai.mssv14110182.coffee.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import java.util.List;

import nguyenthanhthai.mssv14110182.coffee.R;
import nguyenthanhthai.mssv14110182.coffee.event.ProductTypeRecyclerViewListenner;
import nguyenthanhthai.mssv14110182.coffee.holder.ProductTypeViewHolder;
import nguyenthanhthai.mssv14110182.coffee.model.ProductType;

/**
 * Created by NguyenThanhThai on 4/4/2017.
 */

public class ProductTypeRecyclerViewAdapter extends RecyclerView.Adapter<ProductTypeViewHolder> {

    List<ProductType> productTypes;

    public ProductTypeRecyclerViewAdapter(List<ProductType> productTypes) {
        this.productTypes = productTypes;
    }

    @Override
    public ProductTypeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.product_type_item, parent, false);

        return new ProductTypeViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ProductTypeViewHolder holder, final int position) {
            holder.setValueItemName(productTypes.get(position));

        holder.getProductImage().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                productTypeRecyclerViewListenner.onClickProductType(productTypes.get(position));
            }
        });

        holder.getProductName().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                productTypeRecyclerViewListenner.onClickProductType(productTypes.get(position));
            }
        });
    }

    @Override
    public int getItemCount() {
        if(productTypes==null)
        {
            return 0;
        }
        return productTypes.size();
    }

    ProductTypeRecyclerViewListenner productTypeRecyclerViewListenner;
    public void setOnClickItem(ProductTypeRecyclerViewListenner productTypeRecyclerViewListenner){
        this.productTypeRecyclerViewListenner= productTypeRecyclerViewListenner;
    }
}
