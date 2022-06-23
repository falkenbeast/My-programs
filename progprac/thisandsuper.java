package programs.progprac;
class base1
{
    int ab = 10;
}
class base2 extends base1
{
    int ab = 20;
    void print(int ab)
    {
        
        System.out.println(ab);
        System.out.println(this.ab);
         System.out.println(super.ab);
    }
}
class thisandsuper
{
    public static void main(String [] args)
    {
        base2 obj = new base2();
        obj.print(30);

    }
}