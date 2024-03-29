#include<bits/stdc++.h>

using namespace std;

map<string, int> mp;

int main(){
    ios::sync_with_stdio(false);
    cin.tie(0);

    string s;
    int total = 0;
    while(getline(cin, s)) {
        mp[s] += 1; 
        total += 1;
    }

    cout.precision(4);
    cout << fixed;
    for(auto &[k, v]: mp) {
        cout << k << ' ' << v * 100.0 / total << '\n';
    }

    return 0;
}