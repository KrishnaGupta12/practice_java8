package realtimequery;

public class SingletonPatternDemo {
    public static void main(String[] args) {
        //illegal construct
        //Compile Time Error: The constructor SingleObject() is not visible
        // SingleObject object = new SingleObject();
        SingleObject singleObject = SingleObject.getInstance();
        singleObject.show();

    }
}
