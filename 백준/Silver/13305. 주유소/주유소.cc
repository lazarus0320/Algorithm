#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
int main() {
  ios::sync_with_stdio(false);
  cin.tie(NULL);
  cout.tie(NULL);
  ll cityNum;
  cin >> cityNum;
  ll loadLength[cityNum-1];
  ll cityPrice[cityNum];
  for (ll i = 0; i < cityNum-1; i++) {
    cin >> loadLength[i];
  }
  
  for (ll i = 0; i < cityNum; i++) {
    cin >> cityPrice[i];
  }
  ll minPrice = 10001;

  ll ans = 0;
  for (ll i = 0; i < cityNum-1; i++) {
    minPrice = min(minPrice, cityPrice[i]);
    ans += minPrice * loadLength[i];
  }
  cout << ans;

  return 0;
}