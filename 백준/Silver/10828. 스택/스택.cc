#include <bits/stdc++.h>
using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(0);
  stack<int> S;
  int N = 0, value = 0;
  string command = "";
  cin >> N;
  
  for (int i = 0; i < N; i++) {
    cin >> command;
    if(command == "push") {
      cin >> value;
      S.push(value);
    }
    else if(command == "pop") {
      if (S.empty()) cout << -1 << '\n';
      else {
        cout << S.top() << '\n';
        S.pop();
      }
      

    }
    else if(command == "size") {
      cout << S.size() << '\n';
    }
    else if(command == "empty") {
      if (S.empty()) cout << 1 << '\n';
      else cout << 0 << '\n';
    }
    else if(command == "top") {
      if (S.empty()) cout << -1 << '\n';
      else {
        cout << S.top() << '\n';
      }
    }
  }

  return 0;
}