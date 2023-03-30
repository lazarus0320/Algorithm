#include <bits/stdc++.h>
using namespace std;
int main() {
  ios::sync_with_stdio(false);
  cin.tie(0);
  
  int N;
  cin >> N;
  deque<pair<int, int>> dq;
  for (int i = 0; i < N; i++) {
    int val;
    cin >> val;
    dq.push_back({i+1, val});
  }
  while (!dq.empty()) {
    int index = dq.front().first;
    int num = dq.front().second;
    cout << index << " ";
    dq.pop_front();

    if (dq.empty()) break;

    if (num > 0) {
      for (int i = 0; i < num-1; i++) {
        dq.push_back(dq.front());
        dq.pop_front();
      }
    }
    else {
      for (int i = 0; i > num; i--) {
        dq.push_front(dq.back());
        dq.pop_back();
      }
    }
  }

  return 0;
}