package JavaSE.DesignPatterns.CommandPattern;

/**
 * Created by Administrator on 2017/6/15.
 */
public abstract class Command {
    private Peddler peddler;

    public Command(Peddler peddler) {
        this.peddler = peddler;
    }

    public void setPeddler(Peddler peddler) {
        this.peddler = peddler;
    }

    public Peddler getPeddler() {
        return peddler;
    }

    public abstract void sall();
}
