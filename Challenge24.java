package DPC;
class Challenge24 {
    private static void firstNegativeInteger(int[] arr, int k) {
        int n = arr.length;
        for (int i = 0; i <= n - k; i++) {
            boolean negFound = false;
            for (int j = i; j < i + k; j++) {
                if (arr[j] < 0) {
                    System.out.print(arr[j] + " ");
                    negFound = true;
                    break;
                }
            }
            if (!negFound)
                System.out.print("0 ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = new int[]{-8, 2, 3, -6, 10};
        int k = 2;
        firstNegativeInteger(arr, k);
    }
}