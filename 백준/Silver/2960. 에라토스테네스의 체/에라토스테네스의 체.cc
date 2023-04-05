#include <bits/stdc++.h>
using namespace std;

int main(){
    int N, K;
    cin >> N >> K;
    bool flag = false;
    int cnt = 0;
    int arr[N+1] = {0};
    for (int i = 2; i <= N; i++) {
        for (int j = i; j <= N; j+=i) {
            if (arr[j] == 0) {
                arr[j] -= 1;
                cnt++;
                if (cnt == K) {
                    cout << j;
                    flag = true;
                    break;
                }
            }
        }
        if (flag) {
            break;
        }
    }
}