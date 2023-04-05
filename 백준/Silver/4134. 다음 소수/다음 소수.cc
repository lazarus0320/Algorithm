#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

bool isPrime(ll n) {
    if (n < 2) return false;
    else {
        for (ll i = 2; i * i <= n; i++) {
            if (n % i == 0 ) return false;
        }
    }
    return true;
}

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    int cycle;
    cin >> cycle;

    while(cycle--){
        ll num;
        cin >> num;
        while(!isPrime(num)) {
            num++;
        }
        cout << num << '\n';
    }
    return 0;
}