package Tasks;

/* Create a program where you can manipulate a monitor object which has color,
 * dimensions and resolution. Implement actions of creation, update of monitor
 * properties and comparison between two monitors. */

public class Monitor {

    private String color;
    private int dimension; // diagonal
    private int resolutionX;
    private int resolutionY;

    public Monitor(){
        // default constructor
        this.color = "";
        this.dimension = 0;
        this.resolutionX = 0;
        this.resolutionY = 0;
    }

    public Monitor(String c, int d, int rX, int rY){
        this.color = c;
        this.dimension = d;
        this.resolutionX = rX;
        this.resolutionY = rY;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }

    public int getResolutionX() {
        return resolutionX;
    }

    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }

    public void setResolutionY(int resolutionY) {
        this.resolutionY = resolutionY;
    }

    public boolean compare(Monitor m) {
        if (((this.color).equals(m.color) &&
                (this.dimension== m.dimension) &&
                (this.resolutionX== m.resolutionX) &&
                (this.resolutionY== m.resolutionY))){
            System.out.println("They are equal");
            return true;
        } else {
            System.out.println();
            return false;
        }

    }

    public void printEverythingOut(){
        System.out.println("Color: " + this.color);
        System.out.println("Dimension: " + this.dimension);
        System.out.println("Resoultion: " + this.resolutionX + "x" + this.resolutionY);
        System.out.println();
    }

    public static void main(String[] args) {
        Monitor monitor = new Monitor();
        monitor.setColor("dark grey");
        monitor.setDimension(13);
        monitor.setResolutionX(1920);
        monitor.setResolutionY(1080);

        monitor.printEverythingOut();

        Monitor anotherMonitor = new Monitor();
        anotherMonitor.setColor("dark grey");
        anotherMonitor.setDimension(13);
        anotherMonitor.setResolutionX(1920);
        anotherMonitor.setResolutionY(1080);

        monitor.compare(anotherMonitor);

    }

}
