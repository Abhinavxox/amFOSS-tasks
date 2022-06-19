#include <stdio.h>
#include <string.h>


void printStairs(int length){
    printf("%d",length);
    for(int i = length; i>0; i--){
        char line[100] = "";
        for(int j=i; j>0; j--){
            strcat(line," ");
        }
        for(int k=9-i; k>0; k--){
            strcat(line,"#");
        }
        printf("\n%s",line);
    }
}

int main(void){
    int length;
    printf("***Welcome to MARIO-stairs\n");
    printf("Enter height: ");
    scanf("%d", &length);
    if(length>0 && length<9){
        printStairs(length);
    }
    else{
        printf("Invalid input. TRY AGAIN!");
    }
}