package javalessons;

import java.io.Serializable;

public class MobileCompanies implements Serializable {

    private MegaCom megaCom;
    private Beeline beeline;
    private transient OMobile oMobile;

    public MobileCompanies(MegaCom megaCom, Beeline beeline, OMobile oMobile) {
        this.megaCom = megaCom;
        this.beeline = beeline;
        this.oMobile = oMobile;
    }

    public MegaCom getMegaCom() {
        return megaCom;
    }

    public void setMegaCom(MegaCom megaCom) {
        this.megaCom = megaCom;
    }

    public Beeline getBeeline() {
        return beeline;
    }

    public void setBeeline(Beeline beeline) {
        this.beeline = beeline;
    }

    public OMobile getoMobile() {
        return oMobile;
    }

    public void setoMobile(OMobile oMobile) {
        this.oMobile = oMobile;
    }

    @Override
    public String toString() {
        return "MobileCompanies{" +
                "megaCom=" + megaCom +
                ", beeline=" + beeline +
                ", o=" + oMobile +
                '}';
    }
}
