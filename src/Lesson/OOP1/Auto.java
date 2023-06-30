package Lesson.OOP1;

public class Auto {
    String model;
    int maxSpeed;
    String colour;

    int horsePower;

    public Auto(String model, int maxSpeed, String colour, int horsePower) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.colour = colour;
        this.horsePower = horsePower;
    }
    public void tax () {
        int resultTax = 0;
        if (horsePower < 100) {
            resultTax = horsePower*12;
        } else if (horsePower < 250) {
            resultTax = 99 * 12;
            resultTax += (horsePower - 99) * 35;
        }else {
            resultTax += 99 * 12;
            resultTax +=150 * 35;
            resultTax += (horsePower - 249) * 150;
        }

        System.out.println("Налог на ваш авто в год:  " + resultTax);
    }
}
