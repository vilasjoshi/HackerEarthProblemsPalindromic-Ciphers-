#include<iostream>
#include<cstdlib>
#include<cstring>

using namespace std;
/*
Function to check if String is Palindrome or Not
*/
int isPallindrome(string s)
{
    int n=s.length();
    
    for(int i=0, j=n-1;i<=j;i++, j--){
        if(s[i]!=s[j])
            return 0; //If not Palindrome return 0 to caller 
        
    }
    return 1; //else return 1
}
/*
Fuction for calculating the value of string, if it is not Palindromr
*/
long value_of_string(string str){
    long value=1;
    int len=str.length();
    for(int i=0; i<len; i++){
        value*=(int(str[i])-96);
    }
    
    return(value);
}

int main(){
    
    int t;    //test case input
    cin>>t;
    while(t>0){
        
        string str;
        cin>>str;
        int result= isPallindrome(str); // to check if string is Palindrome of not
        if(result==1)     cout<<"Pallindrome\n";
        else cout<<value_of_string(str);  //if not Palindrome then calculate value
        t--;
        
    }
    
    return 0;
}
