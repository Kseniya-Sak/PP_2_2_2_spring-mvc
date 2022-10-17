package web.model;

public class Car {
    private String mark;
    private String model;
    private int releaseDate;

    public Car() {
    }

    public Car(String mark, String model, int releaseDate) {
        this.mark = mark;
        this.model = model;
        this.releaseDate = releaseDate;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "Car{" +
                "mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", releaseDate=" + releaseDate +
                '}';
    }
}
