package Lesson.OOP.relationspipsClass.testAG;

public class User {
    String login;
    ServerInst serverInst;
    public User (String login, ServerInst serverInst) {
        this.login = login;
        this.serverInst = serverInst;
    }
    public void uploadAPhoto () {
        if (serverInst.state) {
            System.out.println("Фото загружено на аккаунт " + login);
        } else {
            System.out.println("Нет соединения с сервером");
        }
    }
}
