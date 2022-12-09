package module;

import java.util.ArrayList;

public class Orders {
    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getNo_of_items() {
        return no_of_items;
    }

    public void setNo_of_items(int no_of_items) {
        this.no_of_items = no_of_items;
    }

    public String getOrdered_by() {
        return ordered_by;
    }

    public void setOrdered_by(String ordered_by) {
        this.ordered_by = ordered_by;
    }

    public String getOrdered_date() {
        return ordered_date;
    }

    public void setOrdered_date(String ordered_date) {
        this.ordered_date = ordered_date;
    }

    public String getDay_of_shipping() {
        return day_of_shipping;
    }

    public void setDay_of_shipping(String day_of_shipping) {
        this.day_of_shipping = day_of_shipping;
    }

    public ArrayList<Items> getItems() {
        return items;
    }

    public void setItems(ArrayList<Items> items) {
        this.items = items;
    }

    int order_id;
    int no_of_items;
    String ordered_by;
    String ordered_date;
    String day_of_shipping;
    ArrayList<Items> items;

    public Orders(int order_id, int no_of_items, String ordered_by, String ordered_date, String day_of_shipping, ArrayList<Items> items) {
        this.order_id = order_id;
        this.no_of_items = no_of_items;
        this.ordered_by = ordered_by;
        this.ordered_date = ordered_date;
        this.day_of_shipping = day_of_shipping;
        this.items = items;
    }
}
