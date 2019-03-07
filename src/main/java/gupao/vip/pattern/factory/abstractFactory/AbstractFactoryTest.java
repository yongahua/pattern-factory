package gupao.vip.pattern.factory.abstractFactory;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        JavaCourseFactory factory = new JavaCourseFactory();

        factory.acquireBook().acquire();
        factory.acquireDatum().buy();
    }
}
