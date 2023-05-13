#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include <bits/stdc++.h>
using namespace std;

int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */ 
    int num;
    float sum=0;
    cin>>num;
    for(float i=1;i<=num;i++){
    sum += (i * (i+1)) / (i+(i+1));
    }
    cout<<setprecision(5)<<fixed<<sum;
    return 0;
}
