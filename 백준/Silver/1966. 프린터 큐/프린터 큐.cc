#include <bits/stdc++.h>
using namespace std;
int main() {
  int cycle, n, m;
  int count = 0;
  cin >> cycle;
  while(cycle--) {
    count = 0;
    queue<pair<int, int>> q;
    priority_queue<int>pq;
    cin >> n >> m;
    for (int i = 0; i < n; i++) {
      int val;
      cin >> val;
      q.push({i, val});
      pq.push(val);
    }
    while (!q.empty()){
      int index = q.front().first;
      int pVal = q.front().second;
      q.pop();
      if (pq.top() == pVal) {
        pq.pop();
        count++;
        if (index == m) {
          cout << count << '\n';
        }
      }
      else {
        q.push( {index, pVal });
      }
    }
  }
  return 0;
}