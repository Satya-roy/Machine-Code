package vehicle;

public class Scotter {
    private int id;
    private int regNo;
    private boolean isAvailable;
    private boolean isDamaged;
    public Scotter(int id, int regNo, boolean isAvailable, boolean isDamaged) {
        this.id = id;
        this.regNo = regNo;
        this.isAvailable = isAvailable;
        this.isDamaged = isDamaged;
    }
}
