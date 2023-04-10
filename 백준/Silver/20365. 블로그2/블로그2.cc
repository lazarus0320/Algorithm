#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
int main() {
  ios_base::sync_with_stdio(false);
  cin.tie(0);
  /**
   * 1. 연속으로 복수 개수를 칠할 수 있다.
   * 2. 단일 한 개만 칠할 수있다.
   * 3. 선택된 문제는 모두 같은 색으로 칠한다.
   * 4. 각 행동시 cnt++;
   * 
   * BBBRRBRBBBR -> 4
   * 1. 현재값과 다음값이 다를 경우 -> 
   * BBRBRRBRB
   * 그냥 전체 B로 들이붓고 카운트 1 증가
   * 입력값 마지막에 공백 추가
   * 반복문 돌리면서 비교 R이 시작되면 다음 값이 R이 아닌 경우에만(B이거나 공백인 경우) 카운트 1 증가
   */
  ll N;
  cin >> N;
  string word;
  cin >> word;
  word += ' ';
  ll cnt = 1;

  if ( (word[0] == 'B') || (word[word.length()-1] == 'B') ) {
    for (ll i = 0; i < word.length()-1; i++) {
      if (word[i] == 'R' && word[i+1] != 'R') cnt++;
    }
  }
  else if ( (word[0] == 'R') || (word[word.length()-1] == 'R') ) {
    for (ll i = 0; i < word.length()-1; i++) {
      if (word[i] == 'B' && word[i+1] != 'B') cnt++;
    }
  }
  
  cout << cnt;

  return 0;
  
}