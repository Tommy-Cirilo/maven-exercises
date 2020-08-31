import com.google.common.math.DoubleMath;
import com.google.common.math.IntMath;

public class GuavaTesting {
    public static void main(String[] args) {
        double num = Math.PI;

        System.out.println(num);
        System.out.println(DoubleMath.isMathematicalInteger(num));

        int largeNum = Integer.MAX_VALUE;
        System.out.println(IntMath.checkedAdd(largeNum, 1));
        System.out.println(largeNum + 1);

        String nameTag = "Hello, My Name is Joe!";
        String[] cutUpTag = nameTag.split(",");
        System.out.println(cutUpTag.length);

        for (int i = 0; i < cutUpTag.length; i++){
            System.out.println(cutUpTag[i]);
        }
    }
}
