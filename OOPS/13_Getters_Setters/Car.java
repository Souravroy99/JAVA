public class Car {
    private String model ;
    private String color ;
    private int price;

    Car(String model, String color, int price) {
        this.model = model ;
        this.color = color ;
        this.price = price ;
    }

  // Getter Functions
    String getModel() {
        return this.model ;
    }

    String getColor() {
        return this.color ;
    }

    int getPrice() {
        return this.price ;
    }


  // Setter Functions
    void setModel(String model) {
        this.model = model ;
    }

    void setColor(String color) {
        this.color = color ;
    }

    void setPrice(int price) {
        this.price = price ;
    }
}