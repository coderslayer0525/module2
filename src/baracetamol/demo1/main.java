package baracetamol.demo1;

    public class main {
        public static void main(String[] args) {
            

            RemoteAdminstraitors r1 = RemoteAdminstraitors.getInstance();
            RemoteAdminstraitors r2 = RemoteAdminstraitors.getInstance();
            RemoteAdminstraitors r3 = RemoteAdminstraitors.getInstance();

            System.out.println("hashCode r1: " + r1.hashCode());
            System.out.println("hashCode r2: " + r2.hashCode());
            System.out.println("hashCode r3: " + r3.hashCode());

        }
    }
