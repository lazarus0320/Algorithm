#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(0);
    unordered_map<string, int> m;
    unordered_map<int, string> m2;
    int N, M;
    cin >> N >> M;
    for (int i = 1; i <= N; i++){
        string name;
        cin >> name;
        m[name] = i;
        m2[i] = name;
    }
    while(M--) {
        string input;
        cin >> input;
        stringstream ss(input);
        int num;
        if(ss >> num) {
            cout << m2[stoi(input)] << '\n';
        }
        else cout << m[input] << '\n';
    }
    return 0;
}