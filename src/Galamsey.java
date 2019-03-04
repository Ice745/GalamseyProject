import java.util.Calendar;
import java.util.Scanner;

public class Galamsey {

    /**
     * @author Isaac Owusu
     * @author Benjamin Barnor
     * @author Otito
     * @author Micheal
     *
     * Version 1.0.0
     *
     */
//Member Variables
    private String VegetationColour;
    private String YearOfEvent;
    private int ColourValue;
    private double PosLatitude;
    private double PosLongitude;


    public Galamsey(){}

    /**
     *
     * @param VegeColour the colour of the vegetation
     * @param ColorNumber the colour value assigned to the vegetation
     * @param latitude the latitude of the location
     * @param longitude the longitude of the location
     * @param EventYear the year the event of Galamsey happened
     */

    public  Galamsey(String VegeColour, int ColorNumber, double latitude, double longitude, String EventYear){
        this.VegetationColour = VegeColour;
        this.ColourValue = ColorNumber;
        this.PosLatitude = latitude;
        this.PosLongitude = longitude;
        this.YearOfEvent = EventYear;
    }

    public void setVegetationColour(String colour){
        this.VegetationColour = colour;
    }

    public void setYearOfEvent(String year){
        this.YearOfEvent = year;
    }

    public void setColourValue(int number){
        this.ColourValue = number;
    }

    public void setPosLatitude(double latitude){
        this.PosLatitude=latitude;
    }

    public void setPosLongitude(double longitude){
        this.PosLongitude = longitude;
    }

    public String getVegetationColour(){
        return this.VegetationColour;
    }

    public String getYearOfEvent(){
        return this.YearOfEvent;
    }

    public int getColourValue(){
        return this.ColourValue;
    }

    public double getPosLatitude(){
        return this.PosLatitude;
    }

    public double getPosLongitude(){
        return this.PosLongitude;
    }



}
