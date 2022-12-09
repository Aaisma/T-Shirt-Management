import module.Items;
import module.Users;
import module.Orders;

import java.util.ArrayList;
import java.util.TreeMap;

public class main {
    public static void main(String[] args) {
        ArrayList<Items>Summer=new ArrayList<>();
        ArrayList<Items>Fall=new ArrayList<>();
        ArrayList<Items>Winter=new ArrayList<>();

        Items a=new Items(477,"GC limited T-shirt","Summer",true,"Unisex","Brown");
        Items b=new Items(687,"AL Jingle shirt","Winter",false,"Women","Light Pink");
        Items c=new Items(942,"LN ED Print T-shirt ","Summer",false,"Male","Red");
        Items d=new Items(148,"QM puma Shirt","Fall",true,"Male","Black");
        Items e=new Items(163,"WC jersey Shirt","Winter",true,"Unisex","White");
        Items f=new Items(194,"WN long barbie shirt","Fall",false,"Women","Cream");

        Summer.add(a);
        Summer.add(c);

        Fall.add(d);
        Fall.add(f);

        Winter.add(b);
        Winter.add(e);

        System.out.println(Summer);
        System.out.println(Fall);
        System.out.println(Winter);


        ArrayList<Orders>Limited_edition=new ArrayList<>();
        ArrayList<Orders>Regular=new ArrayList<>();

        Orders aa= new Orders(495,7,"Ayden Vulpian", "December 9th, 2022","6 days",a);
        Orders bb= new Orders(588,4,"Clair Rose", "December 2nd, 2022","8 days",b);
        Orders cc= new Orders(298,7,"Yung Hangul", "December 3rd, 2022","4 days",c);
        Orders dd= new Orders(012,2,"Yuko Ito", "November 30th, 2022","10 days",d);
        Orders ee= new Orders(835,5,"Jimmy Falcon", "November 29th, 2022","15 days",e);
        Orders ff= new Orders(739,1,"Crystal Park", "December 10th, 2022","1 days",f);

        Limited_edition.add(aa);
        Limited_edition.add(dd);
        Limited_edition.add(ee);

        Regular.add(bb);
        Regular.add(cc);

        System.out.println(Limited_edition);
        System.out.println(Regular);


        ArrayList<Users>Male=new ArrayList<>();
        ArrayList<Users>Female=new ArrayList<>();
        ArrayList<Users>Unisex=new ArrayList<>();

        Users aaa=new Users(68934,"9876543210","ady@gmail.com",aa);
        Users bbb=new Users(59090,"1234567890","claire@gmail.com",bb);
        Users ccc=new Users(68934,"9876546782","yh@gmail.com",cc);
        Users ddd=new Users(59090,"1257167899","iyuko@gmail.com",dd);
        Users eee=new Users(68934,"9876914214","jim@gmail.com",ee);
        Users fff=new Users(59090,"1234567893","cysp@gmail.com",ff);

        Male.add(ccc);
        Male.add(ddd);

        Female.add(bbb);
        Female.add(fff);

        Unisex.add(aaa);
        Unisex.add(eee);

        System.out.println(Male);
        System.out.println(Female);
        System.out.println(Unisex);


    }
}