public class Car {
       // private static Builder builder = null;
        private String model;
        private String color;

        public Car(String model, String color){
            this.color=color;
            this.model=model;
        }

        public static Builder builder(){
            return new Builder();
        }

        @Override
        public String toString() {
            return "Car{" +
                    "model='" + model + '\'' +
                    ", color='" + color + '\'' +
                    '}';
        }
}
