#include <bits/stdc++.h>
using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(0);
  
  int T = 0;
  bool open = false;
  string answer = "";
  string words = "";
  cin >> T;
  cin.ignore();
  
  while(T--) {
    stack<int> S;
    getline(cin, words);
    for (int i = 0; i < words.size(); i++) {
      char val = words[i];
      if (S.empty() && val == ')') {
        S.push(val);
        break;
      }
      if ( (!S.empty()) && (S.top() == '(' ) && ( val == ')') ) {
        S.pop();
      }
      else {
        S.push(val);
      }
    }
    if (S.empty()) {
      cout << "YES" << '\n';
    }
    else {
      cout << "NO" << '\n';
    }
  }
  
  return 0;
}