//Write a program to check whether a year is leap year.
public class program7 {
    public static boolean isleap(int n){
        if(n%4==0) return true;
        if(n%100==0) return true;
        if(n%400==0) return true;
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isleap(2020));
        System.out.println(isleap(2013));
    }
}
