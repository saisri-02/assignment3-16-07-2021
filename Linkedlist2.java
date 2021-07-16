import java.util.*;
public class Linkedlist2
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
LinkedList l=new LinkedList();
int n;
do
{
System.out.println("1.Begin Insert");
System.out.println("2.End Insert");
System.out.println("3.Position Insert");
System.out.println("4.Begin Delete");
System.out.println("5.End Delete");
System.out.println("6.Position Delete");
System.out.println("7.Display");
System.out.println("8.Exit");
System.out.println("Enter your choice : ");
n=sc.nextInt();
switch(n)
{
case 1:
System.out.println("Enter element to insert at first : ");
int a=sc.nextInt();
l.addFirst(a);
System.out.println(l);
break;
case 2:
System.out.println("Enter element to insert at last : ");
int b=sc.nextInt();
l.addLast(b);
System.out.println(l);
break;
case 3:
System.out.println("Enter element to insert at position : ");
int c=sc.nextInt();
System.out.println("Enter index value : ");
int m=sc.nextInt();
l.add(m,c);
System.out.println(l);
break;
case 4:
System.out.println("Enter element to delete at first : ");
l.removeFirst( );
System.out.println(l);
break;
case 5:
System.out.println("Enter element to delete at last : ");
l.removeLast( );
System.out.println(l);
break;
case 6:
System.out.println("Enter the position of element to delete :");
int f=sc.nextInt();
l.remove(f);
System.out.println(l);
break;
case 7:
for(int i=0;i<l.size();i++)
System.out.println(l.get(i)+" ");
break;
case 8:
System.exit(n);
}
}while(n<9);
}
}

output:

1.Begin Insert
2.End Insert
3.Position Insert
4.Begin Delete
5.End Delete
6.Position Delete
7.Display
8.Exit
Enter your choice : 
1
Enter element to insert at first : 
10
[10]
1.Begin Insert
2.End Insert
3.Position Insert
4.Begin Delete
5.End Delete
6.Position Delete
7.Display
8.Exit
Enter your choice : 
2
Enter element to insert at last : 
20
[10, 20]
1.Begin Insert
2.End Insert
3.Position Insert
4.Begin Delete
5.End Delete
6.Position Delete
7.Display
8.Exit
Enter your choice : 
3
Enter element to insert at position : 
1
Enter index value : 
1
[10, 1, 20]
1.Begin Insert
2.End Insert
3.Position Insert
4.Begin Delete
5.End Delete
6.Position Delete
7.Display
8.Exit
Enter your choice : 
1
Enter element to insert at first : 
25
[25, 10, 1, 20]
1.Begin Insert
2.End Insert
3.Position Insert
4.Begin Delete
5.End Delete
6.Position Delete
7.Display
8.Exit
Enter your choice : 
6
Enter the position of element to delete :
3
[25, 10, 1]
1.Begin Insert
2.End Insert
3.Position Insert
4.Begin Delete
5.End Delete
6.Position Delete
7.Display
8.Exit
Enter your choice : 
7
25 
10 
1 
1.Begin Insert
2.End Insert
3.Position Insert
4.Begin Delete
5.End Delete
6.Position Delete
7.Display
8.Exit
Enter your choice : 
8
