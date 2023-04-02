#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(0);
    unordered_set<string> s;
    int n;
    cin >> n;
    for(int i = 0; i < n; i++) {
        string name, state;
        cin >> name >> state;
        if (state == "enter") s.insert(name);
        else s.erase(name);
    }
    vector<string> vec(s.begin(), s.end());
    sort(vec.begin(), vec.end(), greater<string>());
    for(auto a: vec) cout << a << '\n';


    return 0;
}