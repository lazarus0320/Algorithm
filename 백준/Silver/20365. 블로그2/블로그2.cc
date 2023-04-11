#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

int N;
string word;
int R = 0, B = 0;

int main() {
  ios::sync_with_stdio(0);
  cin.tie(0);
  cout.tie(0);

  cin >> N >> word;

  if (word[0] == 'B') B++;
  else R++;

  for (int i = 1; i < N; i++) {
    if (word[i] == 'B' && word[i-1] == 'R') B++;
    if (word[i] == 'R' && word[i-1] == 'B') R++;
  }
  cout << min(R, B) + 1;
  return 0;
}