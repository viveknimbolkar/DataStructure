// https://www.codechef.com/problems/HS08TEST

#include<stdio.h>
int main()
{
int withdrawl_amt;
float initial_bal;
scanf("%d %f",&withdrawl_amt,&initial_bal);
if(withdrawl_amt %5==0 &&(initial_bal>(withdrawl_amt+0.5)))
{
printf("%.2f",(initial_bal-(withdrawl_amt+0.5)));
}
else
{
printf("%.2f",initial_bal);
}
return 0;
}