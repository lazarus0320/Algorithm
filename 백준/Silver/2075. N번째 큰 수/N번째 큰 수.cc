#include <iostream>
#include <queue>
using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);
    int N;
    cin >> N;
    priority_queue<int, vector<int>, greater<int>> pq;

    for (int i = 0; i < N; i++) {
        int num;
        cin >> num;
        pq.push(num);
    }

    for (int i = N; i < N*N; i++) {
        int num;
        cin >> num;
        if (num > pq.top()) {
            pq.pop();
            pq.push(num);
        }
    }
    cout << pq.top();
}