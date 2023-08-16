#include <string>
#include <iostream>
using namespace std;

int main() {
    string hora = "20:55";

    cout << hora.substr(0,2) << endl;
    cout << hora.substr(3,2) << endl;
    return 1;
}