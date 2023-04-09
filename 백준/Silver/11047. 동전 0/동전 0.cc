#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
int main() {
  ll N, K;
  cin >> N >> K;
  ll arr[N];
  for (int i = 0; i < N; i++) {
    ll coin;
    cin >> coin;
    arr[i] = coin;
  }
  sort(arr, arr+N, greater<>());
  ll cnt = 0;
  ll idx = 0;
  while (K != 0) {
    if (K / arr[idx] < 1) {
      idx++;
    }
    else {
      cnt += (K / arr[idx]);
      K %= arr[idx];
      idx++;
    }
  }
  cout << cnt;
  return 0;
}