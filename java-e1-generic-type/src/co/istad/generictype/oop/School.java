package co.istad.generictype.oop;

import java.util.List;

public class School<T extends Person> {

    private List<T> dataSet;

    public List<T> getDataSet() {
        return dataSet;
    }

    public void setDataSet(List<T> dataSet) {
        this.dataSet = dataSet;
    }
}
