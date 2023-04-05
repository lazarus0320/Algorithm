#include <bits/stdc++.h>
using namespace std;

long long gcd(long long a, long long b) {
    if (b==0) return a;
    return gcd(b, a % b);
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(0);
    int cycle;
    cin >> cycle;
    while (cycle--){
        int num;
        cin >> num;
        int arr[num] = {0};
        long long sum = 0;
        for (int i = 0; i < num; i++) {
            cin >> arr[i];
        }
        for (int i = 0; i < num; i++) {
            for (int j = i+1; j < num; j++) {
                sum += gcd(arr[i], arr[j]);
            }
        }
        cout << sum << '\n';
    }
}