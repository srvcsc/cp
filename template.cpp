#include <bits/stdc++.h>
using namespace std;

#define int long long
#define MOD 1000000007
#define 

void read(vector<int>&);
void write(vector<int>&);


void solve() {
    
}

int32_t main() {
    int tc = 1;
    cin >> tc;
    while (tc > 0) {
        solve();
        --tc;
    }
    return 0;
}

void read(vector<int>& v) {
    for (auto& i : v) {
        cin >> i;
    }
}

void write(vector<int>& v) {
    cout << "[";
    for (int i = 0; i < v.size(); ++i) {
        cout << v[i] << (i + 1 == v.size() ? "" : ", ");
    }
    cout << "]";
    cout << endl;
}