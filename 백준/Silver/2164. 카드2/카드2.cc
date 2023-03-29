#include <bits/stdc++.h>
using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(0);
  queue <int> Q;
  int N;
  cin >> N;
  for (int i = 1; i <= N; i++) {
    Q.push(i);
  }
  while(Q.size() > 1) {
    Q.pop();
    int tmp = Q.front();
    Q.pop();
    Q.push(tmp);
  }
  cout << Q.front();
  return 0;
}