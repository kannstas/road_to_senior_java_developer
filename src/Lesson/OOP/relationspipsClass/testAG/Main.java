package Lesson.OOP.relationspipsClass.testAG;

public class Main {
    public static void main(String[] args) {
        ServerInst serverInst = new ServerInst(false,5642);
        serverInst.On();

        User user1 = new User("dfsf", serverInst);
        User user2 = new User("dqeweqf", serverInst);
        User user3 = new User("dfwqeqwrqwrqrqwrqw", serverInst);

        user1.uploadAPhoto();
        user2.uploadAPhoto();
        user3.uploadAPhoto();
    }
}
