#include <bits/stdc++.h>
using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(0);
  
  int N = 0, num = 0;
  string com = "";
  queue<int> Q;
  cin >> N;
  while(N--) {
    cin >> com;
    
    if(com == "push") {
      cin >> num;
      Q.push(num);
    }
    else if(com == "pop") {
      if(Q.empty()) {
        cout << -1 << '\n';
      }
      else {
        int pop = Q.front();
        cout << pop << '\n';
        Q.pop();
      }
    }
    else if(com == "size") {
      cout << Q.size() << '\n';
    }
    else if(com == "empty") {
      if(Q.empty()) cout << 1 << '\n';
      else cout << 0 << '\n';
    }
    else if(com == "front") {
      if(Q.empty()) cout << -1 << '\n';
      else {
        cout << Q.front() << '\n';
      }
    }
    else if(com == "back") {
      if(Q.empty()) cout << -1 << '\n';
      else {
        cout << Q.back() << '\n';
      }
    }
  }
  
  return 0;
}