package GalamseyProject;

import java.util.ArrayList;
import java.util.Iterator;

public class Monitoring {
    private ArrayList<Observatory> ObservatoryList = new ArrayList();

    public Monitoring() {
    }

    ;

    public Monitoring(ArrayList observeList) {
        this.ObservatoryList = observeList;
    }

    public void setObservatoryList(Observatory observation) {
        this.ObservatoryList.add(observation);
    }

    public ArrayList<Observatory> getObservatoryList() {
        return this.ObservatoryList;
    }

    public int MaxAverageCValue() {
        Iterator<Observatory> iter = getObservatoryList().iterator();
        int maxAvg = 0;
        while (iter.hasNext()) {
            if (iter.next().getAverageColorValue() > maxAvg) {
                maxAvg = iter.next().getAverageColorValue();
            }
        }
        return maxAvg;
    }

    public int MaxCValue() {
        Iterator<Observatory> iter = getObservatoryList().iterator();
        int max = 0;
        while (iter.hasNext()) {
            if (iter.next().getMaxColorValue() > max) {
                max = iter.next().getMaxColorValue();
            }
        }
        return max;
    }

    public ArrayList<Galamsey> SelectedObservatoryRecords(int colourValue){
        ArrayList<Galamsey> records = new ArrayList();
        int x = getObservatoryList().size();
        for (int i=0; i<x; i++){
            records.addAll(getObservatoryList().get(i).SpecificRecords(colourValue));
        }
        return records;
    }

}

