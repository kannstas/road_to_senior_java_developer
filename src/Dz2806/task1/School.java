package Dz2806.task1;

public class School extends Building implements EducationalInstitution{
    @Override
    public void waterArrived() {
        System.out.println("Вода поступила в школу");
    }
}
