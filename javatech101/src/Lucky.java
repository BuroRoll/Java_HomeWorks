public class Lucky {
    static int count = 0;
    static int x = 0;
    static class LuckyThread extends Thread {
        ResourceObject res;

        LuckyThread(ResourceObject res){
            this.res = res;
        }

        @Override
        public void run() {
            res.count();
        }
    }

    static class ResourceObject{
        synchronized void count(){
            while (x < 999999) {
                x++;
                if ((x % 10) + (x / 10) % 10 + (x / 100) % 10 == (x / 1000)
                        % 10 + (x / 10000) % 10 + (x / 100000) % 10) {
                    System.out.println(x);
                    count++;
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ResourceObject res = new ResourceObject();
        Thread t1 = new LuckyThread(res);
        Thread t2 = new LuckyThread(res);
        Thread t3 = new LuckyThread(res);
        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();
        t3.join();
        System.out.println("Total: " + count);
    }
}
