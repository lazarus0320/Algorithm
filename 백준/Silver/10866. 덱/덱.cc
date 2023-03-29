#include <bits/stdc++.h>
using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(0);
  deque <int> D;
  string com = "";
  int N;
  cin >> N;
  while(N--){
    cin >> com;
    if(com == "push_front") {
      int num;
      cin >> num;
      D.push_front(num);
    }
    else if(com == "push_back") {
      int num;
      cin >> num;
      D.push_back(num);
    }
    else if(com == "pop_front") {
      if (D.empty()) cout << -1 << '\n';
      else {
        cout << D.front() << '\n';
        D.pop_front();
      }
    }
    else if(com == "pop_back") {
      if (D.empty()) cout << -1 << '\n';
      else {
        cout << D.back() << '\n';
        D.pop_back();
      }
    }
    else if (com == "size") cout << D.size() << '\n';
    else if (com == "empty") {
      if (D.empty()) cout << 1 << '\n';
      else cout << 0 << '\n';
    }
    else if (com == "front") {
      if (D.empty()) cout << -1 << '\n';
      else cout << D.front() << '\n';
    }
    else if (com == "back") {
      if (D.empty()) cout << -1 << '\n';
      else cout << D.back() << '\n';
    }
  }
  return 0;
}