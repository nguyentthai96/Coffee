package nguyenthanhthai.mssv14110182.coffee.model;

import com.orm.SugarRecord;

/**
 * Created by NguyenThanhThai on 5/26/2017.
 */

public class TableStatus extends SugarRecord {
    TableCafe table;
    boolean isEmpty=false;

    public TableStatus() {
    }

    public TableStatus(TableCafe table, boolean isEmpty) {
        this.table = table;
        this.isEmpty = isEmpty;
    }
}
