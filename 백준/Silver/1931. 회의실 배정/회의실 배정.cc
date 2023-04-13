#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

bool sortBySecond(const pair<int, int>&a, const pair<int, int>&b ) {
  if (a.second != b.second) {
    return a.second < b.second;
  }
  else {
    return a.first < b.first;
  }
}

int main() {
  vector<pair<int, int>> vec;

  int N;
  cin >> N;

  while(N--) {
    int a, b;
    cin >> a >> b;
    vec.push_back(make_pair(a, b));
  }
  
  sort(vec.begin(), vec.end(), sortBySecond);

  int cnt = 1;
  int curIdx = 0;
  for (int i = 1; i < vec.size(); i++) {
    if (vec[curIdx].second <= vec[i].first) {
      curIdx = i;
      cnt++;
    }
  }
  cout << cnt;
  return 0;
}