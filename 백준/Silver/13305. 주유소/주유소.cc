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
  ll cityNum;
  cin >> cityNum;
  ll loadLength[cityNum-1];
  ll cityPrice[cityNum];
  ll totalLoad = 0;
  for (ll i = 0; i < cityNum-1; i++) {
    cin >> loadLength[i];
    totalLoad += loadLength[i];
  }
  ll minPrice = 10001;
  for (ll i = 0; i < cityNum-1; i++) {
    cin >> cityPrice[i];
    minPrice = min(minPrice, cityPrice[i]);
  }
  cin >> cityPrice[cityNum];


  ll currentLength = 0;
  ll currentCity = 0;
  ll ans = 0;
  while (currentLength != totalLoad){
    if (cityPrice[currentCity] == minPrice) {
      ans += ((totalLoad - currentLength) * minPrice);
      cout << ans;
      return 0;
    }
    else {
      ans += (cityPrice[currentCity] * loadLength[currentCity]); // 다음 도시까지 필요한 만큼만 구매
      currentLength += loadLength[currentCity]; // 다음 도로의 길이만큼 추가 진행
      currentCity++; // 다음 도시로 이동
    }
  }

  return 0;
}