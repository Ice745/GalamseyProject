package GalamseyProject;

import java.util.ArrayList;

public class Monitoring {
    private ArrayList<Observatory> ObservatoryList = new ArrayList();

    /**
     * Constructor
     */
    public Monitoring() {
    }

    /**
     * Overloaded constructor
     * @param observeList A list of observatories
     */
    public Monitoring(ArrayList observeList) {
        this.ObservatoryList = observeList;
    }

    /**
     * Add observatory to the list
     * @param observation observatory object
     */

    public void setObservatoryList(Observatory observation) {
        this.ObservatoryList.add(observation);
    }

    /**
     * Returns the list of Observatories in the Monitoring
     * @return observatory list
     */

    public ArrayList<Observatory> getObservatoryList() {
        return this.ObservatoryList;
    }

    /**
     * Calculates the maximum average colour value in monitor
     * @return maximum average
     */

    public int MaxAverageCValue() {
        int maxAvg = 0;
        for(int i=0; i<getObservatoryList().size();i++){
            if(maxAvg < getObservatoryList().get(i).getAverageColorValue()){
                maxAvg = getObservatoryList().get(i).getAverageColorValue();
            }
        }
        return maxAvg;
    }

    /**
     * A list of Galamsey objects with the maximum average colour value
     * @return a list of galamsey objects
     */

    public ArrayList<Galamsey> getMaxAvgGalamsey() {
        int avg = MaxAverageCValue();
        ArrayList<Galamsey> galList = new ArrayList<>();
        for (int i = 0; i <getObservatoryList().size();i++ ){
            if(getObservatoryList().get(i).getAverageColorValue() == avg){
                galList.addAll(getObservatoryList().get(i).getAverageObsGalamsey());
            }
        }
        return galList;
    }

    /**
     * Calculates the maximum color value in monitor
     * @return the maximum color value
     */

    public int MaxCValue() {
        int max = 0;
        for(int i=0; i<getObservatoryList().size();i++){
            if(max < getObservatoryList().get(i).getMaxColorValue()){
                max = getObservatoryList().get(i).getMaxColorValue();
            }
        }
        return max;
    }

    /**
     * A list of Galamsey objects with the maximum colour value
     * @return list of Galamsey objects
     */

    public ArrayList<Galamsey> getMaxMonGalamsey() {
        int max = MaxCValue();
        ArrayList<Galamsey> galList = new ArrayList<>();
        for (int i = 0; i <getObservatoryList().size();i++ ){
            if(getObservatoryList().get(i).getMaxColorValue() == max){
                galList.addAll(getObservatoryList().get(i).getMaxObsGalamsey());
            }
        }
        return galList;
    }

    /**
     * Provides a list of Galamsey events greater than a specified colour value
     * @param colourValue color value looking for
     * @return list of Galamseys greater than specified value
     */

    public ArrayList<Galamsey> SelectedObservatoryRecords(int colourValue){
        ArrayList<Galamsey> records = new ArrayList();
        int x = getObservatoryList().size();
        for (int i=0; i<x; i++){
            records.addAll(getObservatoryList().get(i).SpecificRecords(colourValue));
        }
        return records;
    }
}

