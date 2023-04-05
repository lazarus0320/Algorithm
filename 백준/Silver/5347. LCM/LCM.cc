#include <bits/stdc++.h>
using namespace std;

long long gcd(long long a, long long b) {
    if (b == 0) return a;
    return gcd(b, a%b);
}

long long lcd(long long a, long long b) {
    return a  / gcd(a, b) * b;
}

int main() {
    int n;
    cin >>n;
    while(n--){
        int a, b;
        cin >> a >> b;
        cout << lcd(a, b) << '\n';
    }
}