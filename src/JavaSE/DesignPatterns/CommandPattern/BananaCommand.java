package JavaSE.DesignPatterns.CommandPattern;

/**
 * Created by Administrator on 2017/6/15.
 */
public class BananaCommand extends Command {
    public BananaCommand(Peddler peddler) {
        super(peddler);
    }

    @Override
    public void sall() {
        this.getPeddler().sallBanana();
    }
}
