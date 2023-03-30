#include <bits/stdc++.h>
using namespace std;
int main() {
  ios::sync_with_stdio(false);
  cin.tie(0);
  int cnt = 0;
  string stick;
  getline(cin, stick);
  stack<int> S;
  for (int i = 0; i < stick.length(); i++) {
    if (stick[i] == '(') {
      S.push(stick[i]);
    }
    else if (stick[i] == ')' && stick[i-1] == '(') {// 레이저인 경우
      S.pop();
      cnt += S.size();
    }
    else { // 막대 끝의 경우
      S.pop();
      cnt += 1;
    }
  }
  cout << cnt;

  return 0;
}