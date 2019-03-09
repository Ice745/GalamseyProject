package GalamseyProject;

import java.util.ArrayList;
import java.util.Iterator;

public class Observatory {


    //Member Variables
    private String ObsvName;
    private String ObsvCountry;
    private String ObsvYear;
    private double ObsvArea;
    private ArrayList<Galamsey> ObsvGalamsey = new ArrayList();


    //Constructor

    public Observatory() {
    }

    //Overloaded constructor

    public Observatory(String name, String country, String year, double area, ArrayList galamseyRecord) {
        this.ObsvName = name;
        this.ObsvCountry = country;
        this.ObsvYear = year;
        this.ObsvArea = area;
        this.ObsvGalamsey = galamseyRecord;
    }


    //Mutator methods
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

    /**
     * Returns the list of galamsey events recorded
     * @return
     */
    public ArrayList<Galamsey> getObservatoryGalamseyRecords() {
        return this.ObsvGalamsey;
    }

    /**
     * Accessor methods
     * @return
     */
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


    /**
     * Returns the largest color value ever recorded by the observatory
     * @return
     */

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

    /**
     * Returns the average color value recorded by the observatory
     * @return
     */

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


    /**
     * Returns a list of all galamsey instances recorded at the observatory
     * with a color value greater than a specified number
     * @param value
     * @return
     */
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

}