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
import nguyenthanhthai.mssv14110182.coffee.model.ProductType;

/**
 * Created by NguyenThanhThai on 4/4/2017.
 */

public class ProductViewHolder extends RecyclerView.ViewHolder {

    ImageView productImage;
    TextView productName;
    TextView count;
    TextView unit;
    TextView add;
    TextView sub;
    Button remove;

    public ProductViewHolder(View itemView) {
        super(itemView);
        productImage = (ImageView) itemView.findViewById(R.id.product_image);
        productName = (TextView) itemView.findViewById(R.id.product_name);

        count = (TextView) itemView.findViewById(R.id.count);
        unit = (TextView) itemView.findViewById(R.id.unit);
        add = (TextView) itemView.findViewById(R.id.add);
        sub = (TextView) itemView.findViewById(R.id.sub);
        remove= (Button) itemView.findViewById(R.id.remove);
    }

    public void setValueItemName(Product product){
        productName.setText(product.getName());
        Glide.with(productImage.getContext()). load(Uri.parse("file:///android_asset/"+product.getImage()+".png")).into(productImage);
        count.setText((product.getCount()==null)?"0":product.getCount().toString());

        unit.setText(" /"+product.getUnit());
    }

    public Button getRemove() {
        return remove;
    }

    public TextView getAdd() {
        return add;
    }

    public TextView getSub() {
        return sub;
    }

    public TextView getCount() {
        return count;
    }
}
