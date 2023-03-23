#include <bits/stdc++.h>
using namespace std;
int main(void) {
  int arr[31] = {0};
  for (int i = 1; i <= 28; i++) {
    int num = 0;
    cin >> num;
    arr[num]++;
  }
  for (int i = 1; i <= 30; i++) {
    if (arr[i] == 0) {
      cout << i << '\n';
    }
  }
  return 0;
}