package singleton;


public class RemoteAdminstraitors {
    private static RemoteAdminstraitors instance ;
    private RemoteAdminstraitors() {
        System.out.println("toi la duy nhat");
    }

     public static RemoteAdminstraitors getInstance() {
        if (instance == null) {
            instance = new RemoteAdminstraitors();
        }
        return instance;
    }
}

