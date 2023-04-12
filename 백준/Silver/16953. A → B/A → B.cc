#include <bits/stdc++.h>
using namespace std;
int main() {
  string A, B;
  cin >> A >> B;
  int cnt = 0;

  while ( stoi(A) < stoi(B) ) {
    if (stoi(B) % 2 == 0) {
      B = to_string(stoi(B) / 2);
      cnt++;
    }
    else {
      if (B[B.length()-1] != '1') {
        cout << -1;
        return 0;
      }
      B.erase(B.end()-1);
      cnt++;
    }
    if (A == B) {
      cout << cnt+1;
      return 0;
    }
  }
  cout << -1;
  return 0;
}