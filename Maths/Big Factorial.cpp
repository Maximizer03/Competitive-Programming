#include"bits/stdc++.h"
#define int long long
using namespace std;

// valid till 2000!

void mult(vector<int>&a, int x, int &n) {
	int carry = 0;
	for (int i = 0; i < n; i++) {
		int product = a[i] * x + carry;
		a[i] = product % 10;
		carry = product / 10;
	}
	while (carry > 0) {
		a[n] = carry % 10;
		carry /= 10;
		n++;
	}
}

void bigFactorial(int num) {
	vector<int>a(num * num, 0);
	a[0] = 1;
	int n = 1;
	for (int i = 2; i <= num; i++) {
		mult(a, i, n);
	}
	for (int i = n - 1; i >= 0; i--) {
		cout << a[i];
	}
	cout << endl;
}
signed main() {
	int n;
	cin >> n;
	bigFactorial(n);
	return 0;
}
