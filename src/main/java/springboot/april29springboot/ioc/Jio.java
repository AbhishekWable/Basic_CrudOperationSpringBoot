package springboot.april29springboot.ioc;

public class Jio implements Sim{
    @Override
    public void calling() {
        System.out.println("calling in jio");
    }

    @Override
    public void msg() {
        System.out.println("msg in jio");

    }
}
