package programs.progprac;

interface bysicle
{
        void brakes(int de);
        void speedup(int in);
}
public class iinterface {
        static int speed = 10;
        static void brakes(int de )
        {
                speed = speed - de;
                System.out.println(speed);
        }
        static void speedup(int in)
        {
                speed = speed+in;
                System.out.println(speed);
        }
        public static void main(String[] args) {
             brakes(4);
             speedup(4);
        }
}
