import com.google.common.base.Splitter;
import com.google.common.math.DoubleMath;
import com.google.common.math.IntMath;

import java.util.ArrayList;
import java.util.Scanner;

public class GuavaTesting {
    public static void main(String[] args) {
        double num = Math.PI;
        System.out.println(num);
        double butInt = 7;

        System.out.println(DoubleMath.isMathematicalInteger(num));
        System.out.println(DoubleMath.isMathematicalInteger(butInt));

        int largeNum = Integer.MAX_VALUE;
        System.out.println(largeNum + 1);
        try {
            System.out.println(IntMath.checkedAdd(largeNum, 1));
        } catch(ArithmeticException e){
            System.err.println("Number is too big");
        }
        String nameTag = "Hello, My Name is Amaro!";
//        String[] cutUpTag = nameTag.split(",");
            ArrayList<String> cutUpTag = new ArrayList<>();
            Splitter.on(",").trimResults().omitEmptyStrings().split(nameTag).forEach(cutUpTag::add);
                System.out.println(cutUpTag.size());
//        for (String s : cutUpTag) {
//            System.out.println(s);
//        }
        for(int i = 0;i < cutUpTag.size(); i++){
            System.out.println(cutUpTag.get(i));
        }

    }}
