package programs.progprac;

import javax.sql.rowset.spi.SyncFactory;

public class casting {
        public static void main(String[] args) {
                
                System.out.println(Byte.MAX_VALUE);
                System.out.println(Short.MAX_VALUE);
                System.out.println(Integer.MAX_VALUE);
                System.out.println(Long.MAX_VALUE);
                System.out.println(Float.MAX_VALUE);
                System.out.println(Double.MAX_VALUE);
                
                byte a = 10;
                short b = 20;
                int c = 30;
                long d = 40;
                float e = 50.6f;
                double f = 60.7;
                System.out.println();
                System.out.print((int)a+"  ");
                System.out.print((int) b+"  ");
                System.out.print((byte)c+"  ");
                System.out.print((int) d+"  ");
                System.out.print((int)e+"  ");
                System.out.print((int)f);
        }
}
