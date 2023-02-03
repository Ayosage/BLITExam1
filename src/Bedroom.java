public class Bedroom {

    String name;
    Wall wall1;
    Wall wall2;
    Wall wall3;
    Wall wall4;

    Ceiling ceiling;

    Bed bed;
    Lamp lamp;

    public  Bedroom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Bed bed, Lamp lamp){
        this.name = name;
        this.bed = bed;
        this.ceiling = ceiling;
        this.lamp = lamp;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
    }

    public Lamp getLamp(){
        return lamp;
    }

    public void makeBed(){
        System.out.print("Bedroom -> Making bed | ");
        bed.makeBed();
    }



}
