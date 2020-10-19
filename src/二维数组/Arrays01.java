package 二维数组;

//Arrays的应用
import com.company.A;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        //如果两个指定的int数组彼此 相等 ，则返回 true
        System.out.println("-----equals(arr1,arr2)方法-----");
        int[] arr1={20,79,59,90};
        int[] arr2={34,45,43,22};
        System.out.println("判断两个数组元素是否相等");
        System.out.println(""+ Arrays.equals(arr1,arr2));

       // 按升序排列数组的指定范围。
        System.out.println("----tostring(arr1)方法-----");
        System.out.println("将arr1数组转换成一个字符串"+ Arrays.toString(arr1));




//        将指定的int值分配给指定的int数组的指定范围的每个元素。
//        要填充的范围从索引fromIndex扩展到索引toIndex ，排他。 （如果fromIndex==toIndex ，要填充的范围是空的。）
        System.out.println("-----fill(array,val)方法-----");
        int[] arr4={56,65,54,23};
        Arrays.fill(arr4,88);//取下标范围 不包括最后的下标
        System.out.println("将arr4数组中的元素替换成新内容"+ Arrays.toString(arr4));



//        复制指定的数组，用零截取或填充（如有必要），以便复制具有指定的长度。
//        对于原始数组和副本都有效的所有索引，两个数组将包含相同的值。 对于在副本中而不是原件有效的任何索引，副本将包含0 。
//        当且仅当指定长度大于原始数组的长度时，这些索引才会存在。
        System.out.println("----copyof(array.length)-----");
        int[] arr5={20,28,34,25};
        int[] arr6=Arrays.copyOf(arr5,4);//把一个数组里的值复制到另一个数组
        System.out.println("将arr5数组中的元素复制到arr6新的数组中:"+Arrays.toString(arr6));
        int[] arr7=Arrays.copyOf(arr5,6);
        System.out.println("将arr5数组中的元素复制到arr6新的数组中"+Arrays.toString(arr7));




//        使用二叉搜索算法搜索指定值的指定数组的范围。
//        在进行此呼叫之前，范围必须按照sort(int[], int, int)方法进行排序。 如果没有排序，结果是未定义的。
//        如果范围包含具有指定值的多个元素，则不能保证将找到哪个元素
        System.out.println("-----binarySearch------");
        int[] arr8={23,24,34,35};
        Arrays.sort(arr8);//必须是排序之后才能取下标
        int index= Arrays.binarySearch(arr8,23);
        System.out.println("查询元素值23在数组arr8中的下标是"+index);

    }
}
