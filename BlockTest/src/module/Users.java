package module;

import java.util.ArrayList;

public class Users {
    int id;
    String contact_number;
    String email;
    ArrayList<Orders> orders;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContact_number() {
        return contact_number;
    }

    public void setContact_number(String contact_number) {
        this.contact_number = contact_number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Orders> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Orders> orders) {
        this.orders = orders;
    }

    public Users(int id, String contact_number, String email, ArrayList<Orders> orders) {
        this.id = id;
        this.contact_number = contact_number;
        this.email = email;
        this.orders = orders;
    }
}
