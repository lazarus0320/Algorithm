#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
int main() {
  /**
   * 1 2 3 4 5
   * 오름차순 정렬
   * 1 3 5 7 8
   * (1+7), (3+5) 8
   * 9 8 7 4 2
   * 9 (8,2) (7,4) => 11
   * (9,2), (8,4), 7 => 12
   * 8 7 5 3 1
   * 8, (7,1)(5,3) => 8
   * (8,1) (7,3) 7 -> 10
   * (8,1) (5,3) 7 -> 9
   * 7 5 4 3 2 1
   * (7,1) (5, 2) (4,3) --> 8
   */
  int N;
  cin >> N;
  ll arr[N];
  for (int i = 0; i < N; i++) {
    cin >> arr[i];
  }
  sort(arr, arr+N, greater<>());
  vector<ll> vec;
  ll ans = 0;

  if (N % 2 != 0) {
    vec.push_back(arr[0]);

    for (int i = 1; i <= N/2; i++) {
      vec.push_back(arr[i] + arr[N-i]);
    }
  }
  else {
    for (int i = 0; i < N/2; i++) {
      vec.push_back(arr[i] + arr[N-i-1]);
    }
  }
  ans = vec[0];
  for (auto a: vec){
    ans = max(ans, a);
  }
  cout << ans;
  return 0;
  
}