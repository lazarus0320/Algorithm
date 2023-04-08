#include <bits/stdc++.h>
using namespace std;

int main() {
  int N;
  cin >> N;
  int arr[N];
  for (int i = 0; i < N; i++) {
    cin >> arr[i];
  }
  sort(arr, arr+N, greater<>());
  int weight = -1;
  for (int i = 0; i < N; i++) {
    weight = max(weight, arr[i] * (i+1));
  }
  cout << weight;
  return 0;
}