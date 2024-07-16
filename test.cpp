#include <iostream>
#include <vector>
#include <cstdint>
#include <string>
#include <algorithm>
#include <map>
#include <set>
#include <utility>
#include <bitset>


using namespace std;

#define endl '\n'
#define all(x) (x).begin(), (x).end()
#define MOD 1000000007
#define repf(i, a, b) for (int i = (a); i < (b); ++(i)) 
#define repb(i, a, b) for (int i = (a); i > (b); --(i)) 
#if defined(__srvkr)
#define sv(a) cerr << "{" << __LINE__ << ": "<< #a << " = " << a << "}" << endl
#else 
#define sv(a)
#endif

using u8 = uint8_t;
using i8 = int8_t;
using u16 = uint16_t;
using i16 = int16_t;
using u32 = uint32_t;
using u64 = uint64_t;
using i64 = int64_t;
using str = string;


/**************************************************************************************************** */
/************************************************************************************************* */

template <typename T> using vt = vector<T>;



template <typename T> void readv(vt<T>& v) {
    for (auto &i: v) {
        cin >> i;
    }
}



template <typename T> void printv(vt<T>& v) {
    cerr << "[";
    int n = v.size();
    repf(i, 0, n) {
        cerr << v[i] << (i == n - 1 ? "" : ", ");
    }
    cerr << "]" << endl;
}


void scs() {}
template <typename T, typename... Types>

void scs(T &a1, Types&... args) {
    cin >> a1;
    scs(args...);
}

/********************************************************************************************** */
/************************************************************************************************ */

void solve() { 
  int a = 32; sv(a)   
}



int main() {
    int tc = 1;
    // cin >> tc;
    while (tc > 0) {
        solve();
        --tc;
    }
    return 0;
}


