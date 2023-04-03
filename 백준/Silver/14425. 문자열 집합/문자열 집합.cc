#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);
    int N, M;
    int ans = 0;
    cin >> N >> M;
    unordered_set<string> S(N);
    string arr[M];
    for (int i = 0; i < N; i++) {
        string word;
        cin >> word;
        S.insert(word);
    }
    for (int i = 0; i < M; i++) {
        string word;
        cin >> word;
        if( S.find(word) != S.end() ) {
            ans++;
        }
    }
    cout << ans;
    return 0;
}