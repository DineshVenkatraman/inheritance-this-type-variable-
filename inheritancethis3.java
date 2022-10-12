class produtA
{
    produtA()
    {
        this(50);
        System.out.println("A's Default Constructer");
    }
    produtA(int no)
    {

        System.out.println("A's Parametric Constructer "+no);
    }
}
class produtB extends produtA
{
    produtB()
    {
        this(100);
        System.out.println("B's Default Constructer");
    }
    produtB(int no)
    {

        System.out.println("B's Parametric Constructer "+no);
    }
}
class produtC extends produtB
{
    produtC()
    {
        this(150);
        System.out.println("C's Default Constructer");
    }
    produtC(int no)
    {

        System.out.println("C's Parametric Constructer "+no);
    }
}
class inheritancethis3
{
    public static void main(String args[])
    {
        produtC proC=new produtC();


    }
}








