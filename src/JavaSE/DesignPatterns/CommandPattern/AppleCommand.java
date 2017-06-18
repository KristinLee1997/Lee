package JavaSE.DesignPatterns.CommandPattern;

/**
 * Created by Administrator on 2017/6/15.
 */
public class AppleCommand extends Command {
    public AppleCommand(Peddler peddler) {
        super(peddler);
    }

    @Override
    public void sall() {
        this.getPeddler().sallApple();
    }
}
