package Lesson.OOP.relationspipsClass.testAG;

public class ServerInst {
    boolean state;
    int port;

    public ServerInst(boolean state, int port) {
        this.state = state;
        this.port = port;
    }



    public void On () {
        state = true;
        System.out.println("Сервер включен");
    }
    public void Off () {
        state = false;
        System.out.println("Сервер выключен");
    }
}
