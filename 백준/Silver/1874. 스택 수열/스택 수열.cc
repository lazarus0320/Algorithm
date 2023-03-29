#include <bits/stdc++.h>
using namespace std;
int main(){
    ios::sync_with_stdio(0);
    cin.tie(0);
    stack<int> S;
    vector<char> V;
    int num;
    int cnt = 1;
    cin >> num;
    while (num--) {
        int val;
        cin >> val;
        while (cnt <= val){
            S.push(cnt);
            V.push_back('+');
            cnt += 1;
        }
        if (val == S.top()){
            S.pop();
            V.push_back('-');
        }
        else{
            cout << "NO";
            return 0;
        }
    }

    for (int i = 0; i < V.size(); i++){
        cout << V[i] << '\n';
    }
}