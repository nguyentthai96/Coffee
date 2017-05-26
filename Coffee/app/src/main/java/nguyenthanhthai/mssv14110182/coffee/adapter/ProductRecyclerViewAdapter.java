package nguyenthanhthai.mssv14110182.coffee.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import nguyenthanhthai.mssv14110182.coffee.R;
import nguyenthanhthai.mssv14110182.coffee.holder.ProductTypeViewHolder;
import nguyenthanhthai.mssv14110182.coffee.holder.ProductViewHolder;
import nguyenthanhthai.mssv14110182.coffee.model.Product;
import nguyenthanhthai.mssv14110182.coffee.model.ProductType;

/**
 * Created by NguyenThanhThai on 4/4/2017.
 */

public class ProductRecyclerViewAdapter extends RecyclerView.Adapter<ProductViewHolder> {

    List<Product> products;

    public ProductRecyclerViewAdapter(List<Product > products) {
        this.products = products;
    }

    @Override
    public ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.product_type_item, parent, false);

        return new ProductViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ProductViewHolder holder, int position) {
            holder.setValueItemName(products.get(position));

    }

    @Override
    public int getItemCount() {
        if(products==null)
        {
            return 0;
        }
        return products.size();
    }
}
