package uk.serket.cloud;

/**
 * Created by daijin on 17/05/2015.
 */
public class A implements IA {

    private IB b;

    public void sayHello() {
        b.say();
    }

    public void setB(IB b) {
        this.b = b;
    }
}
