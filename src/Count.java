public class Count implements Runnable{
    private Thread myThreat;

//    Bước 1: Tạo class Count implement phương thức Runnable với thuộc tính là myThread

    public Count(){
        myThreat = new Thread(this,"my runnable thread");
        System.out.println("my thread created" + myThreat);
        myThreat.start();
    }

    public Thread getMyThreat(){
        return myThreat;
    }

//    Bước 2: Override lại phương thức run và thực hiện việc đếm tới 10:

    @Override
    public void  run(){
        try{
            for (int i = 0; i <10 ; i++) {
                System.out.println("Printing the count " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("my thread interrupted");
        }
        System.out.println("my thread run is over");
    }
}
//Bước 3: Tạo lớp Main và gọi tới phương thức getThread để thực hiện việc đếm