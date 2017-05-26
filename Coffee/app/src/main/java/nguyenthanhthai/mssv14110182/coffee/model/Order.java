package nguyenthanhthai.mssv14110182.coffee.model;

import com.orm.SugarRecord;

import java.util.Date;

/**
 * Created by NguyenThanhThai on 5/26/2017.
 */

public class Order extends SugarRecord{

    Date date;
    String customerName;
    Double priceTotal;

    public Order() {
    }

    public Order(Date date, String customerName, Double priceTotal) {
        this.date = date;
        this.customerName = customerName;
        this.priceTotal = priceTotal;
    }
}
