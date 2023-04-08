#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
int main() {
  ll N;
  cin >> N;
  ll arr[N];
  for (ll i = 0 ; i < N; i++) {
    cin >> arr[i];
  }
  sort(arr, arr+N, greater<>()); // 내림차순

  ll ans = 0;
  for (ll i = 0; i < N; i++) {
    ll tmp = arr[i] - i;
    if (tmp > 0) ans += tmp;
  }
  cout << ans;
  return 0;
}