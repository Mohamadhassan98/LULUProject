package LULU;

import java.util.ResourceBundle;

class Sample
{
    final int i = 2, j = 3, k = 12;

    public static void main(String[] args)
    {
        System.out.println(ResourceBundle.getBundle("LULUStrings").getString("hello"));
        System.out.println(String[].class);
    }
//    public static void LULU.main(String[] args)
//    {
//        new Sample();
//    }
//
//    public boolean isBool()
//    {
//        return bool;
//    }
//
//    public void setBool(boolean bool)
//    {
//        this.bool = bool;
//    }
//
//    boolean bool;
//
//    final int a;
//
//    Sample()
//    {
//        a = 2;
//        String aa = "\0";
//        //
//    }
//
//    int rrr;
//    UserDefinedType myType = new UserDefinedType("s", 21);
}
