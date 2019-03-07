package gupao.vip.pattern.factory.abstractFactory;

public class PhysicsCourseFactory implements CourseFactory{
    @Override
    public Book acquireBook() {
        return new PhysicsBook();
    }

    @Override
    public Datum acquireDatum() {
        return new PhysicsDatum();
    }
}
