public class Main {
    public static void main(String[] args) {
   Planet planets = Planet.EARTH;
   switch (planets){
       case EARTH:
           System.out.println("The Earth is blue planet");
           break;
       case MARS:
           System.out.println("The Mars is red planet");
           break;
       case JUPITER:
           System.out.println("Jupiter is the biggest planet");
           break;
       case SATURN:
           System.out.println("Saturn is gas planet");
           break;
       default:
           System.out.println();
   }
    }
}