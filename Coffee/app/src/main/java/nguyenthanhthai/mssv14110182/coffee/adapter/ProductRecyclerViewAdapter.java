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

    public ProductRecyclerViewAdapter(List<Product> products) {
        this.products = products;
    }

    @Override
    public ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.product_item, parent, false);

        return new ProductViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final ProductViewHolder holder, final int position) {
        holder.setValueItemName(products.get(position));

        holder.getRemove().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                products.remove(position);
                notifyItemRemoved(position);
                notifyItemRangeChanged(position, products.size());
            }
        });

        holder.getAdd().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                products.get(position).setCount((products.get(position).getCount()==null)?1:products.get(position).getCount()+1);
                holder.getCount().setText(products.get(position).getCount().toString());
            }
        });

        holder.getSub().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                products.get(position).setCount((products.get(position).getCount()==null)?1:products.get(position).getCount()-1);
                holder.getCount().setText(products.get(position).getCount().toString());
            }
        });
    }

    @Override
    public int getItemCount() {
        if (products == null) {
            return 0;
        }
        return products.size();
    }
}
