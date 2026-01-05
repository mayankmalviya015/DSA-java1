// problem : given an array of marks of students , if the marks of any student is less than 35 print its roll number.[roll number here refer to the index of array]
public class rollnumber {
    public static void main(String[] args) {
        int[] arr = {45 ,12 ,75 ,45 ,32 ,61 ,2 ,41 ,5 ,25};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]< 35) System.out.println( i);
        }

    }
    
}