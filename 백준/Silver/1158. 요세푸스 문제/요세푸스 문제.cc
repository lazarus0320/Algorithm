#include <bits/stdc++.h>
using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(0);
  queue <int> Q;
  int N, K;
  int idx = 0;
  cin >> N >> K;
  int arr[N+1] = {0};
  for(int i = 1; i <=N; i++) {
   Q.push(i);
  }
  cout << '<';

  while (Q.size() > 1) {
    for (int i = 0; i < K-1; i++) {
      int tmp = Q.front();
      Q.pop();
      Q.push(tmp);
    }
    cout << Q.front() << ", ";
    Q.pop();
  }
  cout << Q.front() << '>';
  return 0;
}