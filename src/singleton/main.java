package singleton;

    public class main {
        public static void main(String[] args) {
            

            RemoteAdminstraitors o1 = RemoteAdminstraitors.getInstance();
            RemoteAdminstraitors o2 = RemoteAdminstraitors.getInstance();
            RemoteAdminstraitors o3 = RemoteAdminstraitors.getInstance();

            System.out.println("hashCode r1: " + o1.hashCode());
            System.out.println("hashCode r2: " + o2.hashCode());
            System.out.println("hashCode r3: " + o3.hashCode());

        }
    }
