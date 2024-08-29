#include <bits/stdc++.h>
using namespace std;

#define all(x) (x).begin(), (x).end()
#define endl '\n'
#define MOD 1000000007

#if defined(LOCAL)
#define sv(a) cerr << "[Line " << __LINE__ << ": " << #a << " = " << a << "]" << '\n';
#include <chrono>
using namespace std::chrono;
#else
#define sv(a)
#endif

using u8 = uint8_t;
using i8 = int8_t;
using ush = uint16_t;
using ish = int16_t;
using uint = uint32_t;
using ull = uint64_t;
using ll = int64_t;
using ld = long double;
using str = string;

template <typename T> using vt = vector<T>;
using pll = pair<ll, ll>;
using mll = map<ll, ll>;
using vvll = vector<vector<ll>>;
using vpll = vector<pair<ll, ll>>;
using sll = set<ll>;
using lll = list<ll>;
using qll = queue<ll>;
using dqll = deque<ll>;
template <size_t _n> using ary = array<ll, _n>;
using vll = vector<ll>;

template <typename T> void readv(vector<T> &v)
{
    for (auto &i : v)
        cin >> i;
}
void scs()
{
}
template <typename T, typename... Types> void scs(T &arg, Types &...args)
{
    cin >> arg;
    scs(args...);
}

void solve()
{
    
}

int main()
{
    ios::sync_with_stdio(0);
    cin.tie(0);
    int s = 1;
    int e = 1;
    cin >> e;
    while (s <= e)
    {
#if defined(LOCAL)
        auto start = high_resolution_clock::now();
        solve();
        auto end = high_resolution_clock::now();
        auto et = duration_cast<milliseconds>(end - start);
        cerr << "[Test Case #" << s << ": " << et << "]" << endl;
        ++s;
#else
        solve();
        ++s;
#endif
    }
    return 0;
}
