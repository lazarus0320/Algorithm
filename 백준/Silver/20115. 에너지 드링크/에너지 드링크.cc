#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
int main() {
  
/**
 * 3 2 10 9 6
 * 2 3 6 9 10
 * 10 + 1 + 1.5 + 3 + 4.5
 * 11 + 9 = 20
 * 오름차순 정렬하고,
 * 가장 큰 값에다가 나머지 용액을 절반씩 더한다.
 * 
 */
  int N;
  cin >> N;
  double arr[N];
  for (int i = 0; i < N; i++) {
    cin >> arr[i];
  }
  sort(arr, arr+N);
  double ans = arr[N-1];
  for (int i = 0; i < N-1; i++) {
    ans += arr[i] / 2.0;
  }
  cout << ans;
  return 0;
}