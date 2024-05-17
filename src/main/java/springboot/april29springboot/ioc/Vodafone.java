package springboot.april29springboot.ioc;

public class Vodafone implements Sim{
    @Override
    public void calling() {
        System.out.println("Calling in vodafone");
    }

    @Override
    public void msg() {
        System.out.println("msg in vodafone");

    }
}
