package gupao.vip.pattern.factory.factoryMethod;

import gupao.vip.pattern.factory.Subject;

public class FactoryMethodTest {

    public static void main(String[] args) {

        SubjectMethodFactory factory = new JavaSubjectFactory();
        Subject course = factory.acquire();
        course.textbook();

        factory = new NatureSubjectFactory();
        course = factory.acquire();
        course.textbook();

    }
}
