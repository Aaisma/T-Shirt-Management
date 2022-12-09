package module;

public class Items {
    public int getItem_no() {
        return item_no;
    }

    public void setItem_no(int item_no) {
        this.item_no = item_no;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public Boolean getLimited_edition() {
        return limited_edition;
    }

    public void setLimited_edition(Boolean limited_edition) {
        this.limited_edition = limited_edition;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    int item_no;
    String item_name;
    String season;
    Boolean limited_edition;
    String gender;
    String colour;

    public Items(int item_no, String item_name, String season, Boolean limited_edition, String gender, String colour) {
        this.item_no = item_no;
        this.item_name = item_name;
        this.season = season;
        this.limited_edition = limited_edition;
        this.gender = gender;
        this.colour = colour;
    }
}
