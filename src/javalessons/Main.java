package javalessons;

import com.google.gson.Gson;

public class Main {

    public static void main(String[] args) {

        MegaCom megaCom = new MegaCom("Chuy avenue", "Mobile operator", "Larry Page");
        Beeline beeline = new Beeline("Moskovskaya street", "Mobile operator", "Pavel Durov");
        OMobile oMobile = new OMobile("Bokonbaeva street", "Mobile operator", "Sergey Breen");

        MobileCompanies mobileCompanies = new MobileCompanies(megaCom, beeline, oMobile);

        Gson gson = new Gson();
        System.out.println("Before transient : " + mobileCompanies + "\n");
        String mobileCompany = gson.toJson(mobileCompanies);
        System.out.println("After transient : " + mobileCompany +"\n");




    }
}
