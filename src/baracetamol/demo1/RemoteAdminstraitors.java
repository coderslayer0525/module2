package baracetamol.demo1;


import java.util.Scanner;

public class RemoteAdminstraitors {
    public static RemoteAdminstraitors instance ;
    public RemoteAdminstraitors() {
        System.out.println("1");
    }

      public synchronized  static RemoteAdminstraitors getInstance() {
        if (instance == null) {
            instance = new RemoteAdminstraitors();
        }
        return instance;
    }
}

