public class Main {
    public static void main(String[] args) {
        Car car = Car.builder()
                .model("Красивая модель")
                .color("Красивый цвет")
                .build();

        System.out.println(car);

        car = Car.builder().build();

        System.out.println(car);
    }
}