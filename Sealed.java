sealed class A extends Thread implements Cloneable permits B,C{

}
final class B extends A{

}
final class C extends A{

}
class D{

}


public class Sealed {
    public static void main(String[] args) {
        
    }
}
