package ss4_oop.bai_tap_stopWatch;

public class main {
    public static void main(String[] args){
        StopWatch sw = new StopWatch();
        sw.start();
        for(int i = 0; i < 1000;i++){
            int x = i + i;
            System.out.println("code : "+ x + "giết thời gian");
        }
        sw.stop();
        System.out.println(" "+ sw.getElapsedTime()+ "milisecon ");
    }
}

