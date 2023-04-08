#include <bits/stdc++.h>
using namespace std;

int main() {
  string board;
  string ans;
  int cnt = 0;
  cin >> board;
  board += " ";
  for (int i = 0; i < board.size()-1; i++) {
    if (board[i] == 'X') {
      cnt++;
    }
    if (cnt == 2 && board[i+1] != 'X') {
      ans += "BB";
      cnt = 0;
    }
    if (board[i] == '.') {
      if (cnt % 2 == 1) {
        cout << -1;
        return 0;
      }
      ans += '.';
      cnt = 0;
    }
    if (cnt == 4) {
      ans += "AAAA";
      cnt = 0;
    }
  }
  if (cnt % 2 == 1) cout << -1;
  else cout << ans;
  return 0;
}