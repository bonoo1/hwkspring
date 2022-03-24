public class Human {
     String name;
     int age;
     int x;
     int y;
     int speed;

     public Human(String name,int age, int speed,int x,int y ){
         this.name = name;
         this.age = age;
         this.speed = speed;
         this.x = x;
         this.y = y;
    }

    public Human(String name, int age , int speed) {
         this(name, age, speed, 0,0);

    }
    public String getLocation() {
         return "(" + x + ", " + y + " )";
    }

    protected void printWhoAmI() {
        System.out.println("My name is" + name + ". " + age + " aged.");
    }
}
























//
//    void currentcoordinates(int x, int y) {
//        printlocation();
//        this.x = x;
//        this.y = y;
//    }
//
//    void speed(int z) {
//        this.z = z;
//    }
//
//    void swim(int z){
//        this.z = z+1;
//    }
//
//    void run(int z){
//        this.z = z+2;
//    }
//
//
//    public void printlocation() {
//        System.out.println("현재위치 ( " + x + y + " 입니다");
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//
//        Humen grandP = new Humen();
//        Humen parents = new Humen();
//        Humen child = new Humen();
//
