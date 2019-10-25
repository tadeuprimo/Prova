package prova;

public class Threads extends Thread{
    
    public Threads(String str){
        super(str);
    }
    
    public void run(){
        for(int i=0; i<=10; i++){
            System.out.println(i + " " + getName());
            try{
                sleep((long)(Math.random()*100));
            }
            catch (InterruptedException e){}
        }
        System.out.println(getName() + " done.");
    }
}
