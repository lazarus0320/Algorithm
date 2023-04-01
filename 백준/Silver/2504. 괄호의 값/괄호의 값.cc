#include <bits/stdc++.h>

using namespace std;

string s;

int ans=0, tmp=1;
int main() {
    ios::sync_with_stdio(false);
    cin.tie(0);
    getline(cin, s);
    bool check = true;

    stack<char> st;

    for (int i = 0; i < s.length(); i++) {
        if(s[i] == '(') {
            tmp *= 2;
            st.push('(');
        }
        else if (s[i] == ')') {
            if(st.empty() || st.top() != '(') {
                check = false;
                break;
            }
            else {
                if (s[i-1] == '(') {
                    ans += tmp;
                }
                st.pop();
                tmp /= 2;
            }
        }
        else if(s[i] == '[') {
            st.push(s[i]);
            tmp *= 3;
        }
        else if(s[i] == ']') {
            if (st.empty() || st.top() != '[') {
                check = false;
                break;
            }
            else {
                if(s[i-1] == '[') {
                    ans += tmp;
                }
                st.pop();
                tmp /= 3;
            }
        }
    }
    if (check == false || !st.empty()) {
        cout << 0;
    }
    else {
        cout << ans;
    }
    return 0;
}