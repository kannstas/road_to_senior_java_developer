package Lesson.Interface;

public class MetalStore {
    Metal metal;

    public void acceptMetal(Metal metal) {
        System.out.println((metal.getWeight() * 20));

    }
}
