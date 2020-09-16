package rubbish;

public class cl1 {
    public volatile static int proposal = 0;

    public static void main(String[] args) throws InterruptedException {
        new AcceptProposal().start();
        //Thread.currentThread().join();
        new MakeProposal().start();
    }

    public static class MakeProposal extends Thread {
        @Override
        public void run() {
            int thisProposal = proposal;

            while (proposal < 10) {
                if (proposal == 9) {
                    Thread.yield();
                }
                System.out.println("Сделано предложение №" + (thisProposal + 1));
                proposal = ++thisProposal;
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


            }
        }
    }

    public static class AcceptProposal extends Thread {
        @Override
        public void run() {
            int thisProposal = 0;

            while (thisProposal < 10) {
                if (thisProposal != proposal) {
                    System.out.println("Принято предложение №" + proposal);
                    //thisProposal = proposal;
                    thisProposal++;
                }

            }
        }
    }
}
