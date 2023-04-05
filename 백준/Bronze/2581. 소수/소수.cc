#include <bits/stdc++.h>
using namespace std;

bool isPrime(int n) {
    if (n < 2) return false;
    else {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
    }
    return true;
}

int main() {
    int sum = 0, min = 10001;
    int M, N;
    int cnt = 0;
    cin >> M >> N;
    for (int i = M; i <= N; i++) {
        if (isPrime(i)) {
            sum += i;
            if (i < min) min = i;
            cnt++;
        }
    }
    if (cnt) {
        cout << sum << '\n' << min;
    }
    else cout << -1;
    
}