using namespace std;
char filstyle(){
    char ch;
    cin >> ch;
    while (ch != 'c')
    {
        cout << "Invalid symbol,try again: ";
        cin >> ch;
    }
    return ch;
}
void test(char expected,char result){
     if(expected==result)
     {
         cout<<"Passed";
     }
}
void runtest()
{
    test('c',filstyle());
}
