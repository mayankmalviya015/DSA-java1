public class SubSets {
    public static void print(int i ,String s , String ans){
        if(i== s.length()){
            System.out.println(ans);
            return;
        }
        char ch =s.charAt(i);
        print(i+1,s,ans+ch);
        print(i+1,s,ans);
    }
    public static void main(String[] args) {
        String s = "abc";
        print(0,s," ");
    }
}
