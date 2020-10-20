public class Thread1 extends Thread {
    Principal Principal;

    public Thread1(Principal principal) {
        this.Principal = Principal;
    }


    public void run() {
        try {
            System.out.println("Numero aleatorio entre 4 y 20");
            Thread.sleep(2000);
            int numero = (int) (Math.random() * 20 + 1);
            System.out.println(numero);
            System.out.println("TheardUno - Salgo");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}


