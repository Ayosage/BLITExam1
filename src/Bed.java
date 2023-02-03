public class Bed {

    String style;
    int pillows;
    int height;
    int sheets;
    int quilt;

    public  Bed(String style, int pillows, int height, int sheets, int quilt){
    this.style = style;
    this.pillows = pillows;
    this.height = height;
    this.sheets = sheets;
    this.quilt = quilt;

    }

    public void makeBed(){
        System.out.print("Bed -> Making bed | ");
    }

    public String getStyle() {
        return this.style;
    }

    public int getPillows(){
        return pillows;
    }

    public int getHeight(){
        return height;
    }

    public int getSheets(){
        return sheets;
    }

    public int getQuilt(){
        return quilt;
    }
}
