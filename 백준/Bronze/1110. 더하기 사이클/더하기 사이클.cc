#include <bits/stdc++.h>
using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(0);

  int N, digits[2];
  int cycle = 1;
  cin >> N;
// 한자리씩 나누기
  if ( N < 10) {
      digits[0] = 0;
      digits[1] = N;
    }
    else {
      digits[0] = N / 10;
      digits[1] = N % 10;
    }

  while (true){
    
    int tmp = digits[1];
    digits[1] = (digits[0] + digits[1]) % 10;
    digits[0] = tmp;
    if ( (digits[0]*10) + digits[1] == N ) {
      break;
    }
    cycle++;
  }
  cout << cycle;

  return 0;
}