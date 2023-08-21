package DPC;
import java.util.*;
public class Challenge20 {
    public static void main(String[] args) {
        String[] arr = {"abc", "def", "def", "abc", "def"};
        System.out.println(remainingStringCount(arr));
    }
    public static int remainingStringCount(String[] arr){
        ArrayList<String> arrList = new ArrayList<>(Arrays.asList(arr));
        boolean distinct = false;
        do{
            distinct = false;
            for(int i = 0;i<arrList.size()-1;i++){
                if(arrList.get(i)==arrList.get(i+1)){
                    distinct = true;
                    arrList.remove(i);
                    arrList.remove(i);
                }
            }
        }while(distinct);
        return arrList.size();
    }
}
