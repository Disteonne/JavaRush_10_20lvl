package level16.sleep;

public class Solution2 {
    private static boolean isStoped=true;
    public static void main(String[] args) throws  InterruptedException{
    Clock clock=new Clock("London",14,59,59);
    Thread.sleep(4000);
    //isStoped=false;

    }
    private static class Clock extends Thread{
        private String cityName;
        private int hours;
        private int minutes;
        private int seconds;

        Clock(String cityName,int hours,int minutes,int seconds){
            this.cityName=cityName;
            this.hours=hours;
            this.minutes=minutes;
            this.seconds=seconds;
            start();
        }

        public String getCityName() {
            return cityName;
        }

        public int getHours() {
            return hours;
        }

        public int getMinutes() {
            return minutes;
        }

        public int getSeconds() {
            return seconds;
        }

        @Override
        public void run() {
            try {
                while (isStoped){
                    printTime();
                }
            }catch (InterruptedException ex){
                ex.getStackTrace();
            }
        }

        private void printTime() throws  InterruptedException{
            Thread.sleep(1000); //каждую секунду
            seconds++;
            if(seconds<60){
                System.out.println("В "+getCityName()+" time: "+hours+" : "+minutes+" : "+seconds);
            }
            if(seconds==60){
                seconds=0;
                minutes++;
                if(minutes<60){
                    System.out.println("В "+getCityName()+" time: "+hours+" : "+minutes+" : "+seconds);
                }
                else if(minutes==60){
                    minutes=0;
                    hours++;
                    if(hours<24)
                    System.out.println("В "+getCityName()+" time: "+hours+" : "+minutes+" : "+seconds);
                    else
                        hours=0;

                }
            }

            if(hours==0 && minutes==0 && seconds==0 ){
                System.out.println("Полночь");
            }

        }


    }
}
