package Dz_2307.task4;

public class Pair<LEFT, RIGHT> {
    private final LEFT left;
    private final RIGHT right;

    public Pair(LEFT left, RIGHT right) {
        this.left = left;
        this.right = right;
    }

    public LEFT getLeft() {
        return left;
    }

    public RIGHT getRight() {
        return right;
    }

}