package Dz2806.task1;

public class University extends Building implements EducationalInstitution {
    @Override
    public void waterArrived() {
        System.out.println("Вода поступила в университет");
    }
}
