package org.example;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        int ans = add(4,5);
        System.out.println(ans);
    }

    static int add(int x, int y){
        System.out.println("adding sum x and y");
        return x+y;
    }

}
