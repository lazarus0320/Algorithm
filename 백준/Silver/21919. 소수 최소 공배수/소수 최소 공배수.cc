#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

ll gcd(ll a, ll b) {
  if ( b == 0 ) return a;
  return gcd(b, a%b);
}

ll lcd(ll a, ll b) {
  return a / gcd(a, b) * b;
}

int main () {
  ios::sync_with_stdio(0);
  cin.tie(0);
  ll ans = 0;

  int N;
  cin >> N;

  bool arr[1000001];
  memset(arr, true, sizeof(arr)); // 전부 true로 초기화

  for (int i =2; i <= sqrt(1000000); i++) {
    if (arr[i]) { // 만약 소수를 만났다?
      //소수에 어떤 값을 곱해도 합성수이므로 그 배수들을 전부 false처리.
      for(int j=i*i; j <= 1000000; j+=i){
        arr[j] = false;
      }
    }
  }
  vector<int> vec;
  
  while(N--) {
    ll num;
    cin >> num;
    if (arr[num]) { // 소수가 맞으면 vec에 넣기
      vec.push_back(num);
    }
  }
  if (vec.empty()) { // 소수가 없으면 -1 출력
    cout << -1; 
  }
  else {
    ans = vec[0];
    for (int i = 0; i < vec.size()-1; i++) {
      ans = lcd(ans, vec[i+1]);
    }
    cout << ans;
  }
  
  return 0;
}