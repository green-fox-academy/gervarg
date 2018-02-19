import java.util.Arrays;

public class Exercise_07_12_Examples {
    public static void main(String[] args){
        // - Create an array variable named `q`
        //   with the following content: `[4, 5, 6, 7]`
        // - Print the third element of `q`
        int[] q = {4, 5, 6, 7};
        System.out.println(q[2]);
        // - Create an array variable named `p1`
        //   with the following content: `[1, 2, 3]`
        // - Create an array variable named `p2`
        //   with the following content: `[4, 5]`
        // - Print if `p2` has more elements than `p1`
        int[] p1 = {1,2,3};
        int[] p2 = {4,5};
        if (p1.length < p2.length){
            System.out.println(Arrays.toString(p1));
        } else {
            System.out.println(Arrays.toString(p2));
        }
        // - Create an array variable named `r`
        //   with the following content: `[54, 23, 66, 12]`
        // - Print the sum of the second and the third element
        int[] r = {54,23,66,12};
        System.out.println(r[1]+r[2]);
        // - Create an array variable named `s`
        //  with the following content: `[1, 2, 3, 8, 5, 6]`
        // - Change the 8 to 4
        // Print the fourth element
        int[] a = {1,2,3,8,5,6};
        a[3] = 4;
        System.out.println(a[3]);
        //- Create an array variable named `t`
        //with the following content: `[1, 2, 3, 4, 5]`
        //- Increment the third element
        //- Print the third element
        int[] t = {1,2,3,4,5};
        t[2]+=1;
        System.out.println(t[2]);
        // - Create an array variable named `af`
        //   with the following content: `[4, 5, 6, 7]`
        // - Print all the elements of `af`
        int[] af = {4,5,6,7};
        for (int i = 0; i < af.length ; i++) {
            System.out.println(af[i]);
        }
    }
}



