public class Re_Arrange1 {
    public static int[] reArrange(int[] a, int x) {
        int[] less = new int[a.length];
        int[] equal = new int[a.length];
        int[] greater = new int[a.length];
        int lessCount = 0, equalCount = 0, greaterCount = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] < a[x]) {
            	less[lessCount++] = a[i];
            } else if (a[i] == a[x]) {
                equal[equalCount++] = a[i];
            } else {
                greater[greaterCount++] = a[i];
            }
        }

        int[] b = new int[a.length];
        int index = 0; 

        for (int i = 0; i < lessCount; i++) {
            b[index++] = less[i];
        }
        for (int i = 0; i < equalCount; i++) {
            b[index++] = equal[i];
        }
        for (int i = 0; i < greaterCount; i++) {
            b[index++] = greater[i];
        }
        return b;
    }


    public static void main(String[] args) {
        int[] a = {3,5,2,6,8,4,4,6,4,4,3};
        int x = 5;
        int[] b = reArrange(a, x);
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }
}