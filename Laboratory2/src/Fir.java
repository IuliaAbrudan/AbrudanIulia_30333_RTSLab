import java.util.Observable;
import java.util.Observer;

public class Fir extends Observable implements Runnable {

    Model model;

    Window win;

    int processorLoad;

    Thread t;

    Fir(int id, int priority, Model model, Window win, int procLoad) {

        this.model = model;

        this.win = win;

        this.processorLoad = procLoad;

        this.setFirId(id);

        this.t = new Thread(this);

        t.setPriority(priority);

        //this.addObserver(win);

    }

    public void start(){
       this.t.start();
    }

    public void setFirId(int id) {
        model.setId(id);
    }

    public void setFirVal(int val) {
        model.setVal(val);
    }

    public int getFirId() {
        return model.getId();
    }

    public int getFirVal() {
        return model.getVal();
    }

    public void run() {

        int c = 0;

        while (c < 1000) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            c++;
            setFirVal(c);
            setChanged();
            notifyObservers();
        }
    }
}

