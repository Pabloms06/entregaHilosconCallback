public class Principal {

    public Principal() throws Exception{
        System.out.println("Inicio *Hilo 1*");
        Thread1 th1 = new Thread1(this);
        th1.start();
        th1.join();
        System.out.println("Fin");
        System.out.println("Inicio *Hilo 2*");
        Thread2 th2 = new Thread2(this);
        th2.start();
        th2.join();
        System.out.println("Fin");
    }
}
