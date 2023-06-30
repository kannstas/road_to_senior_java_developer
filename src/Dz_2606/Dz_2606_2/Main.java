package Dz_2606.Dz_2606_2;

public class Main {
    public static void main(String[] args) {
       // MetalStore metalStore = new MetalStore();
        AluminumJug aluminumJug = new AluminumJug(3.5, "алюминий");
        Barbell barbell = new Barbell(15, "железо");
        Wire wire = new Wire(0.5, "медь");

       MetalStore metalStore = new MetalStore();
       metalStore.calculateThePrice(barbell);
       metalStore.calculateThePrice(wire);
    }
}

