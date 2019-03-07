package gupao.vip.pattern.factory.abstractFactory;

public class NatureCourseFactory implements CourseFactory{
    @Override
    public Book acquireBook() {
        return new NatureBook();
    }

    @Override
    public Datum acquireDatum() {
        return new NatureDatum();
    }
}
