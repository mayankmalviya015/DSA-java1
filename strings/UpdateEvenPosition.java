public class UpdateEvenPosition {
    public static void main(String[] args) {
        String s ="physics wallah skills";
        String t ="";
        for(int i =0; i< s.length(); i++){
            if(i%2==0){
                t = t+'a';
            }else t += s.charAt(i);
        }
        s = t;
        System.out.println(t);
    }
}
