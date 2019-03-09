package GalamseyProject;

import java.util.ArrayList;

public class Observatory {

    private String ObsvName;
    private String ObsvCountry;
    private String ObsvYear;
    private double ObsvArea;
    private ArrayList<Galamsey> ObsvGalamsey;

    public Observatory(){}

    public Observatory(String name,String country,String year, double area,ArrayList galamseyRecord){
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

    public void setObservatryGalamseyRecords(Galamsey event) {
        this.ObsvGalamsey.add(event);
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

    public String getObservatoryName(){
        return this.ObsvName;
    }

    public String getObservatoryCountry() {
        return this.ObsvCountry;
    }
}
