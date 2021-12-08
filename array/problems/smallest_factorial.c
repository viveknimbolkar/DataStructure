//https://www.codechef.com/problems/FCTRL2

#include <stdio.h>

int fact(int)

int main() {

	scanf("%d",&a);

	for(i = 0; i < a; i++){
	    scanf("%d",&b);
	    fact(b);
	}

	return 0;
}

int fact(int n){

    if( n == 0){
        return 1;
    }

    return n*fact(n);
}

