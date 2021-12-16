package behaviors.quack;

public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("<<< Nothing but Silence >>>");
    }
}
