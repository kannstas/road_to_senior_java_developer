package Lesson.Classes.Enum;

public enum Colors {
    BROW("Карие"),
    BRILIANT_BLU("Голубые"),
    BLACK("Черные"),
    GREEN("зеленые"),
    GRAY("Серые");

    private String colorRu;

    public String getColorRu() {
        return colorRu;
    }

    Colors(String colorRu) {
        this.colorRu = colorRu;
    }

    public void info(){
        System.out.println("цветнын линзы ");
    }
}
