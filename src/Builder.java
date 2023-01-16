public class Builder {
    private String model = null;
    private String color = null;

    public Builder model(String model) {
        this.model = model;
        return this;
    }

    public Builder color(String color) {
        this.color = color;
        return this;
    }

    public Car build() {
        return new Car(model, color);
    }
}
