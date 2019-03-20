package GalamseyProject;

public class Galamsey {

    /**
     * @author Isaac Owusu
     * @author Benjamin Barnor
     * @author Otito
     * @author Micheal
     *
     * Version 1.0.0
     */
//Member Variables
    private String VegetationColour;
    private String YearOfEvent;
    private int ColourValue;
    private double PosLatitude;
    private double PosLongitude;

    /**
     * Constructor
     */
    public Galamsey() {
    }

    /**
     * Overloaded Constructor
     * @param VegeColour  the colour of the vegetation
     * @param ColorNumber the colour value assigned to the vegetation
     * @param latitude    the latitude of the location
     * @param longitude   the longitude of the location
     * @param EventYear   the year the event of Galamsey happened
     */

    public Galamsey(String VegeColour, int ColorNumber, double latitude, double longitude, String EventYear) {
        if(ColorNumber <0 || ColorNumber > 3 ){
            throw new IllegalArgumentException ("Please enter a number between 0 and 3");
        }

        this.VegetationColour = VegeColour;
        this.ColourValue = ColorNumber;
        this.PosLatitude = latitude;
        this.PosLongitude = longitude;
        this.YearOfEvent = EventYear;
    }


    /**
     * Set the color of the vegetation on the galamsey site
     * @param colour the current color of the vegetation
     */
    public void setVegetationColour(String colour) {
        this.VegetationColour = colour;
    }

    /**
     * Set the Year the galamsey site was seen/observed
     * @param year the year the event started as a string
     */

    public void setYearOfEvent(String year) {
        this.YearOfEvent = year;
    }

    /**
     * Set the color values are assigned to different vegetations
     * @param number the colour value assigned to the vegetation colour
     */
    public void setColourValue(int number) {
        this.ColourValue = number;
    }

    /**
     * Set the latitude of the GPS position
     * @param latitude the latitude coordinates of the galamsey site
     */
    public void setPosLatitude(double latitude) {
        this.PosLatitude = latitude;
    }

    /**
     * Set the longitude of the GPS location
     * @param longitude the longitude coordinates of the galamsey site
     */

    public void setPosLongitude(double longitude) {
        this.PosLongitude = longitude;
    }


    /**
     * Get the color of the vegetation on the galamsey site
     * @return the color of the vegetation
     */
    public String getVegetationColour() {
        return this.VegetationColour;
    }

    /**
     * Get the Year the galamsey site was seen/observed
     * @return the year of the event
     */

    public String getYearOfEvent() {
        return this.YearOfEvent;
    }

    /**
     * Get the color values are assigned to different vegetation
     * @return the color value assigned to the vegetation
     */

    public int getColourValue() {
        return this.ColourValue;
    }

    /**
     * Get the latitude of the GPS location
     * @return the latitude of the galamsey site
     */

    public double getPosLatitude() {
        return this.PosLatitude;
    }

    /**
     * Get the longitude of the GPS location
     * @return the longitude of the galamsey site
     */
    public double getPosLongitude() {
        return this.PosLongitude;
    }

    /**
     * Returns the class properties as a string
     *
     * @return a string of object
     */
    public String toString() {
        return "\nVegetation Color: " + getVegetationColour() + "\n Year of Event: " + getYearOfEvent() + "\n Color Value: " + getColourValue() + "\n Latitude: " + getPosLatitude() + "\n Longitude " + getPosLongitude()+"\n";
    }
}


