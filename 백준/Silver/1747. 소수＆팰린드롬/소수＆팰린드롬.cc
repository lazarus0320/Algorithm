#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

int main () {
  ios::sync_with_stdio(0);
  cin.tie(0);

  string N;
  cin >> N;

  bool arr[1010001];
  memset(arr, true, sizeof(arr)); // 전부 true로 초기화
  arr[0] = false; arr[1] = false;
  for (ll i =2; i <= sqrt(1010000); i++) {
    if (arr[i]) { // 만약 소수를 만났다?
      //소수에 어떤 값을 곱해도 합성수이므로 그 배수들을 전부 false처리.
      for(ll j=i*i; j <= 1010000; j+=i){
        arr[j] = false;
      }
    }
  }
  
  for (ll i = stoi(N); i <= 1010000; i++) {
    if (arr[i]){
      string rN = to_string(i);
      string N = rN;
      reverse(rN.begin(), rN.end());
      if (rN == N) {
        cout << i;
        break;
      }
    }
  }
  return 0;
}