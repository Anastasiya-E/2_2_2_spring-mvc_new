package web.model;

public class Car {
    private String model;
    private int series;
    private int year;
    public String getModel() {
        return model;
    }
    public int getSeries() {
        return series;
    }
    public int getYear() {
        return year;
    }
    public void setModel(String m) {
        this.model = m;
    }
    public void setSeries(int s) {
        this.series = s;
    }
    public void setYear(int y) {
        this.year = y;
    }
    public Car(String m, int s, int y) {
        this.model = m;
        this.series = s;
        this.year = y;
    }
}
