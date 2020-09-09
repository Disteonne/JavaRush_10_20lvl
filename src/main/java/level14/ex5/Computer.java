package level14.ex5;

public class Computer {
    private KeyBoard keyBoard;
    private Monitor monitor;
    private Mouse mouse;

    public Computer(KeyBoard keyBoard,Monitor monitor,Mouse mouse) {
        this.keyBoard=keyBoard;
        this.monitor=monitor;
        this.mouse=mouse;
    }

    public KeyBoard getKeyBoard() {
        return keyBoard;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Mouse getMouse() {
        return mouse;
    }
}
