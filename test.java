class test
{
    public static void jug(String a)
    {
        int b = a.length();
        //System.out.println(b);
        //System.out.println(a);
        if (b<=1)
        {
                return;
        }
        System.out.print(a.charAt(a.length()-1));
         jug(a.substring(0, a.length()-1));
    }
    public static void main(String []args)
    {
        jug("ayush srivastava");
    }
}