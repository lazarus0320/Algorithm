#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
int main() {
  /**
   * 비싼 곳에서는 다음 도시까지의 거리만큼만 사고,
   * 제일 싼 곳에서 존나 다 산다.
   * 
   * 최소값의 도시에서는 남아있는 거리만큼 다 산다.
   * 
   */
  int cityNum;
  cin >> cityNum;
  int loadLength[cityNum-1];
  int cityPrice[cityNum];
  ll totalLoad = 0;
  for (int i = 0; i < cityNum-1; i++) {
    cin >> loadLength[i];
    totalLoad += loadLength[i];
  }
  
  for (int i = 0; i < cityNum; i++) {
    cin >> cityPrice[i];
  }
  int minPrice = 10001;

  ll ans = 0;
  for (int i = 0; i < cityNum-1; i++) {
    minPrice = min(minPrice, cityPrice[i]);
    ans += minPrice * loadLength[i];
  }
  cout << ans; 

  return 0;
}