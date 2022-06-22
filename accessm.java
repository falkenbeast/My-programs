import javax.swing.plaf.synth.SynthToolBarUI;

class c1
{
        public int x = 5;
        protected int y = 45;
        int z = 6;
        private int a = 78;
        public void meth1()
        {
                System.out.println(x);         //all can be use in same class
                System.out.println(y);
                System.out.println(z);
                System.out.println(a);

        }

}
class c2
{
        public void meth2()
        {
                c1 c = new c1();
                System.out.println(c.x);
                System.out.println(c.y);
                System.out.println(c.z);      //private cannot be used in subclasses 
        }
}
class accessm
{
        public static void main(String []args)
        {
                c1 o = new c1();
                o.meth1();
                System.out.println("end 1 ");
                System.out.println(o.x);
                System.out.println(o.y);
                System.out.println(o.z);   
                System.out.println("end 2");      // private cannot be used in same package 
                c2 c = new c2();
                c.meth2();
                System.out.println("end 3");
        }
}