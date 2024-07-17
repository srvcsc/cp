#include <algorithm>
#include <bitset>
#include <cstdint>
#include <iostream>
#include <map>
#include <set>
#include <string>
#include <utility>
#include <vector>

using namespace std;

#define all(x) (x).begin(), (x).end()
#define endl '\n'
#define sv(a) cerr << "{ " << __LINE__ << ": " << #a << " = " << a << " }" << '\n';
#define MOD 1000000007

using u8 = uint8_t;
using i8 = int8_t;
using ush = uint16_t;
using ish = int16_t;
using uint = uint32_t;
using ull = uint64_t;
using ill = int64_t;
using str = string;

ill bexp(ill a, ill b);
ill bmexp(ill a, ill b, ill mod);
void scs();
template <typename T, typename... Types> void scs(T &a, Types &...args);

void solve()
{
    
}

int main()
{
    int tc = 1;
    cin >> tc;
    while (tc > 0)
    {
        solve();
        --tc;
    }
    return 0;
}









/**************************************************************************************************** */
/**************************************************************************************************** */

ill bexp(ill a, ill b)
{
    ill res = 1;
    while (b > 0)
    {
        if (b & 1)
            res *= a;
        a *= a;
        b >>= 1;
    }
    return res;
}

ill bmexp(ill a, ill b, ill mod)
{
    ill res = 1;
    a %= mod;
    while (b > 0)
    {
        if (b & 1)
        {
            res *= a;
            res %= mod;
        }
        a *= a;
        a %= mod;
        b >>= 1;
    }
    return res;
}

void scs()
{
}
template <typename T, typename... Types> void scs(T &a, Types &...args)
{
    cin >> a;
    scs(args...);
}
