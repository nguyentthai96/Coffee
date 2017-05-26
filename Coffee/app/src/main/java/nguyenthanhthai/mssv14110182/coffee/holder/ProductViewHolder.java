package nguyenthanhthai.mssv14110182.coffee.holder;

import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import nguyenthanhthai.mssv14110182.coffee.R;
import nguyenthanhthai.mssv14110182.coffee.model.Product;
import nguyenthanhthai.mssv14110182.coffee.model.ProductType;

/**
 * Created by NguyenThanhThai on 4/4/2017.
 */

public class ProductViewHolder extends RecyclerView.ViewHolder {

    ImageView productImage;
    TextView productName;

    public ProductViewHolder(View itemView) {
        super(itemView);
        productImage = (ImageView) itemView.findViewById(R.id.product_image);
        productName = (TextView) itemView.findViewById(R.id.product_name);
    }

    public void setValueItemName(Product product){
        productName.setText(product.getName());
        Glide.with(productImage.getContext()). load(Uri.parse("file:///android_asset/"+product.getImage()+".png")).into(productImage);
    }

}
