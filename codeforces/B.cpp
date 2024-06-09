/*
    https://codeforces.com/contest/1739/problem/B
*/

#include <bits/stdc++.h>
using namespace std;

#define int long long


void solve();

int32_t main() {
    int tc = 1;
    cin >> tc;
    while (tc > 0) {
        solve();
        --tc;
    }
    return 0;
}


void solve() {
    int n; cin >> n;
    vector<int> in(n);
    for (auto &  i : in) cin >> i;
    vector<int> ans = {in[0]};
    for (int i = 1; i < n; ++i) {
        int temp = ans.back();
        if (in[i] == 0) {
            ans.push_back(temp);
            continue;
        }
        if (temp - in[i] >= 0) {
            cout << -1 << endl;
            return;
        }
        temp += in[i];
        ans.push_back(temp);
    }   
    for (auto & i : ans) {
        cout << i << " ";
    }
}