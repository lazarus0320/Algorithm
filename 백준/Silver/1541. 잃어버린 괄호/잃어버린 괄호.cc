#include <bits/stdc++.h>
using namespace std;

int main() {
  string input;
  cin >> input;
  string tmp;
  int ans = 0;
  bool isMinus = false;
  
  for (int i = 0; i <= input.size(); i++) {
    if (input[i] == '+' || input[i] == '-' || i == input.size()) { // 연산자 혹은 마지막 일 경우. 
      if (isMinus) ans -= stoi(tmp);  // - 이후에 들어온 모든 정수는 빼줘야 함
      else ans += stoi(tmp); // -가 처음 들어왔을 경우 그 앞에 있었던 정수는 더해줘야함
      tmp = ""; // 새로운 정수를 받기 위해 초기화
    }

    else {  // 일반 정수가 들어올 경우 tmp에 string 형태로 저장.
      tmp += input[i];
    }

    if (input[i] == '-') {  // -가 들어오면 그 다음에 들어올 모든 정수는 빼주어야 함.
      isMinus = true;
    }
  }
  
  cout << ans;

  return 0;
}

