#include <bits/stdc++.h>
using namespace std;
int main(void) {
  ios::sync_with_stdio(false);
  cin.tie(NULL);

  int N, cowNum, pos;
  int cnt = 0;
  cin >> N;
  int arr[N+1] = {0};
  fill_n(arr, N+1, -1);
  for (int i = 0; i < N; i++) { // 소 번호, 위치 입력
    cin >> cowNum >> pos;
    if (arr[cowNum] == -1) {
      arr[cowNum] = pos;
    }
    else if (arr[cowNum] != -1 && arr[cowNum] != pos){
      cnt++;
      arr[cowNum] = pos;
    }
  }
  cout << cnt;
}