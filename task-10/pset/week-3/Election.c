#include <stdio.h>
#include <string.h>
#include <ctype.h>

struct candidate{
    int id;
    char name[100];
    int no_of_votes;
};

void main()
{
  //initialising the candidates
  //alice
  struct candidate alice;
  alice.id = 0;
  strcpy(alice.name, "ALICE");
  alice.no_of_votes = 0;
   //bob
   struct candidate bob;
   bob.id = 1;
   strcpy(bob.name, "BOB");
   bob.no_of_votes = 0;
   //charlie
   struct candidate charlie;
   charlie.id = 2;
   strcpy(charlie.name, "CHARLIE");
   charlie.no_of_votes = 0;

    int no_of_voters;
    printf("Enter the no of voters: ");
    scanf("%d",  &no_of_voters);
    if(!isdigit(no_of_voters)){
        printf("INVALID");
        return;
    }
    for(int i=0; i<no_of_voters; i++){
        char input[50];
        printf("Vote %d : ", i+1);
        scanf("%s", input);
        if(strcmp(input,"alice") == 0){
            alice.no_of_votes++;
        }
        else if(strcmp(input,"bob") == 0){
            bob.no_of_votes++;
        }
        else if(strcmp(input,"charlie") == 0){
            charlie.no_of_votes++;
        }
        else{
            printf("INVALID");
            return;
        }
    }

    if(alice.no_of_votes>bob.no_of_votes && alice.no_of_votes>charlie.no_of_votes){
        printf("%s", alice.name);
    }
    else if(bob.no_of_votes>alice.no_of_votes && bob.no_of_votes>charlie.no_of_votes){
        printf("%s", bob.name);
    }
    else if(charlie.no_of_votes>alice.no_of_votes && charlie.no_of_votes>bob.no_of_votes){
        printf("%s", charlie.name);
    }
    else{
        printf("It's a tie");
    }



}