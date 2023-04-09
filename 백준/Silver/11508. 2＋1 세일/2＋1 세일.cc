#include <bits/stdc++.h>
using namespace std;

int main() {
  int N;
  cin >> N;
  vector<int> vec(N);
  while(N--) {
    int val;
    cin >> val;
    vec.push_back(val);
  }
  sort(vec.begin(), vec.end(), greater<>());
  int ans = 0;
  for (int i = 0; i < vec.size(); i++) {
    if ((i+1) % 3 == 0) continue;
    else {
      ans += vec[i];
    }
  }
  cout << ans;
  return 0;
}