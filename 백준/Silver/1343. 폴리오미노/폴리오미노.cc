#include <bits/stdc++.h>
using namespace std;
int main() {
  string input;
  cin >> input;
  int cnt = 0;
  string result;
  input += ' ';
  for (int i = 0; i < input.size()-1; i++) {
    if (input[i] == 'X') {
      cnt++;
    }
    if (cnt == 2 && (input[i+1] != 'X')) { // BB박기
      result += "BB";
      cnt = 0;
    }
    if (cnt == 4) {
      result += "AAAA";
      cnt = 0;
    }
    if (input[i] == '.') {
      
      if (cnt % 2 == 1) {
        cout << -1;
        return 0;
      }
      result += '.';
      cnt = 0;
    }
  }
  if (cnt % 2 == 1) cout << -1;
  else cout << result;
  return 0;
}