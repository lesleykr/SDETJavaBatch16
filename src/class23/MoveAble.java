package class23;

public interface MoveAble {
    int age=12;
    void move();
}

interface WashAble{
    void wash();
}
class Dog implements MoveAble, WashAble{
    @Override
    public void move(){
        System.out.println("Moving...");
    }
@Override  public void wash(){
    System.out.println("Washing");
};
}

class Cat implements MoveAble{
    @Override
    public void move(){
        System.out.println("Cats can also move");
    }
}
    class Horse implements MoveAble{
@Override
public void move(){
        System.out.println("Horses can also move");
        }
        }
