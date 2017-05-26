package nguyenthanhthai.mssv14110182.coffee.model;

import com.orm.SugarRecord;
import com.orm.dsl.Ignore;

/**
 * Created by NguyenThanhThai on 5/26/2017.
 */

public class OrderDetail extends SugarRecord{
    Long id;
    Product product;
    TableCafe table;
    Order order;

    public OrderDetail() {
    }

    public OrderDetail(Product product, TableCafe table, Order order) {
        this.product = product;
        this.table = table;
        this.order = order;
    }
}
