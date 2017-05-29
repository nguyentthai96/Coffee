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
    TextView price;
    TextView count;
    TextView unit;
    TextView add;
    TextView sub;

    Button order;

    public ProductAllSelectViewHolder(View itemView) {
        super(itemView);
        productImage = (ImageView) itemView.findViewById(R.id.product_image);
        productName = (TextView) itemView.findViewById(R.id.product_name);
        price = (TextView) itemView.findViewById(R.id.price);
        count = (TextView) itemView.findViewById(R.id.count);
        unit = (TextView) itemView.findViewById(R.id.unit);
        add = (TextView) itemView.findViewById(R.id.add);
        sub = (TextView) itemView.findViewById(R.id.sub);
        order= (Button) itemView.findViewById(R.id.order);
    }


    Long countNumber=0L;
    public void setValueItemName(final Product product){
        productName.setText(product.getName());
        Glide.with(productImage.getContext()). load(Uri.parse("file:///android_asset/"+product.getImage()+".png")).into(productImage);

        count.setText(countNumber.toString());

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countNumber++;
                count.setText(countNumber.toString());

                price.setText((product.getPrice()*countNumber)+"/"+product.getUnit());
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countNumber--;
                count.setText(countNumber.toString());

                price.setText((product.getPrice()*countNumber)+"/"+product.getUnit());
            }
        });

        unit.setText(" /"+product.getUnit());
    }

    public Button getOrder() {
        return order;
    }

    public Long getCountNumber() {
        return countNumber;
    }
}
