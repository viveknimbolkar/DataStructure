
// https://www.codechef.com/problems/FLOW001
#include<stdio.h>

int main(){

    int T;
    int A,B;
    scanf("%d",&T);

    if((T>=0) && (T<=1000)){

        for (int i = 0; i < T; i++) {

            scanf("%d",&A);
            scanf("%d",&B);

            if((A >= 0 && A <= 10000) && (B  >= 0 && B <= 10000)){
                printf("%d\n",A+B);
            }
        }

    }

    return 0;
}