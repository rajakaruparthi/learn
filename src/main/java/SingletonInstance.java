public class SingletonInstance {

    private int a;
    private int b;

    private static SingletonInstance singletonINstance = null;

    private SingletonInstance() {
    }

    public static synchronized SingletonInstance getInstance() {
        if (singletonINstance == null) {
            singletonINstance = new SingletonInstance();
        }
        return singletonINstance;
    }

    private SingletonInstance(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public static void main(String[] args) {
        SingletonInstance singletonINstance = SingletonInstance.getInstance();
        System.out.println(singletonINstance.hashCode());
        SingletonInstance singletonINstance2 = SingletonInstance.getInstance();
        System.out.println(singletonINstance2.hashCode());
        SingletonInstance singletonINstance3 = SingletonInstance.getInstance();
        System.out.println(singletonINstance3.hashCode());

    }
}
