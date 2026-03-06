public class TraversalonString{
    public static void print(int i , String s){
        if(i==s.length())return;
        System.err.print(s.charAt(i));
        print(i+1,s);
    }
    public static void main(String[] args) {
        String s = "mayank malviya";
        print(0,s);
    }
}