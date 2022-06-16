  class plant  
{
        public static String name;
        public final static int id =8;
        private String type;
        public plant()
        {
                this.name = "ayush";
                this.type = "plant";
        }
}

class oak extends plant 
{
        public oak()
        {
              //type = "tree"; // cannot take private variables
        }
}
public class publicpriv {

        public static  void main(String [] args)
        {
                plant p = new plant();
                System.out.println(plant.name);
                System.out.println(plant.id);
               // System.out.println(plant.type);    not work on private variables
              // protected is used in same packeage and subclasses
        }
}
