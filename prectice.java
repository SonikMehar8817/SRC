import java.lang.reflect.Array;
import java.util.*;

public class prectice {



    public static void main(String[] args) {

        String [] operations = {"5","8","C","+","D"};
        Stack<Integer> st = new Stack<>();

        for(int i =0;i<operations.length;i++){
            String s = operations[i];
            if(!s.equals("+")&&!s.equals("C")&&!s.equals("D")){
                Integer j = Integer.valueOf(s);
                st.push(j);

            }
            else if(s.equals("+")&&st.size()>=2){
                int a = st.pop();
                int b = st.pop();
                st.push(b);
                st.push(a);
                st.push(a+b);
            }
            else if(s.equals("D")&&!st.isEmpty()){
                int a = st.pop();
                st.push(a);
                st.push(a*2);
            }
            else if(s.equals("C")&!st.isEmpty()){
              st.pop();
            }

        }
    }
}
