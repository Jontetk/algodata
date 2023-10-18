public class MeasTest {
    public static void main(String[] args) {
        Meassure mess = new Meassure("postnummer.csv");
        mess.collisions(10000); 
        mess.collisions(11000); 
        mess.collisions(12000); 
        mess.collisions(13000);
        mess.collisions(15000); 
        mess.collisions(16000); 
        mess.collisions(17000); 
        mess.collisions(18000);
        mess.collisions(19000); 
        mess.collisions(20000);
        mess.collisions(12345);
        mess.collisions(13513);
        mess.collisions(13600);
        mess.collisions(14000);


    }
}
