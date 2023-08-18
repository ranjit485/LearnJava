package Learn_Threading.Priorities.RunableInterface;

public class Main {
    public static void main(String[] args) {
        Download D1 =new Download("Avatar Movie");
        Send S1 =new Send("Avatar Movie");
        Upload U1 =new Upload("Dad Movie");

        Thread th1 = new Thread(U1);
        Thread th2 = new Thread(D1);
        Thread th3 = new Thread(S1);

//        UP1.threadId();
//        DV1.threadId();
        th1.setPriority(1);
        th2.setPriority(2);
        th3.setPriority(3);

//        th1.setName("avtar");
//        System.out.println(UP1.getName()+ UP1.threadId());
        System.out.println("ranjit");
        th1.start();
        th2.start();
        th3.start();
    }
}
