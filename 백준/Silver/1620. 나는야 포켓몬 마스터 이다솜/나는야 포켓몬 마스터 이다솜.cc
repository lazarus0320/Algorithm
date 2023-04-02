#include <bits/stdc++.h>
using namespace std;
const int MAX = 100002;
string arr[MAX];
int main() {
    ios::sync_with_stdio(false);
    cin.tie(0);
    unordered_map<string, int> m;
    

    int N, M;
    cin >> N >> M;

    for (int i = 1; i <= N; i++){ 
        cin >> arr[i];
        m[arr[i]] = i;
    }
    for (int i = 1; i <= M; i++) {
        string val;
        cin >> val;
        if (isdigit(val[0])) {
            cout << arr[stoi(val)] << '\n';
        }
        else cout << m[val] << '\n';
    }
    return 0;
}