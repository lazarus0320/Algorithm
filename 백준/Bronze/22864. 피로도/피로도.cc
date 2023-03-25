#include <iostream>
using namespace std;

int main() {
    int f = 0, w = 0;
    int A, B, C, M;
    cin >> A >> B >> C >> M;
    for (int i = 0; i < 24; i++) {
      if ( (M - f) < A ) {
        f -= C;
        if ( f < 0 ) f = 0;
      }
      else {
        f += A;
        w += B;
      }
    }
    cout << w << "\n";
    return 0;
}
