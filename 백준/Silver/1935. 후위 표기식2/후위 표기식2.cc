#include <bits/stdc++.h>
using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(0);
  
  int n;
  string exp;
  cin >> n >> exp;

  vector<int> v(n);
  stack<double> st;

  for (int i = 0; i < n; i++) {
    cin >> v[i];
  }
  for (int i = 0; i <exp.length(); i++) {
    if(exp[i] >= 'A' && exp[i] <= 'Z') { // 알파벳은 숫자로 변환해서 push
      st.push(v[exp[i] - 'A']);
    }
    else {
      if (!st.empty()) //stack에 뭔가 있을 때
      {
        double tmp = st.top();
        st.pop();
        if(exp[i] == '+'){
          tmp = st.top() + tmp;
        }
        else if (exp[i] == '-') {
          tmp = st.top() - tmp;
        }
        else if (exp[i] == '/') {
          tmp = st.top() / tmp;
        }
        else if (exp[i] == '*') {
          tmp = st.top() * tmp;
        }
        st.pop();
        st.push(tmp);
      }
    }
  }
  cout << fixed;
  cout.precision(2);
  cout << st.top() << '\n';

  return 0;
}