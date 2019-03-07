package gupao.vip.pattern.factory.simpleFactory;

import gupao.vip.pattern.factory.JavaSubject;
import gupao.vip.pattern.factory.PhysicsSubject;
import gupao.vip.pattern.factory.Subject;

public class SimpleFactoryTest {
    public static void main(String[] args) {
        //Subject subject = new JavaSubject();
        //subject.textbook();

        //SubjectFactory factory = new SubjectFactory();
        //Subject course = factory.acquire("gupao.vip.pattern.factory.NatureSubject");
        //course.textbook();

        SubjectFactory factory = new SubjectFactory();
        Subject course = factory.acquire(PhysicsSubject.class);
        course.textbook();

    }
}
