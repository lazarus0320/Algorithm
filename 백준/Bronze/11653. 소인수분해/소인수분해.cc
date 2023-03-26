#include <bits/stdc++.h>
using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(0);

  int N;
  cin >> N;
  for (int i = 2; i <= N; i++) {
    while ( N % i == 0 ) { //약수?
      N /= i;
      cout << i << '\n';
    }
  }
  return 0;
}