package nguyenthanhthai.mssv14110182.coffee.holder;

import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import nguyenthanhthai.mssv14110182.coffee.R;
import nguyenthanhthai.mssv14110182.coffee.model.Product;

/**
 * Created by NguyenThanhThai on 4/4/2017.
 */

public class ProductAllSelectViewHolder extends RecyclerView.ViewHolder {

    ImageView productImage;
    TextView productName;
    Button order;

    public ProductAllSelectViewHolder(View itemView) {
        super(itemView);
        productImage = (ImageView) itemView.findViewById(R.id.product_image);
        productName = (TextView) itemView.findViewById(R.id.product_name);
        order= (Button) itemView.findViewById(R.id.order);
    }

    public void setValueItemName(Product product){
        productName.setText(product.getName());
        Glide.with(productImage.getContext()). load(Uri.parse("file:///android_asset/"+product.getImage()+".png")).into(productImage);
        order.setText(product.getPrice()+"//n"+product.getUnit());
    }

}
