package baracetamol.demo1;


import java.util.Scanner;

public class RemoteAdminstraitors {
    private static RemoteAdminstraitors instance ;
    private  RemoteAdminstraitors() {
        System.out.println("1");
    }

     synchronized public static RemoteAdminstraitors getInstance() {
        if (instance == null) {
            instance = new RemoteAdminstraitors();
        }
        return instance;
    }
}

