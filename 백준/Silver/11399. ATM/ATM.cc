#include <bits/stdc++.h>
using namespace std;

int main() {
  int N;
  cin >> N;
  int arr[N];
  for (int i = 0 ; i < N; i++) {
    cin >> arr[i];
  }
  sort(arr, arr+N);
  int cnt = 0, idx = 0, ans = 0;
  while (cnt < N) {
    idx = 0;
    while (idx <= cnt) {
      ans += arr[idx];
      idx++;
    }
    cnt++;
  }
  cout << ans;
  return 0;
}