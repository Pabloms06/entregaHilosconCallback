public class Thread2 extends Thread{

    Principal Principal;

    public Thread2(Principal Principal) {
        this.Principal = Principal;
    }


    public void run() {
        try {
            {
                System.out.println("Entrada - Salgo");
                for (int i = 0; i = numero; i++) {
                    System.out.println("Repeticion " + i);
                }
                System.out.println("TheardUno - Salgo");
            }
        } catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}

