package gupao.vip.pattern.factory.abstractFactory;


public class JavaCourseFactory implements CourseFactory{


    @Override
    public Book acquireBook() {
        return new JavaBook();
    }

    @Override
    public Datum acquireDatum() {
        return new JavaDatum();
    }
}
