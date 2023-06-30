package Dz_2606.Dz_2606_2;

/*
создать класс провод штанга алюминивый кувшин наслудются от классса металолом
создать класс металолом  с полями вес и тип (тоесть алюминь медь или чер мет)
 */
public abstract class ScrapMetal {
    private double weight;
    private String typeOfMetal;

    protected ScrapMetal(double weight, String typeOfMetal) {
        this.weight = weight;
        this.typeOfMetal = typeOfMetal;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getTypeOfMetal() {
        return typeOfMetal;
    }

    public void setTypeOfMetal(String typeOfMetal) {
        this.typeOfMetal = typeOfMetal;
    }


}
