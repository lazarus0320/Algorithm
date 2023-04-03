#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);
    
    priority_queue<int> Q;
    int N;
    cin >> N;
    while(N--) {
        int val;
        cin >> val;
        if (val == 0) {
            if (Q.empty()) {
                cout << 0 << '\n';
            }
            else {
                cout << Q.top() << '\n';
                Q.pop();
            }
            
        }
        else {
            Q.push(val);
        }
    }
    return 0;
}