package level17.lvl6;

public class Solution1 {
    private static volatile int proposal=0;
    public static void main(String[] args) {
    new  MakeProposal().start();
    new AcceptProposal().start();
    }

    public static class MakeProposal extends Thread{

        @Override
        public void run() {
            int thisProposal=proposal; //=0
            while (proposal<10){
                if(proposal==9){
                    Thread.yield();
                }
                System.out.println("Предложение #"+(thisProposal+1));
                proposal=++thisProposal;
                try {
                    Thread.sleep(100);
                }catch (InterruptedException e){

                }
            }
        }
    }
    public static class AcceptProposal extends Thread{
        @Override
        public void run() {
            int thisPr=0;
            while (thisPr<10){
                if(thisPr!=proposal){
                    System.out.println("принято предложение "+proposal);
                    thisPr++;
                }
            }
        }
    }
}
