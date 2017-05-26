package nguyenthanhthai.mssv14110182.coffee.model;

import com.orm.SugarRecord;

import java.util.List;

/**
 * Created by NguyenThanhThai on 5/26/2017.
 */

public class TableCafe extends SugarRecord {

    Long id = getId();
    String name;

    public TableCafe() {
    }

    public TableCafe(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "TableCafe " + id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static List<TableCafe> selectAll() {
        return TableCafe.listAll(TableCafe.class);
    }

    public static void insertDataInit() {
        try {
            TableCafe.deleteAll(TableCafe.class);
        } catch (Exception e) {
        }

        TableCafe table = new TableCafe("Bàn 1");
        table.save();
        table = new TableCafe("Bàn 2");
        table.save();
        table = new TableCafe("Bàn 3");
        table.save();
        table = new TableCafe("Bàn 4");
        table.save();

    }
}
