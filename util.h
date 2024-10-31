#pragma once

#define clg(x)                                                                                                         \
    cerr << __LINE__ << ": " #x << " = ";                                                                   \
    printc(x);                                                                                                         \
    cerr << endl;

template <typename T> void printc(const vector<T> &container)
{
    cerr << "[";
    for (auto it = container.begin(); it != container.end(); ++it)
    {

        if (it == prev(container.end()))
        {
            cerr << *it;
        }
        else
        {
            cerr << *it << ", ";
        }
    }
    cerr << "]";
}
template <typename T> void printc(const list<T> &container)
{
    cerr << "[";
    for (auto it = container.begin(); it != container.end(); ++it)
    {

        if (it == prev(container.end()))
        {
            cerr << *it;
        }
        else
        {
            cerr << *it << ", ";
        }
    }
    cerr << "]";
}
template <typename T> void printc(const deque<T> &container)
{
    cerr << "[";
    for (auto it = container.begin(); it != container.end(); ++it)
    {

        if (it == prev(container.end()))
        {
            cerr << *it;
        }
        else
        {
            cerr << *it << ", ";
        }
    }
    cerr << "]";
}
template <typename T> void printc(const set<T> &container)
{
    cerr << "{";
    for (auto it = container.begin(); it != container.end(); ++it)
    {

        if (it == prev(container.end()))
        {
            cerr << *it;
        }
        else
        {
            cerr << *it << ", ";
        }
    }
    cerr << "}";
}
template <typename T> void printc(const unordered_set<T> &container)
{
    cerr << "{";
    for (auto it = container.begin(); it != container.end(); ++it)
    {

        if (it == prev(container.end()))
        {
            cerr << *it;
        }
        else
        {
            cerr << *it << ", ";
        }
    }
    cerr << "}";
}


void printc(string &s)
{
    cerr << "\"" << s << "\"";
}

void printc(int t)
{
    cerr << t;
}
void printc(ll t)
{
    cerr << t;
}

void printc(ull t)
{
    cerr << t;
}

void printc(u8 t)
{
    cerr << (int)t;
}

void printc(i8 t)
{
    cerr << (int)t;
}

void printc(ush t)
{
    cerr << t;
}
void printc(ish t)
{
    cerr << t;
}

void printc(uint t)
{
    cerr << t;
}

void printc(float t)
{
    cerr << t;
}

void printc(double t)
{
    cerr << t;
}

void printc(long double t)
{
    cerr << t;
}

template <typename T, typename U> void printc(pair<T, U> &p)
{
    cerr << "(" << p.first << ", " << p.second << ")";
}
