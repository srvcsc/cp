#include <bits/stdc++.h>

using namespace std;

void srvkr() {
    int n; cin >> n;
    vector<int> v(n);
    for (auto & i : v) {
        cin >> i;
    }
    int ans = -1;
    unordered_set<int> us;
    for (int i = n - 1; i >= 1; --i) {
        if (us.find(v[i]) != us.end()) {
            continue;
        } else {
            us.insert(v[i]);
        }
        int j = i;
        while  (j >= 0 && __gcd(v[i], v[j]) != 1) {
            --j;
        }
        if (j >= 0) {
            if (ans < (i + j + 2)) {
                ans = i + j + 2;
            }
        }
    }
    cout << ans << '\n';
}

int32_t main() {
    int tc;
    cin >> tc;
    while (tc--) {
        srvkr();
    }
    return 0;
}