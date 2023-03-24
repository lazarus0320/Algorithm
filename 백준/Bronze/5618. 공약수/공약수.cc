#include <bits/stdc++.h>
using namespace std;
int main(void) {
  ios::sync_with_stdio(false);
  cin.tie(NULL);
  vector<int> vec;

  int N;
  cin >> N;
  int arr[N] = {0};
  int min = 100000000; 
  for (int i = 0; i < N; i++) {
    cin >> arr[i];
    if (min > arr[i]) min = arr[i];
  }
  for (int i = 1; i <= min; i++) {
    int check = 0;
    for (auto num: arr){
      if (num % i == 0){
        check++;
      }
    }
    if (check == N){
      vec.push_back(i);
    }
  }
  vector<int> :: iterator iter;
  for (iter = vec.begin(); iter!= vec.end(); iter++) {
    cout << *iter << endl;
  }
}