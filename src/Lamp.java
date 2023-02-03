public class Lamp {
   private String style;
   private Boolean battery;
   private int globRating;

   public Lamp(String style, Boolean battery, int globRating){
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
   }

   public void turnOn(){
       System.out.print("Lamp -> Turning On | ");
   }

   public String getStyle(){
       return this.style;
   }

   public Boolean isBattery(){
       return this.battery;
   }

   public int getGlobRating(){
       return this.globRating;
   }



}
