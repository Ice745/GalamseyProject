package GalamseyProject;

import java.util.ArrayList;

public class Observatory {

    /**
     * Instance variables
     */
    private String ObsvName;
    private String ObsvCountry;
    private String ObsvYear;
    private double ObsvArea;
    private ArrayList<Galamsey> ObsvGalamsey = new ArrayList();


    /**
     * Class constructor
     */

    public Observatory() {
    }

    /**
     * Overloaded constructor
     * @param name the name of the observatory
     * @param country the name of the country the observatory is situated
     * @param year the year the galamsey observations started
     * @param area area covered by the observatory in square kilometres
     * @param galamseyRecord list of galamsey events recorded
     */

    public Observatory(String name, String country, String year, double area, ArrayList galamseyRecord) {
        this.ObsvName = name;
        this.ObsvCountry = country;
        this.ObsvYear = year;
        this.ObsvArea = area;
        this.ObsvGalamsey = galamseyRecord;
    }


    /**
     * Changes the name of the observatory
     * @param Name new name of the observatory
     */
    public void setObservatoryName(String Name) {
        this.ObsvName = Name;
    }

    /**
     * Changes the name of the country the observatory is located
     * @param Country Name of the new country
     */
    public void setObservatoryCountry(String Country) {
        this.ObsvCountry = Country;
    }

    /**
     * Assigns a new value to the area of the observatory
     * @param Area New area of the observatory
     */

    public void setObservatoryArea(double Area) {
        this.ObsvArea = Area;
    }

    /**
     * Assigns a new year to the observatory
     * @param Year New year which galamsey operations started
     */

    public void setObservatoryYear(String Year) {
        this.ObsvYear = Year;
    }

    /**
     * Adds a new Galamsey event to the list of events recorded at the observatory
     * @param obj New galamsey occurence
     */

    public void setObservatoryGalamseyRecords(Galamsey obj) {
        this.ObsvGalamsey.add(obj);
    }

    /**
     * Returns the list of galamsey events recorded
     * @return an arraylist of the galamsey objects
     */
    public ArrayList<Galamsey> getObservatoryGalamseyRecords() {
        return this.ObsvGalamsey;
    }

    /**
     *Accessor method for the observatory area
     * @return returns observatory area
     */

    public double getObservatoryArea() {
        return this.ObsvArea;
    }

    /**
     * Accessor method for the observatory year
     * @return the year the galamsey activities started
     */

    public String getObservatoryYear() {
        return ObsvYear;
    }

    /**
     * Accessor method for the observatory name
     * @return returns the name of the observatory
     */
    public String getObservatoryName() {
        return this.ObsvName;
    }

    /**
     * Accessor method for the observatory country
     * @return Country of the Observatory
     */

    public String getObservatoryCountry() {
        return this.ObsvCountry;
    }

    /**
     * Returns the object properties as a string
     *
     * @return contents of the instance
     */
    public String toString() {
        return "\nObservatory name: " + getObservatoryName() + "\nObservatory country: " + getObservatoryCountry() + "\nObservatory year: " + getObservatoryYear() + "\nObservatory Area: " + getObservatoryArea() + "\n";
    }

    /**
     * Returns the largest color value ever recorded by the observatory
     * @return maximum color value
     */

    public int getMaxColorValue() {
        int max = 0;
        for (int i=0; i<getObservatoryGalamseyRecords().size(); i++){
            if(max < getObservatoryGalamseyRecords().get(i).getColourValue()){
                max = getObservatoryGalamseyRecords().get(i).getColourValue();
            }
        }
        return max;
    }

    /**
     * A list of galamsey records equal to the maximum color value
     * @return maximum galamsey event
     */

    public ArrayList<Galamsey> getMaxObsGalamsey() {
        int max = getMaxColorValue();
        ArrayList<Galamsey> galList = new ArrayList<>();
        for (int i = 0; i <getObservatoryGalamseyRecords().size();i++ ){
            if(getObservatoryGalamseyRecords().get(i).getColourValue() == max){
                galList.add(getObservatoryGalamseyRecords().get(i));
            }
        }
        return galList;
    }

    /**
     * Finds the average color value
     * @return Returns the average color value recorded by the observatory
     */

    public int getAverageColorValue() {
        int num = 0;
        int den = 0;
        for(int i=0; i<getObservatoryGalamseyRecords().size();i++){
            num += getObservatoryGalamseyRecords().get(i).getColourValue();
            den += 1;
        }
        int average = num / den;
        return average;
    }

    /**
     * A list of galamsey events equal to the average color value
     * @return average galamsey events
     */

    public ArrayList<Galamsey> getAverageObsGalamsey() {
        int avg = getAverageColorValue();
        ArrayList<Galamsey> avgGalList = new ArrayList<>();
        for (int i = 0; i <getObservatoryGalamseyRecords().size();i++ ){
            if(getObservatoryGalamseyRecords().get(i).getColourValue() == avg){
                avgGalList.add(getObservatoryGalamseyRecords().get(i));
            }
        }
        return avgGalList;
    }


    /**
     * Returns a list of all galamsey instances recorded at the observatory
     * with a color value greater than a specified number
     * @param value color value
     * @return galamsey events
     */

    public ArrayList<Galamsey> SpecificRecords (int value){
        ArrayList<Galamsey> newlist = new ArrayList();
        int x = getObservatoryGalamseyRecords().size();
        for (int i=0; i < x; i++){
            if (value < getObservatoryGalamseyRecords().get(i).getColourValue()){
                newlist.add(getObservatoryGalamseyRecords().get(i));
            }
        }
        return newlist;
    }

}

