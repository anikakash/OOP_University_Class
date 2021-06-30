package com.company;

public class OurThread extends Thread{
    //Thread is a java class so just inherit this class using extends key

    //-----------variable------------
    private String threadName;
    private int startingPoint;
    private int counter;
    private int adder;
    private int timeDifference;
    private OurThread dependentThread;

    private boolean threadAliveFlag;

    //------------------Constructor-------------------

    public OurThread(String threadName, int startingPoint,OurThread dependentThread,
                     int adder, int timeDifference, boolean threadAliveFlag) {
        this.threadName = threadName;
        this.startingPoint = startingPoint;
        this.dependentThread = dependentThread;
        this.adder = adder;
        this.timeDifference = timeDifference;
        this.threadAliveFlag = threadAliveFlag;
    }

    //--------------Run Method---------------------
    @Override
    public void run() {
        counter = startingPoint;
        if(dependentThread!=null){
            try{
                dependentThread.join();
            }catch (InterruptedException e1){
                e1.printStackTrace();
            }
        }

        while (threadAliveFlag){
            counter+=adder;
           try{
               sleep(timeDifference);
           }catch (InterruptedException e){
               e.printStackTrace();
           }
        }
    }

    public void stopThread(){
        threadAliveFlag = false;
    }

    //---------------Getter And Setter---------------------
    public String getThreadName() {
        return threadName;
    }

    public void setThreadName(String threadName) {
        this.threadName = threadName;
    }

    public int getStartingPoint() {
        return startingPoint;
    }

    public void setStartingPoint(int startingPoint) {
        this.startingPoint = startingPoint;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public int getAdder() {
        return adder;
    }

    public void setAdder(int adder) {
        this.adder = adder;
    }

    public int getTimeDifference() {
        return timeDifference;
    }

    public void setTimeDifference(int timeDifference) {
        this.timeDifference = timeDifference;
    }

    public boolean isThreadAliveFlag() {
        return threadAliveFlag;
    }

    public void setThreadAliveFlag(boolean threadAliveFlag) {
        this.threadAliveFlag = threadAliveFlag;
    }
}
