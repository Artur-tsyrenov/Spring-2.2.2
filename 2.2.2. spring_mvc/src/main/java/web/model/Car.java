package web.model;

public class Car {

    private String model;
    private int horses;
    private String type;

    public Car(String model, int horses, String type) {
        this.model = model;
        this.horses = horses;
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHorses() {
        return horses;
    }

    public void setHorses(int horses) {
        this.horses = horses;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


}
