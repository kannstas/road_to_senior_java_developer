package Dz2806.task1;

public class Administration extends Building implements StateInstitution{
    @Override
    public void waterArrived() {
        System.out.println("Вода поступила в администрацию");
    }
}
