package app;


public class ThreadLoop implements Runnable{
    private boolean teste = true;
    
    public ThreadLoop() {
        new Thread(this).start();
    }

    @Override
    public void run() {
        try {
            while (teste) {
                System.out.println("Ainda rodando o loop...");
                Thread.sleep(500);
            }
            System.out.println("Fim do loop...");
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }

    public void setTeste(boolean teste) {
        this.teste = teste;
    }

    
}