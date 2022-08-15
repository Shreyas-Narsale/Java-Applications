
#include<stdio.h>
#include<stdlib.h>//for atoi() - accsi to int method

int main(int argc,char *argv[])
{
	printf("Nameof Excuatble is:%s\n",argv[0]);
	printf("Nameof commond lien argumnets is:%d\n",argc);
	printf("Jay Ganesh..\n");
	int ans=atoi(argv[1])+atoi(argv[2]);
	return 0;
}
	