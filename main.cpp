#include <iostream>
using namespace std;

void findSubarr(int arr[], int n, int sum) {
    int curr_sum = arr[0], start = 0;
    for (int i = 1; i <= n; i++) {
        while (curr_sum > sum && start < i - 1) {
            curr_sum -= arr[start];
            start++;
        }
        if (curr_sum == sum) {
            cout << "Subarray found between index " << start << " and " << i - 1 << " with sum " << sum << ": [";
            for (int j = start; j < i - 1; j++) {
                cout << arr[j] << ", ";
            }
            cout << arr[i - 1] << "]\n";
            return;
        }

        if (i < n) {
            curr_sum += arr[i];
        }
    }

    cout << "No subarray found with sum " << sum <<endl;
}

int main() {
    int arr1[] = {1, 4, 7, 3, 9, 8};
    int s1 = 11;
    int n1 = sizeof(arr1) / sizeof(arr1[0]);
    findSubarr(arr1, n1, s1);

    int arr2[] = {3, 2, 1, 5, 6};
    int s2 = 7;
    int n2 = sizeof(arr2) / sizeof(arr2[0]);
    findSubarr(arr2, n2, 2);

    int arr3[] = {2, 4, 6, 8};
    int s3 = 14;
    int n3 = sizeof(arr3) / sizeof(arr3[0]);
    findSubarr(arr3, n3, s3);

    int arr4[] = {1, 2, 3, 4, 5};
    int s4 = 7;
    int n4 = sizeof(arr4) / sizeof(arr4[0]);
    findSubarr(arr4, n4, s4);

    int arr5[] = {10, 5, 2, 6, 8};
    int s5 = 15;
    int n5 = sizeof(arr5) / sizeof(arr5[0]);
    findSubarr(arr5, n5, s5);

    int arr6[] = {1, 2, 3, 4, 5};
    int s6 = 15;
    int n6 = sizeof(arr6) / sizeof(arr6[0]);
    findSubarr(arr6, n6, s6);

    int arr7[] = {5, 10, 20, 30, 40};
    int s7 = 100;
    int n7 = sizeof(arr7) / sizeof(arr7[0]);
    findSubarr(arr7, n7, s7);

    int arr8[] = {1, 2, 3, 4, 5};
    int s8 = 6;
    int n8 = sizeof(arr8) / sizeof(arr8[0]);
    findSubarr(arr8, n8, s8);

    int arr9[] = {8, 7, 15, 6, 10};
    int s9 = 17;
    int n9 = sizeof(arr9) / sizeof(arr9[0]);
    findSubarr(arr9, n9, s9);

    int arr10[] = {1, 1, 1, 1, 1};
    int s10 = 3;
    int n10 = sizeof(arr10) / sizeof(arr10[0]);
    findSubarr(arr10, n10, s10);

    return 0;
}
