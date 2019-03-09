package GalamseyProject;

import java.util.ArrayList;
import java.util.Iterator;

public class Observatory {

    private String ObsvName;
    private String ObsvCountry;
    private String ObsvYear;
    private double ObsvArea;
    private ArrayList<Galamsey> ObsvGalamsey = new ArrayList();

    public Observatory() {
    }

    public Observatory(String name, String country, String year, double area, ArrayList galamseyRecord) {
        this.ObsvName = name;
        this.ObsvCountry = country;
        this.ObsvYear = year;
        this.ObsvArea = area;
        this.ObsvGalamsey = galamseyRecord;
    }

    public void setObservatoryName(String Name) {
        this.ObsvName = Name;
    }

    public void setObservatoryCountry(String Country) {
        this.ObsvCountry = Country;
    }

    public void setObservatoryArea(double Area) {
        this.ObsvArea = Area;
    }

    public void setObservatoryYear(String Year) {
        this.ObsvYear = Year;
    }

    public void setObservatoryGalamseyRecords(Galamsey obj) {
        this.ObsvGalamsey.add(obj);
    }

    public ArrayList<Galamsey> getObservatoryGalamseyRecords() {
        return this.ObsvGalamsey;
    }

    public double getObservatoryArea() {
        return this.ObsvArea;
    }

    public String getObservatoryYear() {
        return ObsvYear;
    }

    public String getObservatoryName() {
        return this.ObsvName;
    }

    public String getObservatoryCountry() {
        return this.ObsvCountry;
    }

    public int getMaxColorValue() {
        Iterator<Galamsey> iter = getObservatoryGalamseyRecords().iterator();
        int max = 0;
        while (iter.hasNext()) {
            if (iter.next().getColourValue() > max) {
                max = iter.next().getColourValue();
            }
        }
        return max;
    }

    public int getAverageColorValue() {
        Iterator<Galamsey> iter = getObservatoryGalamseyRecords().iterator();
        int num = 0;
        int den = 0;
        while (iter.hasNext()) {
            num += iter.next().getColourValue();
            den += +1;
        }
        int average = num / den;
        return average;
    }

    public ArrayList<Galamsey> SpecificRecords(int value) {
        Iterator<Galamsey> iter = getObservatoryGalamseyRecords().iterator();
        int i = 0;
        ArrayList<Galamsey> newList = new ArrayList();
        while (iter.hasNext()) {
            if (value < iter.next().getColourValue()) {
                i += 1;
                newList.add(getObservatoryGalamseyRecords().get(i));
            }
        }
        return newList;
    }

    @Override
    public String toString() {
        return super.toString();
    }

//    public static void main(String args[]){
//        Observatory thing = new Observatory();
//        Galamsey gal1 = new Galamsey();
//        gal1.setColourValue(2);
//        gal1.setVegetationColour("Yellow");
//        gal1.setYearOfEvent("2010");
//        gal1.setPosLongitude(2.03939);
//        gal1.setPosLatitude(-3.2342);
//
//        thing.setObservatoryGalamseyRecords(gal1);
//        System.out.println(thing.getObservatoryGalamseyRecords());
//
//    }

}